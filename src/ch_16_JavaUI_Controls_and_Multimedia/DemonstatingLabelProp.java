package ch_16_JavaUI_Controls_and_Multimedia;
/*16.15 (Demonstrate Label properties) Write a program to let the user dynamically
set the properties contentDisplay and graphicTextGap,*/

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DemonstatingLabelProp extends Application {

	@Override
	public void start(Stage primaryStage)  {
		
		// Create a scene and place it in the Stage
		Scene scene = new Scene(getPane(), 430, 150);
		primaryStage.setTitle("Demo Label Prop");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	protected GridPane getPane() {
		//Create a pane for Label
		Label lb = new Label("CIRCLE", new Circle(50, 50, 25));
		lb.setContentDisplay(ContentDisplay.BOTTOM);
		lb.setTextFill(Color.BLACK);
		lb.setGraphicTextGap(5);

		HBox lbPane = new HBox(30);
		lbPane.setPadding(new Insets(5, 5, 5, 5));
		lbPane.setAlignment(Pos.CENTER);
		lbPane.setStyle("-fx-border-color: black; -fx-background-color: white; ");
		lbPane.getChildren().add(lb);
		
		//Create a pane for Label Properties
		String[] pos = {"TOP", "BOTTOM", "LEFT", "RIGHT"};
		ComboBox<String> cbo = new ComboBox<>();
		cbo.setValue(pos[3]);
		Label lbCbo = new Label("contentDisplay: ",cbo);
		lbCbo.setContentDisplay(ContentDisplay.RIGHT);
		lbCbo.setTextFill(Color.BLACK); 
		lbCbo.setGraphicTextGap(5);
		
		TextField tf = new TextField("5");
		Label lbTxt = new Label("graphicTextGap: ",tf);
		lbTxt.setContentDisplay(ContentDisplay.RIGHT);
		lbTxt.setTextFill(Color.BLACK);
		lbTxt.setGraphicTextGap(5);
		
		HBox lbPropPane = new HBox(30);
		lbPropPane.setPadding(new Insets(5, 5, 5, 5));
		lbPropPane.setAlignment(Pos.CENTER);
		lbPropPane.setStyle("-fx-border-color: black; -fx-background-color: white; ");
		lbPropPane.getChildren().addAll(lbCbo, lbTxt);
		//Observable list and actions
		ObservableList<String> items = FXCollections.observableArrayList(pos);
			cbo.getItems().addAll(items);
		cbo.setOnAction((e) -> {
			switch (items.indexOf(cbo.getValue())) {
			case 0: lb.setContentDisplay(ContentDisplay.TOP); break;
			case 1: lb.setContentDisplay(ContentDisplay.BOTTOM); break;
			case 2: lb.setContentDisplay(ContentDisplay.LEFT); break;
			case 3: lb.setContentDisplay(ContentDisplay.RIGHT); break;
			}
		});
		
		tf.setOnAction(e -> lb.setGraphicTextGap(Double.valueOf(tf.getText())));
		
		// Create a border Pane
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.add(lbPropPane, 0, 0);
		pane.add(lbPane, 0, 1);
		
		return pane;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
