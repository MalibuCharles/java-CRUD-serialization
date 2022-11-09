package studentmanagement;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        StudentManager admin = new StudentManager();
        LinkedList<StudentRecord> list = new LinkedList<>(); // Creating the reference variable

        Serialize.serialize(list);

        Scanner input = new Scanner(System.in);

        String choice = "y";
        admin.loadData();
        while (true) {
            System.out.println("What would you like to do today? \n" +
                    "1.Create a student record \n" +
                    "2.See a student record \n" +
                    "3.Update a student record \n" +
                    "4.Delete a student record \n" +
                    "5.Display all Student Records\n" +
                    "6.Quit");
            int task = input.nextInt();
            if (task == 1) {
                while (choice.equals("y")) {
                    System.out.println("Welcome to the Program\n-----------------------------------");

                    StudentRecord record = new StudentRecord();

                    System.out.println("Enter Student id: ");
                    int id = input.nextInt();
                    record.setId(id);

                    Scanner in = new Scanner(System.in);

                    System.out.println("Enter Student Name: ");
                    String name = in.nextLine();
                    record.setName(name);

                    System.out.println("Enter Student Grade: ");
                    String grade = in.nextLine();
                    record.setGrade(grade);

                    admin.create(record);

                    System.out.println("--------------------------------------");
                    System.out.print("Do you want to add another record? (y/n)");
                    choice = in.nextLine();
                    System.out.println("--------------------------------------");
                }
            } else if (task == 2) {
                System.out.println("Enter an id to search: ");
                int id = input.nextInt();
                System.out.println(admin.read(id).toString());
            } else if (task == 3) {
                System.out.println("Enter an id to update: ");
                int id = input.nextInt();
                admin.update(id);
            } else if (task == 4) {
                System.out.println("Enter an id to delete: ");
                int id = input.nextInt();
                admin.delete(id);
            } else if (task == 5) {
                admin.display();
            } else if (task == 6) {
                admin.saveData();
                break;
            }
        }
    }
    
}
