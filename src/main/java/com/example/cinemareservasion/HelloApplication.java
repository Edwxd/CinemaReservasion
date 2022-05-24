package com.example.cinemareservasion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {


        //create button to add to grid
        Button button1 = new Button("A1");
        Button button2 = new Button("A2");
        Button button3 = new Button("A3");
        Button button4 = new Button("A4");
        Button button5 = new Button("A5");
        Button button6 = new Button("A6");

        Button button7 = new Button("B1");
        Button button8 = new Button("B2");
        Button button9 = new Button("B3");
        Button button10 = new Button("B4");
        Button button11 = new Button("B5");
        Button button12 = new Button("B6");

        Button button13 = new Button("C1");
        Button button14= new Button("C2");
        Button button15 = new Button("C3");
        Button button16 = new Button("C4");
        Button button17 = new Button("C5");
        Button button18 = new Button("C6");

        //create new grid
        GridPane seats = new GridPane();

        //set the separation between the buttons in the grid
        seats.setHgap(5);
        seats.setVgap(20);

        //centre the grid
        seats.setAlignment(Pos.CENTER);

//Set the background of the scene to the color black
        seats.setBackground(new Background(new BackgroundFill(Color.DARKSALMON, CornerRadii.EMPTY, new Insets(2,2,2,2))));

        //Make all button color green for row A
        button1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button3.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button4.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button5.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button6.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));

        //Make all button color green for row B
        button7.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button8.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button9.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button10.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button11.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button12.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));

        //Make all button color green for row C
        button13.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button14.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button15.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button16.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button17.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));
        button18.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, new Insets(2,2,2,2))));



        //add buttons to the grid
        seats.add(button1, 0, 0, 1, 1);
        seats.add(button2, 1, 0, 1, 1);
        seats.add(button3, 2, 0, 1, 1);
        seats.add(button4, 3, 0, 1, 1);
        seats.add(button5, 4, 0, 1, 1);
        seats.add(button6, 5, 0, 1, 1);

        seats.add(button7, 0, 1, 1, 1);
        seats.add(button8, 1, 1, 1, 1);
        seats.add(button9, 2, 1, 1, 1);
        seats.add(button10, 3, 1, 1, 1);
        seats.add(button11, 4, 1, 1, 1);
        seats.add(button12, 5, 1, 1, 1);

        seats.add(button13, 0, 2, 1, 1);
        seats.add(button14, 1, 2, 1, 1);
        seats.add(button15, 2, 2, 1, 1);
        seats.add(button16, 3, 2, 1, 1);
        seats.add(button17, 4, 2, 1, 1);
        seats.add(button18, 5, 2, 1, 1);


//set the dynamic of the buttons
        button1.setOnMousePressed(event -> pressed(event, button1));



        //set the size of the scene
        Scene scene = new Scene(seats, 500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {


        launch();
    }

    public void pressed(MouseEvent event, Button button1){

        button1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, new Insets(2,2,2,2))));

    }

    }

