package edu.gsu.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SecurityQuestionController implements Initializable {
	
	
	@FXML
	private TextField tf_securityAnswer;
	
	@FXML 
	private Button retrievePassword;
	
	@FXML
	private Button ReturnLogin;
	
	@FXML
	private Label ShowSecurityQuestion; 
	
	public void displaySecurityQuestion (String SecurityQuestion){
		ShowSecurityQuestion.setText(SecurityQuestion);
	}

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		ReturnLogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.changeScene(event, "Login.fxml", "Coral Blue Air Login");
			}
						
		});
		
		retrievePassword.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.retrivePassword(event, tf_securityAnswer.getText());
			}
			
		}
	);
		
	}
	

}
