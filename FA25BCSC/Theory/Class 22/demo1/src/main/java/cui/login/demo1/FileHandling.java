package cui.login.demo1;

import java.io.*;

public class FileHandling {
    public static void main(String[] args) throws IOException {

        //File
        File file=new File("Data.txt");

        //Writing
       // FileWriter fw=new FileWriter(file);

        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bufferedWriter=new BufferedWriter(fw);
        bufferedWriter.write("Muhammad Zain>zain@gmail>123 abc society");
        bufferedWriter.newLine();
        bufferedWriter.close();
        fw.close();

        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String text="";
        while ((text=bufferedReader.readLine())!=null) {
            String list[] = text.split(">");
            String name[]=list[0].split(" ");
            System.out.println(name[0]);
        }
        bufferedReader.close();
        fileReader.close();








    }
}
