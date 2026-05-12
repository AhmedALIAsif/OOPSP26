package cui.login.login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



public class BillCalculator extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane=new GridPane();
        Scene scene=new Scene(pane,500,400);

        TextField input1=new TextField();
        TextField input2=new TextField();
        Button button=new Button("Calculate");

        Label label=new Label("Bill Amount");
        button.setOnAction(e->{
            try {

               // if(input1.getText().equals(Data.users[0].name))
                int num1 = Integer.parseInt(input1.getText());
                int num2 = Integer.parseInt(input2.getText());
                double result=(num2-num1)*50;
                label.setText("Bill Amount :"+result);

            }
            catch (Exception a){

                System.out.println("Invalid input");
            }


        });
        pane.add(input1,0,0);
        pane.add(input2,0,1);
        pane.add(button,0,2);
        pane.add(label,0,3);




        primaryStage.setScene(scene);
        primaryStage.show();





            }
}
