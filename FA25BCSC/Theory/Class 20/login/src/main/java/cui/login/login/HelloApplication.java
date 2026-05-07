package cui.login.login;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application{
    @Override
    public void start(Stage stage){
        stage.setTitle("Welcome to javaFx");
        stage.setResizable(false);

       // StackPane layout=new StackPane();
        GridPane layout=new GridPane();
        layout.setPadding(new Insets(30,30,30,30));
        layout.setHgap(10);
        layout.setVgap(10);
        Label welcome=new Label("Welcome to Login");
        welcome.setFont(new Font("Ariel",34));
       // welcome.setTextFill(Color.gray(1,50));

        Label userName=new Label("User Name");
        Label password=new Label("Password");


        Button button=new Button("Submit");
        Button cancel=new Button("Cancel");

        HBox buttonBox=new HBox();

       // layout.getChildren().add(button);

       // layout.add(welcome,0,0);
        layout.add(welcome,0,0,2,1);
        layout.add(userName,0,1);
        layout.add(password,0,2);
        TextField userTextField=new TextField();

        Button loginButton=new Button("Login");
        buttonBox.getChildren().addAll(loginButton,cancel);
        PasswordField passwordField=new PasswordField();
        layout.add(userTextField,1,1);
        layout.add(passwordField,1,2);
        buttonBox.setAlignment(Pos.BASELINE_RIGHT);
        Label alert=new Label();
        layout.add(alert,1,4);
        buttonBox.setSpacing(10);


        cancel.setOnAction(e->System.exit(0));

        layout.add(buttonBox,1,3);
        Scene scene1=new Scene(layout,500,300);

        loginButton.setOnAction(e-> {
                    if(userTextField.getText().equals("Admin")) {
                       stage.setScene(createScene2());
                    }
                }
        );
        stage.setScene(scene1);
        stage.show();


    }
    public static void main(String[] args) {
        launch();

    }

    public static Scene createScene2(){
        GridPane gridPane=new GridPane();
        TextField name=new TextField();
        name.setPromptText("Enter Name");
        RadioButton maleRadioButton=new RadioButton("Male");
        RadioButton femaleRadioButton=new RadioButton("Female");
        ToggleGroup toggleGroup=new ToggleGroup();

        maleRadioButton.setToggleGroup(toggleGroup);
        femaleRadioButton.setToggleGroup(toggleGroup);
        VBox genderBox=new VBox();
        genderBox.getChildren().addAll(maleRadioButton,femaleRadioButton);
        Slider height=new Slider();
        height.setShowTickMarks(true);
        height.setShowTickLabels(true);

        Label hieghtLabel=new Label();
        gridPane.add(hieghtLabel,1,2);

        height.valueProperty().addListener(e-> hieghtLabel.setText(""+height.getValue()));

        DatePicker dob=new DatePicker();

        gridPane.add(dob,0,4);

        gridPane.add(name,0,0);
        gridPane.add(genderBox,0,1);
        gridPane.add(height,0,2);

        gridPane.setVgap(20);

       // gridPane.add(maleRadioButton,0,1);


        Scene scene2=new Scene(gridPane,500,400);
        return scene2;
    }

}