package application;

import javafx.application.Application;


import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		int [] deck = new int[52];
		int [] index = new int[3];
		for (int i = 0; i < deck.length; i++) {
			deck[i] = i;
		}
		
		for (int i = 0; i < index.length; i++) {
			index[i] = (int) (Math.random() * deck.length);
		}
		
		HBox pane = getHBox(index[0], index[1], index[2]);
		//Pane pane = new HBox(getHBox(index[0], index[1], index[2]));
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Display Three Cards");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private HBox getHBox(int index1, int index2, int index3) {
		HBox hBox = new HBox(10);
		hBox.setPadding(new Insets (15, 15, 15, 15));
		ImageView imageView1 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index1 + ".png.png");
		ImageView imageView2 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index2 + ".png.png");
		ImageView imageView3 = new ImageView("file:///C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + index3 + ".png.png");
		hBox.getChildren().addAll(imageView1, imageView2, imageView3);
		return hBox;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

