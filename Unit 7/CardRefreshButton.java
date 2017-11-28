import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collections;

public class CardRefreshButton extends Application {
    @Override
    public void start(Stage primaryStage){

        ArrayList<Integer> deck = new ArrayList<Integer>(52);  //create array list of integers representing file names of the card images
        for(int i = 1; i<53; i++){
            deck.add(i);
        }

        final Pane pane = new HBox(10);
        pane.setPadding(new Insets(5,5,5,5));
        shuffleDeck(deck,pane);

        Button button = new Button("Refresh");
        button.setOnAction(new EventHandler<javafx.event.ActionEvent>() {
            @Override
            public void handle(javafx.event.ActionEvent event) {
                shuffleDeck(deck, pane);
            }
        });

        BorderPane borderPane = new BorderPane();  //create borderpane for formatting
        borderPane.setCenter(pane);
        borderPane.setBottom(button);
        borderPane.setAlignment(button, Pos.BOTTOM_CENTER);

        Scene scene = new Scene(borderPane);
        primaryStage.setTitle(("Shuffling Cards"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void shuffleDeck(ArrayList<Integer> deck, Pane pane){  //shuffle method for refresh button
        Collections.shuffle(deck); //shuffle deck
        String card1 = new String("card/" + deck.get(0) + ".png");  //the first four cards from the top of the deck
        String card2 = new String("card/" + deck.get(1) + ".png");
        String card3 = new String("card/" + deck.get(2) + ".png");
        String card4 = new String("card/" + deck.get(3) + ".png");

        Image firstCard = new Image(card1);  //calling corresponding images
        Image secondCard = new Image(card2);
        Image thirdCard = new Image(card3);
        Image fourthCard = new Image(card4);

        pane.getChildren().clear();  //clearing pane after refresh
        pane.getChildren().addAll(new ImageView(firstCard), new ImageView(secondCard), new ImageView(thirdCard), new ImageView(fourthCard));  //display the top four cards of the shuffled deck

    }

    public static void main(String[] args){
        launch(args);
    }
}
