package cui.login.demo1;

import java.io.*;
import java.util.ArrayList;

public class Utility {

    static  ArrayList<Student> students=new ArrayList<>();
    public static void createData(){
        students.add(new Student("Manahil", "manahil23@gmail.com","Lahore Pakistan"));
        students.add(new Student ("Mishal","mishal@gmail.com", "Punjab pakistan"));
        students.add(new Student("Aleeza", "aleeza@gmail.com","punjab pakistan"));
        students.add(new Student("Momin","momin@gmail.com","Lahore Pakistan", 4.0));
        students.add(new Student("Momin","momin@gmail.com","Lahore Pakistan", 4.0));
        students.add(new Student("Azma", "azmaafatimaa@gmail.com","punjab pakistan",3.0));
        students.add(new Student("Mueez", "mueez@gmail.com","punjab pakistan",4.0));
        students.add(new Student("Ahmad","ahmad@gmail.com","Punjab Pakistan",4.0));
        students.add(new Student("Abdul Hameed Qaisar","abdul@gmail.com","Lahore Pakistan",4.0));
        students.add(new Student("Mueez", "mueez@gmail.com","punjab pakistan",4.0));
        students.add(new Student("Mueez", "mueez@gmail.com","punjab pakistan",4.0));
        students.add(new Student("Noor-e-Zahra","noor@gmail.com","Punjab Pakistan",3.5));
        try {

            writeObjects(new File("Data.ser"), students);

        }
        catch (IOException e){

        }
    }

    public static void writeObjects(File file, ArrayList<Student> list)throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        fileOutputStream.close();

    }

    public static ArrayList<Student> readData(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Object o=objectInputStream.readObject();
        ArrayList<Student> templist=(ArrayList<Student>) o;
        System.out.println(templist);
        objectInputStream.close();
        fileInputStream.close();
        return templist;
    }



}
