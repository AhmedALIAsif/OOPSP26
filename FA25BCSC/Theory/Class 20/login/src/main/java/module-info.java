module cui.login.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jshell;
    requires java.desktop;


    opens cui.login.login to javafx.fxml;
    exports cui.login.login;
}