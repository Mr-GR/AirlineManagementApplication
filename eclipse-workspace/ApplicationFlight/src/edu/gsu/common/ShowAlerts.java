package edu.gsu.common;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ShowAlerts {

	
	
	public void showAlert(String title, String header, String content, AlertType alertType) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }


}
