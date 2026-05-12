module cui.login.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens cui.login.demo to javafx.fxml;
    exports cui.login.demo.EventTest;
}