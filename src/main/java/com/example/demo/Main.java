package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage stage;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        this.stage = stage;

        // Create the first scene
        StackPane root1 = new StackPane();
        Button button1 = new Button("Switch to Scene 2");
        button1.setOnAction(event -> {
            // Switch to the second scene
            Scene scene2 = createScene2();
            stage.setScene(scene2);
        });
        root1.getChildren().add(button1);
        Scene scene1 = new Scene(root1, 400, 300);

        stage.setScene(scene1);
        stage.show();
    }

    private Scene createScene2() {
        // Create the second scene
        StackPane root2 = new StackPane();
        Button button2 = new Button("Switch to Scene 1");
        button2.setOnAction(event -> {
            // Switch to the first scene
            Scene scene1 = new Scene(new StackPane(), 400, 300);
            stage.setScene(scene1);
        });
        root2.getChildren().add(button2);
        Scene scene2 = new Scene(root2, 400, 300);

        return scene2;
    }
}
