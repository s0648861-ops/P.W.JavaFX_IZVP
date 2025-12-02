package com.work;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    private Button button;

    @FXML
    void initialize() {
        button.setOnAction(_ -> {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader(Controller.class.getResource("end.fxml"));
            Scene scene;
            try {
                scene = new Scene(fxmlLoader.load());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.setTitle("Something");
            stage.setScene(scene);
            stage.setMaximized(true);
            stage.setOnCloseRequest(_ -> System.exit(0));
            stage.show();
        });
    }

}
