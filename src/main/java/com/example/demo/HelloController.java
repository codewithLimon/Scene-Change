package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        Font f;
        f = Font.loadFont(getClass().getResourceAsStream("src/main/resources/com/example/demo/Font/SF-Pro.ttf"), 14);


        welcomeText.setText("Welcome to JavaFX Application!");
        welcomeText.setFont(f);
    }
}