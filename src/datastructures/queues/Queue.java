package datastructures.queues;

public class Queue {

    class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public Node first;
    public Node last;
    public int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length++;
    }

    public void printQueue() {
        Node temp = first;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            first = newNode;
            last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) return null;
        Node temp = first;
        if(length == 1) {
            first = null;
            last = null;
        }else{
            first = temp.next;
            temp.next = null;
        }
        length--;
        return temp;
    }
}
