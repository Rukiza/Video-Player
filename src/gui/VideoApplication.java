package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VideoApplication extends Application {

	public static Stage primaryStage;
	public static final double height = 400;
	public static final double width = 400;

	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		StartingPane startingPane = new StartingPane();
		primaryStage.setScene(new Scene(startingPane, VideoApplication.width,
				VideoApplication.height));
		primaryStage.show();
	}

	public static void setStage(Scene scene) {
		primaryStage.setScene(scene);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
