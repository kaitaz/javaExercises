package ch_15_EventDrivenProgramming_and_Animation;

/*15.1 (Pick four cards) Write a program that lets the user click the Refresh button to
display four cards from a deck of 52 cards,*/
import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class PickFourCards extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		// Generate the card
		int [] deck = new int[52];
		int [] index = new int[4];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for (int i = 0; i < index.length; i++) {
			index[i] = (int) (Math.random() * deck.length);
		}
		
		//Create a button with Lambda expression 
		Button btn = new Button("Refresh");
		btn.setOnAction(( e) -> {
			start(primaryStage);
		});
		
		HBox pane = getHBox(index[0], index[1], index[2], index[3]);
		BorderPane borderPane = new BorderPane();
		borderPane.setTop(pane);
		borderPane.setBottom(btn);
		BorderPane.setAlignment(btn, Pos.BOTTOM_CENTER);
		Scene scene = new Scene(borderPane);
		primaryStage.setTitle("Pick Four Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private HBox getHBox(int index1, int index2, int index3, int index4) {
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets (15, 15, 15, 15));
		ImageView imageView1 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index1 + ".png.png");
		ImageView imageView2 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index2 + ".png.png");
		ImageView imageView3 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index3 + ".png.png");
		ImageView imageView4 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index4 + ".png.png");
		imageView1.setFitHeight(300);
		imageView1.setFitWidth(200);
		imageView2.setFitHeight(300);
		imageView2.setFitWidth(200);
		imageView3.setFitHeight(300);
		imageView3.setFitWidth(200);
		imageView4.setFitHeight(300);
		imageView4.setFitWidth(200);
		hBox.getChildren().addAll(imageView1, imageView2, imageView3, imageView4);
		return hBox;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
