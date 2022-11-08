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
}
