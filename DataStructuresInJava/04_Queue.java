/**

Queue

The queue is called an abstract data structure. 
Data is always added to one end (enqueued), and removed from the other (dequeue). 
Queue uses the First-In-First-Out approach and data item that was stored initially will be accessed first in a queue.

Features of Queue
Linear Data Structure
Follows FIFO: First In First Out
Insertion can take place from the rear end.
Deletion can take place from the front end.
Eg: queue at ticket counters, bus station

4 major operations:
enqueue(ele) – used to insert element at top
dequeue() – removes the top element from queue 
peekfirst() – to get the first element of the queue 
peeklast() – to get the last element of the queue 
All operation works in constant time i.e, O(1

Queue Advantages
Maintains data in FIFO manner
Insertion from beginning and deletion from end takes O(1) time

Queue Applications
Scheduling
Maintaining playlist
Interrupt handling

Variations in Queue: Two popular variations of queues are Circular queues and Dequeues.

*/

import java.util.*;

class Queue{

    int front;
    int rear;
    int[] arr;

    Queue() {
        front=rear=-1;
        arr=new int[10];
    }

    void enqueue(int a) {
        if(rear==arr.length-1)
            System.out.println("overflow");
        else
            arr[++rear]=a;

        if(front==-1)
            front++;
    }

    int dequeue() {
        int x=-1;
        if(front==-1)
            System.out.println("underflow");
        else
            x=arr[front++];
        if(rear==0)
            rear--;
        return x;
    }

    void display() {
        for(int i=front;i<=rear;i++)
            System.out.print(arr[i]+" ");

        System.out.println();


    }
}

public class QueueDemo{

    public static void main(String[] args) {
        Queue ob=new Queue();
        ob.enqueue(1);
        ob.enqueue(2);
        ob.enqueue(3);
        ob.enqueue(4);
        ob.enqueue(5);
        ob.display();
        ob.dequeue();
        ob.display();
    }
}
