package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import javafx.scene.control.TextField;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage)  {
        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(15,15,15,15));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        Label welcome=new Label("Welcome to Login");

        Label userNamelabel=new Label("user Name");
        Label passwordLabel= new Label("Password");

        TextField nameField=new TextField();
        PasswordField passwordField=new PasswordField();
        gridPane.add(welcome,0,0);
        gridPane.add(userNamelabel,0,1);
        gridPane.add(nameField,1,1);
        gridPane.add(passwordLabel,0,2);
        gridPane.add(passwordField,1,2);

        Scene scene=new Scene(gridPane,400,250);

        stage.setScene(scene);
        stage.show();
        



    }

    public static void main(String[] args) {
        launch(args);
    }
}