package main.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

public class ScheduleGUI extends Application implements Observer {

    public void init() {

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Schedule Maker");
        BorderPane bp = new BorderPane();
        primaryStage.setScene(new Scene(bp));
        primaryStage.show();
    }
    public void refresh() {

    }
    @Override
    public void update(Observable o, Object arg) {

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
