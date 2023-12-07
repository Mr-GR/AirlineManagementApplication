package edu.gsu.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXML;




public class AdminPageController implements Initializable {
	
	@FXML
	private GridPane parent;
	
	@FXML
	public void initialize(URL url, ResourceBundle rb) {
		//TODO
	}
	
	@FXML
	private void close_app(MouseEvent event) {
		System.exit(0);
	}
	
	@FXML
	private void verify(MouseEvent event) {
		System.out.print("Log IN");
	}

	
}
