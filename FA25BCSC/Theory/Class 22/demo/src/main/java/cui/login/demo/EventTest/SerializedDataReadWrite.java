package cui.login.demo.EventTest;



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;

public class SerializedDataReadWrite extends Application {

    @Override

    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane=new GridPane();
        Scene scene=new Scene(gridPane,500,400);

        Button writeButton=new Button("Write");

        writeButton.setOnAction(e->{
            try {
               User user1=new User("user","password");
               FileOutputStream fout=new FileOutputStream("data.ser");
               ObjectOutputStream oout=new ObjectOutputStream(fout);
               oout.writeObject(user1);
               oout.close();
               fout.close();
            }
            catch (Exception a){

            }
        });
        Button readButton=new Button("Read button");

        readButton.setOnAction(e->{

        });


        gridPane.add(writeButton,0,0);
        gridPane.add(readButton,0,1);



        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

