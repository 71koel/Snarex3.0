package de.hft_stuttgart.snarex.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane outerPane = (BorderPane) FXMLLoader.load(ClassLoader.getSystemResource("de/hft_stuttgart/snarex/view/View.fxml")); 
		primaryStage.setScene(new Scene(outerPane));
		primaryStage.setTitle("Snarex");
		primaryStage.show();
		
		
	}
	
	
	
	public static void main (String[]args) {
		launch(args);
	}

}
