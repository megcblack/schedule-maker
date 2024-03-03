package main.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.model.Schedule;

import java.util.Observable;

import static javax.swing.SwingConstants.CENTER;
import main.Observer;

public class ScheduleGUI extends Application implements Observer<Schedule, String> {

    private Schedule model;
    BorderPane bp;
    public static final double BUTTON_WIDTH = 150;
    public static final double BUTTON_HEIGHT = 50;
    public void init() {
        this.model = new Schedule();
        model.addObserver(this);
    }

    private void makeMainMenu(){
        // Creates Menu
        VBox mainMenu = new VBox();
        Button createSchedule = new Button("Create New Schedule");
        createSchedule.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        Button viewSchedule = new Button("View Schedule");
        viewSchedule.setPrefSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        bp.setCenter(mainMenu);
        mainMenu.setAlignment(Pos.CENTER);
        mainMenu.getChildren().add(createSchedule);
        mainMenu.setSpacing(50);
        mainMenu.getChildren().add(viewSchedule);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Schedule Maker");
        primaryStage.centerOnScreen();
        bp = new BorderPane();


        makeMainMenu();
        primaryStage.setHeight(600);
        primaryStage.setWidth(600);

        primaryStage.setScene(new Scene(bp));
        primaryStage.show();
    }
    public void refresh() {

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void update(Schedule schedule, String s) {

    }
}
