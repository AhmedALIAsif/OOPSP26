module cui.login.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cui.login.demo1 to javafx.fxml;
    exports cui.login.demo1;
}