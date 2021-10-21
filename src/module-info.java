module JavaFX {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens ch_14_JavaFX_Basics to javafx.graphics, javafx.fxml;
	opens ch_15_EventDrivenProgramming_and_Animation to javafx.graphics, javafx.fxml;
}
