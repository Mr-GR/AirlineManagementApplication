package edu.gsu.gui;
	
import javafx.animation.PauseTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        showSplashScreen(primaryStage);
    }

    private void showSplashScreen(Stage primaryStage) {
        // Create a separate stage for the splash screen
        Stage splashStage = new Stage();
        splashStage.initStyle(StageStyle.UNDECORATED);

        try {
           
            FXMLLoader loader = new FXMLLoader(getClass().getResource("SplashWelcome.fxml"));
            Parent splashRoot = loader.load();

          
            Scene splashScene = new Scene(splashRoot);
            splashStage.setScene(splashScene);
            splashStage.show();

            SplashWelcomeController splashController = loader.getController();

           
            PauseTransition pause = new PauseTransition(Duration.seconds(3));
            pause.setOnFinished(event -> {
                splashStage.close();

                loadMainContent(primaryStage);
            });
            pause.play();

        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }

    private void loadMainContent(Stage primaryStage) {
        try {
           
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            primaryStage.setTitle("Coral Blue Air Login");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
    }
}
