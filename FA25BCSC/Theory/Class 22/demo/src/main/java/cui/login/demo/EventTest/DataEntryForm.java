package cui.login.demo.EventTest;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;

public class DataEntryForm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        File file=new File("list.dat");
        GridPane layout=new GridPane();
        layout.setPadding(new Insets(20,20,20,20));
        layout.setVgap(15);
        layout.setHgap(15);
        TextField userName=new TextField();
        TextField email=new TextField();
        Button save=new Button("Save");
        Button read=new Button("Read");
        save.setOnAction(e->{
            IOUtility.writeToFile(file,userName.getText()+"\t"+email.getText());

            userName.setText("");
            email.setText("");
        });

        read.setOnAction(e->{
            ArrayList<User> list=IOUtility.readFromFile(file);
            list.forEach(a-> System.out.println(a.getName()+" "+a.getEmail()));

        });
        layout.add(userName,0,0);
        layout.add(email,0,1);
        layout.add(save,0,2);
        layout.add(read,0,3);

        Scene scene1=new Scene(layout,400,300);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}
