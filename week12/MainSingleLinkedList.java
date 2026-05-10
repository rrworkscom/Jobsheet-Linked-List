package week12;

import java.util.Scanner;

public class MainSingleLinkedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);
        SingleLinkedList sll = new SingleLinkedList();

        int choice;
        do {
            System.out.println("\nSingle Linked List Menu");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After (by Name)");
            System.out.println("4. Insert At Index");
            System.out.println("5. Print Linked List");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice >= 1 && choice <= 4) {
                System.out.print("Input NIM: ");
                String nim = sc.nextLine();
                System.out.print("Input Name: ");
                String name = sc.nextLine();
                System.out.print("Input Class: ");
                String kelas = sc.nextLine();
                System.out.print("Input GPA: ");
                double gpa = sc.nextDouble();
                sc.nextLine();

                Student std = new Student(nim, name, kelas, gpa);

                switch (choice) {
                    case 1:
                        sll.addFirst(std);
                        System.out.println("Data added at first");
                        break;

                    case 2:
                        sll.addLast(std);
                        System.out.println("Data added at last");
                        break;

                    case 3:
                        System.out.print("Insert after name: ");
                        String key = sc.nextLine();
                        sll.insertAfter(std, key);
                        System.out.println("Data inserted after " + key);
                        break;
                    case 4:
                        System.out.print("Insert at index: ");
                        int index = sc.nextInt();
                        sc.nextLine();
                        sll.insertAt(index, std);
                        System.out.println("Data inserted at index " + index);
                        break;
                }
            } else if (choice == 5) {
                sll.print();
            }

        } while (choice != 0);

        System.out.println("Program finished.");
    }
}
