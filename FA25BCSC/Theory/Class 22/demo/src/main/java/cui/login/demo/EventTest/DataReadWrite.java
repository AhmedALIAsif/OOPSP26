package cui.login.demo.EventTest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;

public class DataReadWrite extends Application {

    @Override

    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane=new GridPane();
        Scene scene=new Scene(gridPane,500,400);

        Button writeButton=new Button("Write");

        writeButton.setOnAction(e->{
            try {
                FileWriter fileWriter = new FileWriter("data.dat",true);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

                bufferedWriter.write("user+"+"\t"+"password1");
                bufferedWriter.close();
            }
            catch (Exception a){

            }
        });
        Button readButton=new Button("Read button");

        readButton.setOnAction(e->{
            try {
                FileReader fileReader = new FileReader("data.dat");
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                String text=bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
                System.out.println(text);

            }
            catch (IOException a){

            }
        });


        gridPane.add(writeButton,0,0);
        gridPane.add(readButton,0,1);



        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
