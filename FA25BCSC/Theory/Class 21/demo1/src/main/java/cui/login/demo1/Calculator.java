package cui.login.demo1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        LocalDateTime localDateTime=null;
        GridPane gridPane=new GridPane();
        Scene scene1=new Scene(gridPane,600,400);
        TextField name=new TextField();
        name.setPromptText("Name");
        DatePicker dob=new DatePicker();
        LocalDate localDate =dob.getValue();



        RadioButton m=new RadioButton("Male");
        RadioButton f=new RadioButton("Female");
        ToggleGroup toggleGroup=new ToggleGroup();
        m.setToggleGroup(toggleGroup);
        f.setToggleGroup(toggleGroup);

        HBox hBox=new HBox();
        hBox.getChildren().addAll(m,f);


        gridPane.add(name,0,0);
        gridPane.add(dob,0,1);
        gridPane.add(hBox,0,2);

        Slider weightSlider=new Slider();
        weightSlider.setShowTickLabels(true);
        weightSlider.setShowTickMarks(true);
        weightSlider.setMin(10);

        Slider heightSlider=new Slider();
        heightSlider.setShowTickMarks(true);
        heightSlider.setShowTickMarks(true);
        Button bmi=new Button("BMI");


        Image img=new Image("icon.png");
        ImageView imageView=new ImageView(img);
        imageView.setFitWidth(40);
        imageView.setFitHeight(50);

        Button imageChooser=new Button("Slect Profile Image");

        FileChooser fileChooser=new FileChooser();
      //  imageChooser.setOnAction((EventHandler<ActionEvent>) fileChooser.showOpenDialog(primaryStage));
        scene1.setOnMouseMoved(e->name.setText(""+e.getX()));

        weightSlider.setMax(500);

        weightSlider.valueProperty().addListener(e->weightSlider.getValue());

        heightSlider.valueProperty().addListener(e-> System.out.println(heightSlider.getValue()));
        Button writToFile=new Button("Save Data");

        writToFile.setOnAction(e->{
            try {
                FileWriter fw = new FileWriter("data.txt");
                BufferedWriter bw=new BufferedWriter(fw);
                bw.write(name.getText()+"\t"+dob.getValue()+"\t"+toggleGroup.getSelectedToggle());
                bw.close();
            }
            catch (IOException a){

            }
        });


        gridPane.add(weightSlider,0,3);
        gridPane.add(heightSlider,0,4);
        gridPane.add(imageView,1,0,1,3);
        gridPane.add(bmi,0,5);
        gridPane.add(imageChooser,1,4);
        gridPane.add(writToFile,0,6);
        primaryStage.setScene(scene1);
        primaryStage.show();


    }
}
