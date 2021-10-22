package ch_15_EventDrivenProgramming_and_Animation;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RunningFan extends Application{
	
	@Override
	public void start(Stage primaryStage) {
		//Create a path circle
		Circle circlePath = new Circle(100, 100, 1);
		circlePath.setStroke(Color.BLACK);
		circlePath.setFill(Color.WHITE);
		
		Circle circle = new Circle(100, 100, 84);
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		
		Arc arc1 = new Arc (100, 100, 80, 80, 30, 35);
		arc1.setFill(Color.RED);
		arc1.setType(ArcType.ROUND);
		
		Arc arc2 = new Arc (100, 100, 80, 80, 30 + 90, 35);
		arc2.setFill(Color.RED);
		arc2.setType(ArcType.ROUND);
		
		Arc arc3 = new Arc (100, 100, 80, 80, 30 + 180, 35);
		arc3.setFill(Color.RED);
		arc3.setType(ArcType.ROUND);
		
		Arc arc4 = new Arc (100, 100, 80, 80, 30 + 270, 35);
		arc4.setFill(Color.RED);
		arc4.setType(ArcType.ROUND);
		
		Group group = new Group();
		group.getChildren().addAll(arc1, arc2, arc3, arc4);
		
		//Create an animation
		PathTransition pt = new PathTransition();
		pt.setDuration(Duration.seconds(6));
		pt.setPath(circlePath);
		pt.setNode(group);
		pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(false);
		pt.play();
		
		
		//Create Pane
		Pane pane = new Pane();
		pane.setPadding(new Insets(15, 15, 15, 15));
		pane.getChildren().addAll(circle, group);
		
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets (15, 15, 15, 15));
		Button btn1 = new Button("Pause");
		Button btn2 = new Button("Resume");
		Button btn3 = new Button("Reverse");
		btn1.setOnAction(( e) -> pt.pause());
		btn2.setOnAction(( e) -> {
			pt.stop();
			pt.setAutoReverse(false);
			pt.play();
			});
		btn3.setOnAction(( e) -> {
			pt.stop();
			pt.setAutoReverse(true);
			pt.play();
			});
		hBox.getChildren().addAll(btn1, btn2, btn3);
		
		
		//Create a border Pane
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(pane);
		borderPane.setBottom(hBox);
		
		//Create a scene and pace the pane inside
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Show four Fans");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}


