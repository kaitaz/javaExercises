module JavaFX {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens application to javafx.graphics, javafx.fxml;
	opens ch_14_JavaFX_Basics to javafx.graphics, javafx.fxml;
}
