package com.example.demo;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneChangeController {

    @FXML
    private JFXButton switch1;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void switch1Clicked(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("secondScene.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root,1000,500);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void switch2Clicked(ActionEvent event) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("firstScene.fxml"));
        stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root,1000,500);
        stage.setScene(scene);
        stage.show();
    }

}
