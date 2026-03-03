package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR1Queue {

    //public final int CAPACITY = 10;

    private Queue<Point> queue;

    //passem la capacitat com a paràmetre
    public PR1Queue(int capacity) {
        newQueue(capacity);
    }
    public void newQueue(int capacity) {
        queue = new QueueArrayImpl<>(capacity);
    }

    public Queue<Point> getQueue() {
        return this.queue;
    }

    public void add(Point p) {
        this.queue.add(p);
    }

    public Point poll() {
        return this.queue.poll();
    }
}
