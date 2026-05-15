package cui.login.demo1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.nio.*;
import java.util.Objects;

public class FileHandling2 {
    static ArrayList<Student> data=new ArrayList<>();
    public static void main(String[] args) throws Exception{

        Utility.createData();

        data=Utility.readData(new File("Data.ser"));
//Abdul Hameed Qaisar
//        data.forEach(e-> {
//
//        }
//        );

  //      System.out.println(data.contains(new Student("Abdul Hameed Qaisar","","",0)));

        Collections.sort(data);

        data.forEach(e-> System.out.println(e));


    }


}
