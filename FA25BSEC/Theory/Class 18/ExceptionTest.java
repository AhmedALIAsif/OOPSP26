import java.io.*;

public class ExceptionTest {
    public static void main(String[] args) {

        try {
            File f = new File("data.txt");
           // FileWriter fw = new FileWriter(f);

            FileReader fr=new FileReader(f);

        }
        catch (IOException e){
            // checked exception
            // compile time exception
            // compulsory exception

        }






    }
}
