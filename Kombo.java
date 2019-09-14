package my.test.program;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Kombo extends Application {

    public static void main(String[] args) {
        System.out.println("JavaFX");
        launch(args);
    }

    public void init()
    {
        System.out.println("init");
    }

    @Override
    public void start(Stage myStage) {
        System.out.println("V tele");
        myStage.setTitle("Title");
        FlowPane rootNode = new FlowPane();
        Scene myScene = new Scene(rootNode , 1000 , 700);
        myStage.setScene(myScene);
        myStage.show();
    }

    public void stop()
    {
        System.out.println("stop");
    }
}
