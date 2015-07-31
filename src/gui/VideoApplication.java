package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VideoApplication extends Application{

	public static Stage primaryStage;
	
	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		StartingPane startingPane = new StartingPane();
		primaryStage.setScene(new Scene(startingPane, 400, 400));
		primaryStage.show();
	}
	
	public void setStage(Scene scene){
		primaryStage.setScene(scene);
	}
	
	public static void main(String[] args){
		launch(args);
	}

}
