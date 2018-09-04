package com.zzw.github.graphql.builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by zzw on 2018/6/10.
 */
public class GGBuilder {
    private static final String PREVIOUS_LEVEL = "..";
    private static final String CURRENT_LEVEL = ".";

    private GraphQLBuilder mBuilder = new GraphQLBuilder();

    private GraphQLNode mRootNode;
    private GraphQLNode mCurrNode;
    private LinkedList<GraphQLNode> mSavedCurrNodes = new LinkedList<GraphQLNode>();

    public GGBuilder(String nodeName) {
        mRootNode = GraphQLNode.asNode(nodeName);
        mCurrNode = mRootNode;
    }

    public String visualize() {
        mBuilder.prepare(mRootNode);
        return mBuilder.visualize();
    }

    public String serialize() {
        mBuilder.prepare(mRootNode);
        return mBuilder.serialize();
    }

    public GGBuilder save() {
        if (mCurrNode != null) {
            mSavedCurrNodes.addFirst(mCurrNode);
        }
        return this;
    }

    public GGBuilder restore() {
        if (mSavedCurrNodes.size() > 0) {
            mCurrNode = mSavedCurrNodes.removeFirst();
        }
        return this;
    }

    public GGBuilder f(GraphQLNode node) {
        GraphQLNode oldCurrNode = mCurrNode;
        m(node);
        mCurrNode = oldCurrNode;
        return this;
    }

    public GGBuilder f(String input) {
        GraphQLNode oldCurrNode = mCurrNode;
        m(input);
        mCurrNode = oldCurrNode;
        return this;
    }

    public GGBuilder m(GraphQLNode node) {
        if (node != null) {
            GraphQLNode newNode = addNode(mCurrNode, node);
            mCurrNode = newNode;
        }
        return this;
    }

    public GGBuilder m(String input) {
        if ((input == null) || (input.length() <= 0)) {
            return this;
        }

        if (input.startsWith("/")) {
            mCurrNode = mRootNode;
        }

        List<String> diffLevelNodes = findDiffLevelNodes(input);
        if ((diffLevelNodes != null) && (diffLevelNodes.size() > 0)) {
            for (String diffLevelNode : diffLevelNodes) {
                if (PREVIOUS_LEVEL.equals(diffLevelNode)) {
                    mCurrNode = gotoPreviousLevel(mCurrNode);
                } else if (CURRENT_LEVEL.equals(diffLevelNode)) {
                    // do nothing
                } else {
                    List<String> sameLevelNodes = findSameLevelNodes(diffLevelNode);
                    if ((sameLevelNodes != null) && (sameLevelNodes.size() > 0)) {
                        List<GraphQLNode> addNodes = new ArrayList<GraphQLNode>();

                        for (String sameLevelNode : sameLevelNodes) {
                            // create graphQL node
                            String nodeName = findNodeName(sameLevelNode);
                            GraphQLNode node = GraphQLNode.asNode(nodeName);

                            // add arguments to node
                            List<String> nodeAttrs = findNodeAttrs(sameLevelNode);
                            if ((nodeAttrs != null) && (nodeAttrs.size() > 0)) {
                                for (String nodeAttr : nodeAttrs) {
                                    String attrName = findAttrName(nodeAttr);
                                    String attrValue = findAttrValue(nodeAttr);
                                    GraphQLArgument<com.zzw.github.graphql.schema.scalars.String> argument = GraphQLArgument.asArgument(
                                            attrName,
                                            new com.zzw.github.graphql.schema.scalars.String(attrValue),
                                            null);
                                    node.addArgument(argument);
                                }
                            }

                            // record node that might be added
                            addNodes.add(node);
                        }

                        mCurrNode = gotoNextLevel(mCurrNode, addNodes);
                    }
                }
            }
        }

        return this;
    }

    public GGBuilder a(GraphQLArgument argument) {
        if (argument != null) {
            GraphQLArgument newArgument = argument.clone();
            mCurrNode.addArgument(newArgument);
        }
        return this;
    }

    public GraphQLNode asNode() {
        return mRootNode;
    }

    public static GraphQLNode newNode(String input) {
        if ((input == null) || (input.length() <= 0)) {
            return null;
        }

        GraphQLNode rootNode = null;
        GraphQLNode currNode = null;

        List<String> diffLevelNodes = findDiffLevelNodes(input);
        if ((diffLevelNodes != null) && (diffLevelNodes.size() > 0)) {
            for (String diffLevelNode : diffLevelNodes) {
                if (PREVIOUS_LEVEL.equals(diffLevelNode)) {
                    currNode = gotoPreviousLevel(currNode);
                } else if (CURRENT_LEVEL.equals(diffLevelNode)) {
                    // do nothing
                } else {
                    List<String> sameLevelNodes = findSameLevelNodes(diffLevelNode);
                    if ((sameLevelNodes != null) && (sameLevelNodes.size() > 0)) {
                        List<GraphQLNode> addNodes = new ArrayList<GraphQLNode>();

                        for (String sameLevelNode : sameLevelNodes) {
                            // create graphQL node
                            String nodeName = findNodeName(sameLevelNode);
                            GraphQLNode node = GraphQLNode.asNode(nodeName);

                            // add arguments to node
                            List<String> nodeAttrs = findNodeAttrs(sameLevelNode);
                            if ((nodeAttrs != null) && (nodeAttrs.size() > 0)) {
                                for (String nodeAttr : nodeAttrs) {
                                    String attrName = findAttrName(nodeAttr);
                                    String attrValue = findAttrValue(nodeAttr);
                                    GraphQLArgument<com.zzw.github.graphql.schema.scalars.String> argument = GraphQLArgument.asArgument(
                                            attrName,
                                            new com.zzw.github.graphql.schema.scalars.String(attrValue),
                                            null);
                                    node.addArgument(argument);
                                }
                            }

                            // record node that might be added
                            addNodes.add(node);
                        }

                        currNode = gotoNextLevel(currNode, addNodes);

                        if ((rootNode == null) && (currNode != null)) {
                            rootNode = currNode;
                        }
                    }
                }
            }
        }

        return rootNode;
    }

    private static GraphQLNode gotoPreviousLevel(GraphQLNode node) {
        if ((node == null) || (node.getParent() == null)) {
            return node;
        } else {
            return node.getParent();
        }
    }

    private static GraphQLNode gotoNextLevel(GraphQLNode currNode, List<GraphQLNode> addNodes) {
        if ((addNodes == null) || (addNodes.isEmpty())) {
            return currNode;
        }

        if (currNode == null) {
            return addNodes.get(addNodes.size() - 1);
        }

        GraphQLNode newNode = null;
        for (GraphQLNode addNode : addNodes) {
            if (addNode != null) {
                newNode = addNode(currNode, addNode);
            }
        }
        return newNode;
    }

    private static GraphQLNode addNode(GraphQLNode currNode, GraphQLNode addNode) {
        if ((currNode == null) || (addNode == null)) {
            return null;
        }

        Set<GraphQLNode> children = currNode.getChildren();
        if ((children != null) && (children.size() > 0)) {
            GraphQLNode existNode = null;
            for (GraphQLNode child : children) {
                if (child.getNodeName().equals(addNode.getNodeName())) {
                    existNode = child;
                    break;
                }
            }
            if (existNode != null) {
                return existNode;
            }
        }

        GraphQLNode newNode = addNode.clone();
        currNode.addNode(newNode);
        return newNode;
    }

    private static List<String> findDiffLevelNodes(String input) {
        List<String> result = new ArrayList<String>();

        Matcher matcher = Pattern.compile("/").matcher(input);
        int endIndex = 0;
        while (matcher.find()) {
            int begIndex = matcher.start();
            if (begIndex > endIndex) {
                result.add(input.substring(endIndex, begIndex));
            }
            endIndex = matcher.end();
        }
        if (input.length() > endIndex) {
            result.add(input.substring(endIndex));
        }

        return result;
    }

    private static List<String> findSameLevelNodes(String input) {
        List<String> result = new ArrayList<String>();

        Matcher matcher = Pattern.compile("\\w+(\\[.+?\\])?").matcher(input);
        while (matcher.find()) {
            int begIndex = matcher.start();
            int endIndex = matcher.end();
            if (endIndex > begIndex) {
                result.add(input.substring(begIndex, endIndex));
            }
        }

        return result;
    }

    private static String findNodeName(String input) {
        Matcher matcher = Pattern.compile("\\W").matcher(input);
        if (matcher.find()) {
            return input.substring(0, matcher.start());
        } else {
            return input;
        }
    }

    private static List<String> findNodeAttrs(String input) {
        List<String> result = new ArrayList<String>();

        Matcher matcher = Pattern.compile("@(\\w+)='.+?'").matcher(input);
        while (matcher.find()) {
            int begIndex = matcher.start();
            int endIndex = matcher.end();
            if (endIndex > begIndex) {
                result.add(input.substring(begIndex, endIndex));
            }
        }

        return result;
    }

    private static String findAttrName(String input) {
        Matcher m1 = Pattern.compile("@").matcher(input);
        Matcher m2 = Pattern.compile("=").matcher(input);

        if (m1.find() && m2.find()) {
            int begIndex = m1.end();
            int endIndex = m2.start();
            if (endIndex > begIndex) {
                return input.substring(begIndex, endIndex);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    private static String findAttrValue(String input) {
        Matcher matcher = Pattern.compile("'").matcher(input);

        int begIndex = -1;
        if (matcher.find()) {
            begIndex = matcher.end();
        } else {
            return null;
        }

        int endIndex = -1;
        if (matcher.find()) {
            endIndex = matcher.start();
        } else {
            return null;
        }

        if (endIndex > begIndex) {
            return input.substring(begIndex, endIndex);
        } else {
            return null;
        }
    }
}
