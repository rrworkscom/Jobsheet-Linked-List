package week12;

public class StudentQueueLinkedList {
    NodeStudent front;
    NodeStudent rear;
    int size;
    int max = 30; 

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared!");
    }

    void enqueue(StudentLL std) {
        if (isFull()) {
            System.out.println("Queue is FULL!");
            return;
        }

        NodeStudent newNode = new NodeStudent(std, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
        System.out.println("Student added to queue.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is EMPTY!");
            return;
        }

        System.out.println("Calling student:");
        front.data.print();

        front = front.next;
        size--;

        if (front == null) rear = null;
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.print("Front student : ");
            front.data.print();
        } else {
            System.out.println("Queue empty");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.print("Rear student  : ");
            rear.data.print();
        } else {
            System.out.println("Queue empty");
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }

        NodeStudent tmp = front;
        System.out.println("Students in queue:");
        while (tmp != null) {
            tmp.data.print();
            tmp = tmp.next;
        }
    }

    void countQueue() {
        System.out.println("Total students in queue: " + size);
    }
}