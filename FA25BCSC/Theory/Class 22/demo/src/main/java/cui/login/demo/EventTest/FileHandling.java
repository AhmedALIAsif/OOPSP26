package cui.login.demo.EventTest;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandling {

    public static void main(String[] args)throws IOException {
        ArrayList<User> usersList=new ArrayList<>();
        File myFile=new File("list.dat");

        File file2=new File("abc.ser");
        IOUtility.writeObjectsToFile(file2, usersList);


        IOUtility.writeToFile(myFile,"User1 User1");
        ArrayList<User> list=IOUtility.readFromFile(myFile);


        list.forEach(e-> System.out.println(e.getName()+" "+e.getEmail()));






    }
}
