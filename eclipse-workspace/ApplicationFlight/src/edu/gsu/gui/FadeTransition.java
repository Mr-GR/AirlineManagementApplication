 package edu.gsu.gui;
 
 import javafx.event.ActionEvent;
 import javafx.event.EventHandler;
 import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
 

public class FadeTransition {
	
	public static void applyFadeTransition(Node node, java.time.Duration duration, EventHandler<ActionEvent> event) {
		javafx.animation.FadeTransition fadeIn = new javafx.animation.FadeTransition();
		fadeIn.setCycleCount(1);
		fadeIn.setFromValue(0.2);
		fadeIn.setToValue(1);
		fadeIn.setAutoReverse(true);
		
		javafx.animation.FadeTransition fadeOut = new javafx.animation.FadeTransition();
		fadeOut.setCycleCount(1);
		fadeOut.setFromValue(1);
		fadeOut.setToValue(0.2);
		fadeOut.setAutoReverse(true);
		
		fadeOut.play();
		fadeOut.setOnFinished((e) -> {
			fadeIn.play();
		});
	}


}
