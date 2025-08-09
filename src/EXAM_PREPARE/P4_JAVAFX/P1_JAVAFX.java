package EXAM_PREPARE.P4_JAVAFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;

public class P1_JAVAFX extends Application{
    public void start(Stage stage){
        GridPane gp =new GridPane();
        gp.setVgap(5);
        gp.setHgap(10);

        gp.add(new Label("Enter your Username:"), 0 ,0);
        TextField tf = new TextField();
        gp.add(tf, 1, 0);

        gp.add(new Label("Enter Your Password:"), 0, 1);
        PasswordField pf = new PasswordField();
        gp.add(pf, 1, 1);

        Button login = new Button("Login");
        gp.add(login, 2,1);

        stage.setScene(new Scene(gp, 900, 900));
        stage.setTitle("Login Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
