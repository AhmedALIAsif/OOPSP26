package cui.login.demo.EventTest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class CircleMoveApp extends Application {

    private static final double WIDTH = 600;
    private static final double HEIGHT = 400;
    private static final double RADIUS = 30;
    private static final double MOVE_STEP = 10;

    @Override
    public void start(Stage stage) {

        Pane root = new Pane();

        Circle circle = new Circle();
        circle.setRadius(RADIUS);
        circle.setCenterX(WIDTH / 2);
        circle.setCenterY(HEIGHT / 2);
        circle.setFill(Color.DODGERBLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);

        //root.getChildren().add(circle);
        Rectangle rectangle=new Rectangle();
        rectangle.setHeight(30);
        rectangle.setWidth(60);
        rectangle.setX(root.getHeight()/2);
        root.getChildren().addAll(circle,rectangle);

        // Mouse movement: circle follows mouse position
        root.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();

            circle.setCenterX(x);
            circle.setCenterY(y);
        });

        // Mouse dragging: circle also follows while dragging
        root.setOnMouseDragged(event -> {
            double x = event.getX();
            double y = event.getY();

            circle.setCenterX(x);
            circle.setCenterY(y);
        });

        // Important: Pane must be focusable to receive key events
        root.setFocusTraversable(true);
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        // Keyboard movement using arrow keys
        root.setOnKeyPressed(event -> {

            double x = circle.getCenterX();
            double y = circle.getCenterY();

            if (event.getCode() == KeyCode.UP) {
                circle.setCenterY(y - MOVE_STEP);
            }
            else if (event.getCode() == KeyCode.DOWN) {
                circle.setCenterY(y + MOVE_STEP);
            }
            else if (event.getCode() == KeyCode.LEFT) {
                circle.setCenterX(x - MOVE_STEP);
            }
            else if (event.getCode() == KeyCode.RIGHT) {
                circle.setCenterX(x + MOVE_STEP);
            }
            else if(event.getCode()==KeyCode.SPACE) {
                rectangle.setX(rectangle.getX() + 10);
                if(rectangle.getX()==scene.getWidth()-50) {
                    rectangle.setWidth(0);
                    rectangle.setHeight(0);
                }
            }
        });



        stage.setTitle("Circle Movement Demo");
        stage.setScene(scene);
        stage.show();


        root.requestFocus();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
