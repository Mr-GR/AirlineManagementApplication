package edu.gsu.gui;

import java.net.URL;

import java.util.ResourceBundle;

import edu.gsu.common.User;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;

public class LoggedInController implements Initializable {
	

	
	@FXML
	private Button BackToHome;
	
	@FXML
	private Button CheckBooked;
	
	@FXML
	private Button SearchFlights; 
	
	

	@Override
	public void initialize(URL url, ResourceBundle RB) {
		
		BackToHome.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.changeScene(event, "Login.fxml", "Log in!");
			}
		});
		
		SearchFlights.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				DBUtilites.changeScene(event, "SearchBooked.fxml", "Search Flights!");
				
			}
			
		});
		
		CheckBooked.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) { 
				DBUtilites.changeScene(event, "CheckBooked.fxml", "Check Your Flights");
			}
		});
		
		
	}
}
