package studentmanagement;

import java.util.*;

public class StudentManager {
    // Using linkedlist to store the objects of Student Records
    LinkedList<StudentRecord> list; // Creating the reference variable
    
    public StudentManager(){
        list = new LinkedList<>(); // Initializing list variable and storing LinkedList object
    }
    
    public void create(StudentRecord record){
        list.add(record);
    }
    
    public StudentRecord read(int id){
        for (StudentRecord r : list){
            if(r.getId() == id){
                return r;
            }
        }
        return null;
    }
    
    public void update(int id){
        StudentRecord record = read(id);
        if(record != null){
            System.out.println("Enter the new grade for the student: ");
            Scanner input = new Scanner(System.in);
            String grade = input.nextLine();
            record.setGrade(grade);
            System.out.println("Grade updated successfully");
        }
    } 
    
    public void delete(int id){
        StudentRecord record = read(id);
        if(record != null){
            list.remove(record);
            System.out.println("Record deleted successfully");
        }
    } 
    
    public void display(){
        for(StudentRecord r : list){
            System.out.println(r.toString());
        }
    }
}
