package Chapter_15_EventDrivenProgramming_and_Animations;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*(Alternate two messages) Write a program to display the text Java is fun
and Java is powerful alternately with a mouse click.*/

public class AlterateTwoMessages extends Application {
	private Text textDisplay = new Text(40, 40, "Programming is fun");
	
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		
		
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setAlignment(Pos.CENTER);
		
		hBox.setOnMouseClicked(e -> alternateText());
		hBox.getChildren().add(textDisplay);
		
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(hBox, 300, 100);
		primaryStage.setTitle("Alterate Two Messages"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	 }
	

	private void alternateText() {
		if(textDisplay.getText() == "Programming is fun") {
			textDisplay.setText("Programming is powerful");
			}
		else {
			textDisplay.setText("Programming is fun");
			}
	}


	public static void main(String[] args) {
			
			
			Application.launch(args);
			
			
			}

}
