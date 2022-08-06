package Chapter_14_JavaFX_Basics;

import javafx.application.Application;


import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


//(Display three cards) Write a program that displays three cards randomly
//selected from a deck of 52, as shown in Figure 14.43c. The card image files are
//named 1.png, 2.png, . . . , 52.png and stored in the image/card directory. All
//three cards are distinct and selected randomly.


	
	public class DisplayThreeCards extends Application {
		
		@Override // Override the start method in the Application class
		  public void start(Stage primaryStage) {
		  
			int[] numbers = randomShuffle();
			Pane hBox = new HBox(20);
			hBox.setPadding(new Insets(15, 15, 15, 15));
			hBox.setStyle("−fx−background−color: green");
			
			for (int i = 0; i < 3; i++) {
				ImageView imageView = new ImageView(new Image("C:/Users/grecu/eclipse-workspace/JavaFX/src/resources/" + numbers[i] + ".png.png"));
				hBox.getChildren().add(imageView);}
		   
		    Scene scene = new Scene(hBox);
		    primaryStage.setTitle("MyJavaFX"); 
		    primaryStage.setScene(scene); // 
		    primaryStage.show(); 
		  }
		
		private int[] randomShuffle() {
			
			int[] number = new int[51];
			for (int i = 0; i < number.length; i++) {
				number[i] = i;
			}
			
			for (int i = 0; i < number.length; i++) {
				// Generate an index j randomly
				int j = (int)(Math.random() * number.length);
				// Swap myList[i] with myList[j]
				int temp = number[i];
				number[i] = number[j];
				number[j] = temp;
				}
		
			return number;
		}

		public static void main(String[] args) {
			
			
			Application.launch(args);
			
			
			}
	
	
	
}
	


