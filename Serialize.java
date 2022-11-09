package studentmanagement;

import java.io.*;
import java.util.LinkedList;


public class Serialize {
    public static void serialize(LinkedList<StudentRecord> studentRecords){
        try{
            FileOutputStream fileOut = new FileOutputStream("studentRecords.ser");
            // ^ opening a connect to a new file and allowing to connect
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            // ^ streaming data from an object into a file
            out.writeObject(studentRecords);
            // take this object and i'm lobbing it
            out.close();
            // close it once we are done with the file
            fileOut.close();
            // close it once we are done with the file
            System.out.println("Serialized data is saved!");


        }catch (IOException i) {
            i.printStackTrace();
            // history of all the methods that were called - allows us to see where the code went wrong.
            //principle of a stack is similar to pringles - last in, first out
        }

    }

    public static LinkedList <StudentRecord>  deserialize(){
// we need to read from the file object.ser the data for our employee
// and if possible create a new employee otherwise return null

        LinkedList <StudentRecord> students = null; // this create an object of type employee to receive data from file or return

        try {
            // read object from a file
            FileInputStream file = new FileInputStream("studentRecords.ser");
            // create a connect to a file
            ObjectInputStream in = new ObjectInputStream(file);

            // method for deserialization for an object
            students = (LinkedList<StudentRecord>) in.readObject();
            // ^ read object and convert data to type Employee

            in.close();
            file.close();

            System.out.println("Object has been deserialized");
            System.out.println(students.size());

        } catch (IOException i){
            i.printStackTrace();

        }catch (ClassNotFoundException c){
            c.printStackTrace();
        }return students;
    }


}
