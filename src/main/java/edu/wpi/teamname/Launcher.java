package edu.wpi.teamname;

import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
  private static final String MAIN_FXML = "src/main/resources/MainView.fxml";

  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage primaryStage) {
    Parent root;
    try {
      // root = FXMLLoader.load(new File("src/main/resources/MainView.fxml").toURL());
      root = FXMLLoader.load(new File("src/main/resources/MainView.fxml").toURI().toURL());
    } catch (IOException e) {
      System.err.println("Failed to load main FXML file!");
      e.printStackTrace();
      return;
    }

    primaryStage.setTitle("CS3733 Assignment 5");
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
