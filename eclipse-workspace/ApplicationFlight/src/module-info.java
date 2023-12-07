module ApplicationGUI {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.sql;
	requires com.jfoenix;
	requires javafx.base;
	
	opens edu.gsu.gui to javafx.graphics, javafx.fxml, javafx.base;
	
}
