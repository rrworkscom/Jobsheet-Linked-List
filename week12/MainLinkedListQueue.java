package week12;

import java.util.Scanner;

public class MainLinkedListQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentQueueLinkedList sqll = new StudentQueueLinkedList();

        int choice;
        do {
            System.out.println("\nStudent service Menu");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. Show Front Student");
            System.out.println("4. Show Rear Student");
            System.out.println("5. Show All Queue");
            System.out.println("6. Count Students");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class: ");
                    String stdclass = sc.nextLine();
                    System.out.print("Study Program: ");
                    String studyProg = sc.nextLine();

                    StudentLL std = new StudentLL(nim, name, stdclass, studyProg);
                    sqll.enqueue(std);
                    break;

                case 2:
                    sqll.dequeue();
                    break;

                case 3:
                    sqll.peekFront();
                    break;

                case 4:
                    sqll.peekRear();
                    break;

                case 5:
                    sqll.printQueue();
                    break;

                case 6:
                    sqll.countQueue();
                    break;

                case 7:
                    sqll.clear();
                    break;
            }

        } while (choice != 0);

        System.out.println("Program finished.");
    }
}
