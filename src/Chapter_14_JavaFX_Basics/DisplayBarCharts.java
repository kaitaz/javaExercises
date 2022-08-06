package Chapter_14_JavaFX_Basics;

import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/*(Display a bar chart) Write a program that uses a bar chart to display the
percentages of the overall grade represented by projects, quizzes, midterm
exams, and the final exam, as shown in Figure 14.46b. Suppose projects take
20% and are displayed in red, quizzes take 10% and are displayed in blue,
midterm exams take 30% and are displayed in green, and the final exam takes
40% and is displayed in orange. Use the Rectangle class to display the bars.*/

public class DisplayBarCharts extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		VBox vBox = new VBox(10);
		//vBox.setPadding(new Insets(5, 5, 5, 5));
		vBox.getChildren().add(new Label("Project -- 20%"));
		Rectangle r1 = new Rectangle(5, 5, 60, 20);
		r1.setFill(Color.RED);
		vBox.setAlignment(Pos.BOTTOM_CENTER);
		vBox.getChildren().add(r1);
		
		VBox vBox1 = new VBox(10);
		//vBox1.setPadding(new Insets(5, 5, 5, 5));
		vBox1.getChildren().add(new Label("Quiz -- 10%"));
		Rectangle r2 = new Rectangle(5, 5, 60, 10);
		r2.setFill(Color.BLUE);
		vBox1.setAlignment(Pos.BOTTOM_CENTER);
		vBox1.getChildren().add(r2);
		
		VBox vBox2 = new VBox(10);
		//vBox2.setPadding(new Insets(5, 5, 5, 5));
		vBox2.getChildren().add(new Label("Midterm -- 30%"));
		Rectangle r3 = new Rectangle(5, 5, 60, 30);
		r3.setFill(Color.GREEN);
		vBox2.setAlignment(Pos.BOTTOM_CENTER);
		vBox2.getChildren().add(r3);
		
		VBox vBox3 = new VBox(10);
		//vBox3.setPadding(new Insets(5, 5, 5, 5));
		vBox3.getChildren().add(new Label("Final -- 40%"));
		Rectangle r4 = new Rectangle(5, 5, 60, 40);
		r4.setFill(Color.YELLOW);
		vBox3.setAlignment(Pos.BOTTOM_CENTER);
		vBox3.getChildren().add(r4);
	  
		Pane hBox = new HBox(50);
		hBox.setPadding(new Insets(15, 15, 15, 15));
		hBox.getChildren().addAll(vBox, vBox1, vBox2, vBox3);
	   
		BorderPane pane = new BorderPane();
		hBox.setPadding(new Insets(15, 15, 15, 15));
		pane.setBottom(hBox);
		
	    Scene scene = new Scene(pane);
	    primaryStage.setTitle("MyJavaFX"); 
	    primaryStage.setScene(scene); // 
	    primaryStage.show(); 
	  }

	public static void main(String[] args) {
		
		
		Application.launch(args);
		
		
		}
		
	
	

}
