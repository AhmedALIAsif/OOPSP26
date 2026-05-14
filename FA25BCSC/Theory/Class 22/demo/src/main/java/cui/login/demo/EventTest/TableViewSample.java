package cui.login.demo.EventTest;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.File;

public class TableViewSample extends Application {
    final ObservableList<User> data = FXCollections.observableArrayList(
            new User("Jacob", "Smith"),
            new User("Isabella", "Johnson"),
            new User("Ethan", "Williams"),
            new User("Emma", "Jones"),
            new User("Michael", "Brown")
    );


    private final TableView table = new TableView();
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        data.addAll(IOUtility.readFromFile(new File("list.dat")));
        Scene scene = new Scene(new Group());
        stage.setTitle("Table View Sample");
        stage.setWidth(300);
        stage.setHeight(500);

        final Label label = new Label("Address Book");
        label.setFont(new Font("Arial", 20));
        table.setItems(data);
        table.setEditable(true);

        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");

        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
        emailCol.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);
        firstNameCol.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );
        lastNameCol.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );
        emailCol.setCellValueFactory(
                new PropertyValueFactory<>("email")
        );

        TextField firstNameTextField=new TextField();
        TextField lastNameTextField=new TextField();
        TextField email=new TextField();
        Button submit=new Button("submit");
        submit.setOnAction(e->
        {
            data.add(new User(firstNameTextField.getText(),lastNameTextField.getText()));
        });
        HBox hBox=new HBox();
        hBox.getChildren().addAll(firstNameTextField,lastNameTextField,email,submit);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().addAll(label, table,hBox);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }



}