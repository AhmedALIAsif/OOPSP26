package cui.login.demo.EventTest;

import java.io.*;
import java.util.ArrayList;

public class IOUtility {
    public static  void writeToFile(File file, String text){
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch (IOException e){}
    }

    public static ArrayList<User> readFromFile(File file){
        ArrayList<User> list=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = "";
            while ((text = bufferedReader.readLine()) != null) {
                String tempuser[] = text.split(" ");
                list.add(new User(tempuser[0], tempuser[0]));

            }
        }
        catch (IOException e){
        }
        return list;
    }

    public  static ArrayList<User> readObjectsFromFile(File file){
        ArrayList<User> list2=new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list2 = (ArrayList<User>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        }
        catch (Exception e){}
        return list2;
    }

    public static  void writeObjectsToFile(File file, ArrayList<User> list){
        try {
            FileOutputStream fout = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fout);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fout.close();
        }
        catch (Exception ea){

        }

    }
}
