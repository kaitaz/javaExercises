package ch_14_JavaFX_Basics;

/*14.9 (Create four fans) Write a program that places four fans in a GridPane with two
rows and two columns,*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Create4Fans extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		//Create GridPane
		GridPane gridpane = new GridPane();
		gridpane.setAlignment(Pos.CENTER);
		gridpane.setPadding(new Insets(25, 25, 25, 25));
		gridpane.setHgap(15);
		gridpane.setVgap(15);
		
		//Create node
		gridpane.add(fan(), 0, 0);
		gridpane.add(fan(), 0, 1);
		gridpane.add(fan(), 1, 0);
		gridpane.add(fan(), 1, 1);
		
		//Create a scene and pace the pane inside
		Scene scene = new Scene(gridpane);
		primaryStage.setTitle("Show four Fans");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	private Group fan() {
		// Create Circle and Arcs
		
		Circle circle = new Circle(150, 150, 82);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		Arc arc1 = new Arc (150, 150, 80, 80, 30, 35);
		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);
		
		Arc arc2 = new Arc (150, 150, 80, 80, 30 + 90, 35);
		arc2.setFill(Color.RED);
		arc2.setType(ArcType.ROUND);
		
		Arc arc3 = new Arc (150, 150, 80, 80, 30 + 180, 35);
		arc3.setFill(Color.RED);
		arc3.setType(ArcType.ROUND);
		
		Arc arc4 = new Arc (150, 150, 80, 80, 30 + 270, 35);
		arc4.setFill(Color.RED);
		arc4.setType(ArcType.ROUND);
		
		Group group = new Group();
		group.getChildren().addAll(circle, arc1, arc2, arc3, arc4);
		
		
		return group;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
