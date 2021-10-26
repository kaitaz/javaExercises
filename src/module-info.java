module JavaFX {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.base;
	
	opens ch_14_JavaFX_Basics to javafx.graphics, javafx.fxml;
	opens ch_15_EventDrivenProgramming_and_Animation to javafx.graphics, javafx.fxml;
	opens ch_16_JavaUI_Controls_and_Multimedia to javafx.graphics, javafx.fxml;
	opens ch_17_Binary_IO to javafx.graphics, javafx.fxml;
	opens ch_18_Recursion to javafx.graphics, javafx.fxml;
	opens ch_19_Generics to javafx.graphics, javafx.fxml;
	
	opens ImportedClass to javafx.graphics, javafx.fxml;
}
