package com;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Media media=new Media( "file:///D:/prog/javalessons/javafx/JL239media/dspm.mp4");
        MediaPlayer mediaPlayer=new MediaPlayer(media);
        MediaView mediaView=new MediaView(mediaPlayer);
        Button play=new Button("PLAY");
        Button pause=new Button("PAUSE");

        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mediaPlayer.play();
            }
        });
        pause.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                mediaPlayer.pause();
            }
        });


        VBox root=new VBox();
        root.getChildren().add (play);
        root.getChildren().add (pause);
        root.getChildren().add (mediaView);
        primaryStage.setTitle("Media");
        primaryStage.setScene ( new Scene(root, 400,330));
        primaryStage.show();
    }
}