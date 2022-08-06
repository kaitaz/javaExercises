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
import javafx.stage.Stage;

/*(Create a simple calculator) Write a program to perform addition, subtraction,
multiplication, and division.*/

public class SimpleCalculator extends Application {
	
	private TextField number1 = new TextField();
	private TextField number2 = new TextField();
	private TextField result = new TextField();
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		
		
		HBox h1Box = new HBox();
		h1Box.setSpacing(10);
		h1Box.setPadding(new Insets(15, 15, 15, 15));
		h1Box.setAlignment(Pos.CENTER);
		Label lNumber1 = new Label("Number 1: ");
		Label lNumber2 = new Label("Number 2: ");
		Label lResult = new Label("Result: ");
		
		h1Box.getChildren().addAll(lNumber1, number1, lNumber2, number2, lResult, result);
		
	
			
		HBox hBox = new HBox();
		hBox.setSpacing(10);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.setAlignment(Pos.CENTER);
		Button addition = new Button("Add");
		Button substraction = new Button("Substract");
		Button multiplication = new Button("Multiply");
		Button division = new Button("Divide");
		hBox.getChildren().addAll(addition, substraction, multiplication, division);
		
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(h1Box);
		BorderPane.setAlignment(h1Box, Pos.CENTER);
		borderPane.setBottom(hBox);
		BorderPane.setAlignment(hBox, Pos.CENTER);
		
		addition.setOnAction(e -> add());
		substraction.setOnAction(e -> substract());
		multiplication.setOnAction(e -> multiply());
		division.setOnAction(e -> divide());
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(borderPane, 700, 100);
		primaryStage.setTitle("Calculator"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	 }
	
	private void divide() {
		double num1 = Double.parseDouble(number1.getText());
		double num2 = Double.parseDouble(number2.getText());
		result.setText(String.format("%.1f", num1 / num2));
	}

	private void multiply() {
		double num1 = Double.parseDouble(number1.getText());
		double num2 = Double.parseDouble(number2.getText());
		result.setText(String.format("%.1f", num1 * num2));
	}

	private void substract() {
		double num1 = Double.parseDouble(number1.getText());
		double num2 = Double.parseDouble(number2.getText());
		result.setText(String.format("%.1f", num1 - num2));
	}

	private void add() {
		double num1 = Double.parseDouble(number1.getText());
		double num2 = Double.parseDouble(number2.getText());
		result.setText(String.format("%.1f", num1 + num2));
		
	}

	public static void main(String[] args) {
			
			
			Application.launch(args);
			
			
			}

}
