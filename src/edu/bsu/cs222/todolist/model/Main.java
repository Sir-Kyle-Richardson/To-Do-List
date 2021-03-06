package edu.bsu.cs222.todolist.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../fxml/ToDoList.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("To Do List");
        primaryStage.setScene(new Scene(root, 850, 800));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
