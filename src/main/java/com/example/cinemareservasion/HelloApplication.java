package com.example.cinemareservasion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCharacterCombination;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {


        Group allElements = new Group();
        //create a text node to represent the title of the grid
Text title = new Text(10, 20,"Choose your seat(s)");
//add the text "title" to the group
allElements.getChildren().add(title);







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


        //add a button representing the cinema Screen
        Button Screen = new Button("Screen");
        Screen.setPrefSize(100,25);
        Screen.setLayoutX(55);
        Screen.setLayoutY(30);
        //add the Screen button to the group
        allElements.getChildren().add(Screen);



        //create new grid
        GridPane seats = new GridPane();


        //set the separation between the buttons in the grid
        seats.setHgap(5);
        seats.setVgap(20);




//Set the color for the Screen button a button
        Screen.setBackground(new Background(new BackgroundFill(Color.GRAY, CornerRadii.EMPTY, new Insets(2,2,2,2))));



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
        seats.add(button1, 1, 4, 1, 1);
        seats.add(button2, 2, 4, 1, 1);
        seats.add(button3, 3, 4, 1, 1);
        seats.add(button4, 4, 4, 1, 1);
        seats.add(button5, 5, 4, 1, 1);
        seats.add(button6, 6, 4, 1, 1);

        seats.add(button7, 1, 5, 1, 1);
        seats.add(button8, 2, 5, 1, 1);
        seats.add(button9, 3, 5, 1, 1);
        seats.add(button10, 4, 5, 1, 1);
        seats.add(button11, 5, 5, 1, 1);
        seats.add(button12, 6, 5, 1, 1);

        seats.add(button13, 1, 6, 1, 1);
        seats.add(button14, 2, 6, 1, 1);
        seats.add(button15, 3, 6, 1, 1);
        seats.add(button16, 4, 6, 1, 1);
        seats.add(button17, 5, 6, 1, 1);
        seats.add(button18, 6, 6, 1, 1);


//set the dynamic of the buttons(when pressed it turns red)
        button1.setOnMousePressed(event -> pressed(event, button1));
        button2.setOnMousePressed(event -> pressed(event, button2));
        button3.setOnMousePressed(event -> pressed(event, button3));
        button4.setOnMousePressed(event -> pressed(event, button4));
        button5.setOnMousePressed(event -> pressed(event, button5));
        button6.setOnMousePressed(event -> pressed(event, button6));

        button7.setOnMousePressed(event -> pressed(event, button7));
        button8.setOnMousePressed(event -> pressed(event, button8));
        button9.setOnMousePressed(event -> pressed(event, button9));
        button10.setOnMousePressed(event -> pressed(event, button10));
        button11.setOnMousePressed(event -> pressed(event, button11));
        button12.setOnMousePressed(event -> pressed(event, button12));

        button13.setOnMousePressed(event -> pressed(event, button13));
        button14.setOnMousePressed(event -> pressed(event, button14));
        button15.setOnMousePressed(event -> pressed(event, button15));
        button16.setOnMousePressed(event -> pressed(event, button16));
        button17.setOnMousePressed(event -> pressed(event, button17));
        button18.setOnMousePressed(event -> pressed(event, button18));


//add the grid "seats" to the group
allElements.getChildren().add(seats);

        //set the size of the scene

        stage.setTitle("Cinema Reservation");
        Scene scene = new Scene( allElements);
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

