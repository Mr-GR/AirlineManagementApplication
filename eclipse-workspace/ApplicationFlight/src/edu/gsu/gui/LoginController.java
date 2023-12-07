package edu.gsu.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class LoginController implements Initializable {

	
	@FXML
	private Button LoginButton;
	
	@FXML 
	private Button NewUserButton;
	
	@FXML 
	private Button ForgotButton; 
	
	@FXML
	private TextField tf_username;
	
	@FXML
	private TextField tf_password;
	


	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		LoginButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.logInUser(event, tf_username.getText(), tf_password.getText());
				
		}
		});
		
		NewUserButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.changeScene(event, "SignUp.fxml", "Sign UP!");
			}
		});
		
		ForgotButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.changeScene(event, "ForgotPassword.fxml", "Retrive Question");
			}
		});
		
		
		
		
	}
	


}
