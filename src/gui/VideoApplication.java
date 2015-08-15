package gui;

import java.util.List;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import user.User;

import java.util.ArrayList;

public class VideoApplication extends Application {

	public static Stage primaryStage;
	public static final double height = 400;
	public static final double width = 400;

	//All users that can be logged on to.
	private List<User> userList;


	@Override
	public void start(Stage stage) throws Exception {
		primaryStage = stage;
		StartingPane startingPane = new StartingPane();
		primaryStage.setScene(new Scene(startingPane, VideoApplication.width,
                VideoApplication.height));
		primaryStage.show();

        userList = new ArrayList<>();
	}

	public static void setStage(Scene scene) {
		primaryStage.setScene(scene);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
