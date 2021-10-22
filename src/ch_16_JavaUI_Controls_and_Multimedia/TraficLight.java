package ch_16_JavaUI_Controls_and_Multimedia;
/*16.3 (Traffic lights) Write a program that simulates a traffic light. The program
lets the user select one of three lights: red, yellow, or green. When a radio
button is selected, the light is turned on. Only one light can be on at a time.
No light is on when the program starts.*/

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TraficLight extends Application {

	@Override
	public void start(Stage primaryStage)  {
		
		// Create a scene and place it in the Stage
		Scene scene = new Scene(getPane(), 200, 300);
		primaryStage.setTitle("Trafic Light");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	protected BorderPane getPane() {
		//Create a pane for Lights with nodes inside
		Circle redCircle = new Circle (50, 50, 25);
		Circle yellowCircle = new Circle (50, 50, 25);
		Circle greenCircle = new Circle (50, 50, 25);
		VBox lightPane = new VBox(30);
		lightPane.setPadding(new Insets(5, 5, 5, 5));
		lightPane.setAlignment(Pos.CENTER);
		lightPane.setStyle("-fx-border-color: black; -fx-background-color: white; ");
		lightPane.getChildren().addAll(redCircle, yellowCircle, greenCircle);
		
		//Create a pane for radio button 
		RadioButton rbRed = new RadioButton("Red");
		redCircle.setFill(Color.GREY);
		RadioButton rbYellow = new RadioButton("Yellow");
		yellowCircle.setFill(Color.GREY);
		RadioButton rbGreen = new RadioButton("Green");
		greenCircle.setFill(Color.GREY);
		HBox rbPane = new HBox(5);
		rbPane.setPadding(new Insets(5, 5, 5, 5));
		rbPane.setAlignment(Pos.CENTER);
		rbPane.setStyle("-fx-border-color: black; -fx-background-color: white; ");
		rbPane.getChildren().addAll(rbRed, rbYellow, rbGreen);
		
		ToggleGroup rbGroup = new ToggleGroup();
		rbRed.setToggleGroup(rbGroup);
		rbYellow.setToggleGroup(rbGroup);
		rbGreen.setToggleGroup(rbGroup);
		
		rbRed.setOnAction((e) -> {
			if (rbRed.isSelected()) {
				redCircle.setFill(Color.RED);
				yellowCircle.setFill(Color.GREY);
				greenCircle.setFill(Color.GREY);}
		});
		
		rbYellow.setOnAction((e) -> {
			if (rbYellow.isSelected()) {
				redCircle.setFill(Color.GREY);
				yellowCircle.setFill(Color.YELLOW);
				greenCircle.setFill(Color.GREY);}
		});
		
		rbGreen.setOnAction((e) -> {
			if (rbGreen.isSelected()) {
				redCircle.setFill(Color.GREY);
				yellowCircle.setFill(Color.GREY);
				greenCircle.setFill(Color.GREEN);}
		});
		
		// Create a border Pane
		BorderPane pane = new BorderPane();
		pane.setCenter(lightPane);
		pane.setBottom(rbPane);
		
		return pane;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
