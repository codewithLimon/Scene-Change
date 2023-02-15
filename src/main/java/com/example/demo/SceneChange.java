package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneChange extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader1=new FXMLLoader(SceneChange.class.getResource("firstScene.fxml"));
        Scene scene1=new Scene(fxmlLoader1.load(),1000,500);
        primaryStage.setTitle("SceneChange");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
