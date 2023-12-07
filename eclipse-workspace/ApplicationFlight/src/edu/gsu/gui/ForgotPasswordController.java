package edu.gsu.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ForgotPasswordController implements Initializable {
	
	@FXML
	private TextField tf_username;
	
	@FXML
	private TextField tf_securityAnswer;
	
	@FXML 
	private Button ReturnLogin; 
	
	@FXML
	private Button retrieveQuestion;
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		
		retrieveQuestion.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.retrieveQuestion(event, tf_username.getText());
			}
		});
		
	
			
		ReturnLogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.changeScene(event, "Login.fxml", "Log in!");
			}
				
			
		});
		
	}
}
