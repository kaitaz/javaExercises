package ch_15_EventDrivenProgramming_and_Animation;



/*15.15 (Geometry: add and remove points) Write a program that lets the user click on
a pane to dynamically create and remove points. When the user left-clicks the mouse (primary button),
 a point is created and displayed at the mouse point. The user can remove a point by
  pointing to it and rightclicking the mouse (secondary button).*/

import javafx.application.Application;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;

public class Add_Remove_Points extends Application{

	@Override
	public void start(Stage primaryStage) {
		
		//ArrayList<Point2D> list = new ArrayList<>();
		
		// Create a Pane in a Stage
		
		Pane pane = new Pane();
		pane.setOnMouseClicked(e -> {
			Node point = new Circle(e.getX(), e.getY(), 10);
			if (e.getButton() == MouseButton.PRIMARY) {
				pane.getChildren().add(point);
				
			point.setOnMouseClicked(evt -> {
	            if (evt.getButton() == MouseButton.SECONDARY) {
	                evt.consume();
	                pane.getChildren().remove(point);}
	        });}
		});
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Add and remove Points");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		Application.launch(args);
	}

}
