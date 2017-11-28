import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class Characters extends Application {
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();  //create new pane
        pane.setPrefSize(300,300);
        double paneCenter = pane.getPrefWidth()/2;

        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR,35);  //create font

        String welcome = new String("WELCOME TO JAVA");  //create string and its rotation properties and radius of text circle
        double textRotation = 0;
        double radius = 100;

        for(int i = 0; i<welcome.length(); i++){ //for loop to place each letter in a circle and rotate it appropriately
            double x = paneCenter + Math.cos(Math.toRadians(textRotation)) * radius;
            double y = paneCenter + Math.sin(Math.toRadians(textRotation)) * radius;
            Text text = new Text(x, y, welcome.charAt(i) + " ");
            text.setFont(font);
            text.setRotate(textRotation);
            pane.getChildren().add(text);
            textRotation += (360/welcome.length());
        }

        Scene scene = new Scene(pane);  //display text in scene
        primaryStage.setTitle("Characters around circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
