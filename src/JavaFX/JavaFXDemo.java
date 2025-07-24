package JavaFX;
//import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Hello, JavaFX!");

        StackPane root = new StackPane();
        root.getChildren().add(label);
        Button btn = new Button("Aaulu Bhindi Gobi");
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }
}
