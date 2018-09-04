package com.zzw.github.graphql.spider;

import java.util.HashSet;
import java.util.LinkedList;

/**
 * Created by zzw on 2018/6/9.
 */
public class RecordQueue {
    private LinkedList<String> waitingQueue = new LinkedList<String>();
    private HashSet<String> visitedQueue = new HashSet<String>();

    public boolean enqueue(String item) {
        if ((item == null) || (item.length() <= 0)) {
            return false;
        }
        if (visitedQueue.contains(item)) {
            return false;
        }
        if (waitingQueue.contains(item)) {
            return false;
        }
        waitingQueue.addLast(item);
        return true;
    }

    public String dequeue() {
        if (waitingQueue.isEmpty()) {
            return null;
        } else {
            String item = waitingQueue.removeFirst();
            visitedQueue.add(item);
            return item;
        }
    }

    public boolean isWaitingEmpty() {
        return waitingQueue.isEmpty();
    }

    public boolean isVisitedEmpty() {
        return visitedQueue.isEmpty();
    }

    public int waitingSize() {
        return waitingQueue.size();
    }

    public int visitedSize() {
        return visitedQueue.size();
    }
}
