package main.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

public class ScheduleGUI extends Application implements Observer {

    BorderPane bp;
    public void init() {

    }

    private void makeMainMenu(){
        // Creates Menu
        VBox mainMenu = new VBox();
        Button createSchedule = new Button("Create New Schedule");
        Button viewSchedule = new Button("View Schedule");
        bp.setCenter(mainMenu);
        mainMenu.getChildren().add(createSchedule);
        mainMenu.getChildren().add(viewSchedule);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Schedule Maker");
        bp = new BorderPane();

        makeMainMenu();
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

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
