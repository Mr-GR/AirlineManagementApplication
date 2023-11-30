package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.fxml.FXMLLoader;


public class Main extends Application {

	
	Stage window;
	Scene scene1, scene2;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		
		Label label1 = new Label("Scene1");
		Button button = new Button("Flights");
		button.setOnAction(e -> window.setScene(scene2));
		
		
		VBox layout1 = new VBox(20);
		layout1.getChildren().addAll(label1, button);
		scene1 = new Scene(layout1, 300, 300);
		
		
		Button button2 = new Button("Main Menu");
		button2.setOnAction(e -> window.setScene(scene1));
		
		StackPane layout2 = new StackPane();
		layout2.getChildren().add(button2);
		scene2 = new Scene(layout2, 200, 200);
		
		window.setScene(scene1);
		window.setTitle("Airline Project");
		window.show();
		
		
		
		

		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
