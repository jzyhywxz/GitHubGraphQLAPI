package com.zzw.github.graphql.spider;

import com.zzw.tools.io.SimpleTextWriter;
import com.zzw.tools.network.HttpAgent;

import java.util.List;
import java.util.Scanner;

/**
 * Created by zzw on 2018/6/9.
 */
public class GGSpider {
    private HttpAgent mHttpAgent;
    private GitHubGraphQLParser mHtmlParser;
    private RecordQueue mRecordQueue;
    private SimpleTextWriter mWriter;
    private String mDirectory;

    public GGSpider(String url, String directory) {
        mHttpAgent = new HttpAgent();
        mHttpAgent.setHeader(new String[]{"Accept-Encoding", "gzip, deflate, br"});
        mHtmlParser = new GitHubGraphQLParser(url);
        mRecordQueue = new RecordQueue();
        mRecordQueue.enqueue(url);
        mWriter = new SimpleTextWriter();
        mDirectory = directory;
    }

    public void execute() {
        int count = 0;

        while (!mRecordQueue.isWaitingEmpty()) {
            String url = mRecordQueue.dequeue();

            try {
                // connecting the network
                mHttpAgent.connect4get(url);
                String rawHtml = mHttpAgent.rawHtml();

                // parsing the html page
                mHtmlParser.parse(url, rawHtml);

                // adding new links
                List<String> newLinks = mHtmlParser.getLinks();
                if ((newLinks != null) && (newLinks.size() > 0)) {
                    for (String newLink : newLinks) {
                        mRecordQueue.enqueue(newLink);
                    }
                }

                // generating the source file
                String link = mHtmlParser.getLink();
                String path = mHtmlParser.getPath();
                String code = mHtmlParser.getCode();

                if ((path != null) && (code != null)) {
                    path = mDirectory + path;
                    mWriter.open(path);
                    mWriter.println(code);
                }

                // printing the log information
                ++count;
                int waitingSize = mRecordQueue.waitingSize();
                int visitedSize = mRecordQueue.visitedSize();
                System.out.printf("[%3d] (waiting:%3d / visited:%3d) link:%s -> path:%s\n",
                        count, waitingSize, visitedSize, link, path);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                mHttpAgent.disconnect();
                mWriter.close();
            }
        }
    }

    public static void main(String[] args) {
        String url;
        String directory;
        if ((args != null) && (args.length == 2)) {
            url = args[0];
            directory = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input the webpage entrance: ");
            url = scanner.next();
            System.out.print("Please input the target directory: ");
            directory = scanner.next();
        }

//        GGSpider spider = new GGSpider(url, directory);
//        spider.execute();

        String interfaceManagerPath = directory + GitHubGraphQLParser.SRCFILE_PREFIX + "interfaces/";
        GitHubGraphQLGenerator.generateManager(interfaceManagerPath, "InterfaceManager");
        System.out.println("generate interface manager -> " + interfaceManagerPath);

        String unionManagerPath = directory + GitHubGraphQLParser.SRCFILE_PREFIX + "unions/";
        GitHubGraphQLGenerator.generateManager(unionManagerPath, "UnionManager");
        System.out.println("generate union manager -> " + unionManagerPath);

        String mutationPath = directory + GitHubGraphQLParser.SRCFILE_PREFIX + "mutations/";
        GitHubGraphQLGenerator.generateMutation(mutationPath, "Mutation");
        System.out.println("generate mutation -> " + mutationPath);

        String queryEntryPath = directory + GitHubGraphQLParser.SRCFILE_PREFIX + "query/";
        GitHubGraphQLGenerator.generateEntry(queryEntryPath, "QueryEntry");
        System.out.println("generate query entry -> " + queryEntryPath);

        String mutationEntryPath = directory + GitHubGraphQLParser.SRCFILE_PREFIX + "mutations/";
        GitHubGraphQLGenerator.generateEntry(mutationEntryPath, "MutationEntry");
        System.out.println("generate mutation entry -> " + mutationEntryPath);

        String metadataPath = directory + GitHubGraphQLParser.SRCFILE_PREFIX + "unions/";
        GitHubGraphQLGenerator.generateMetadata(unionManagerPath, "Metadata");
        System.out.println("generate metadata -> " + metadataPath);
    }
}
