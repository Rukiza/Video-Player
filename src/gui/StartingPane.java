package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StartingPane extends GridPane {

	public StartingPane() {
		this.setAlignment(Pos.CENTER);
		this.setHgap(10);
		this.setVgap(10);
		this.setPadding(new Insets(25, 25, 25, 25));
		
		Text sceneTitle = new Text("Video Player");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 50));
		this.add(sceneTitle, 0, 0, 2, 2);

		//TODO: Convert to lambda function if applicable.
		// Creates a user create button
		this.add(makeButton("Create User", new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				VideoApplication.setStage(new Scene(new CreateUserPane(),
						VideoApplication.width, VideoApplication.height));
			}
		}), 0, 2);

		//TODO: Convert to lambda function if applicable.
		// Make a button that takes you to the use existing
		// user menu
		this.add(makeButton("Use Existing", new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO: Add Selecting an existing user panel
			}
		}), 1, 2);
	}

	/**
	 * Used for making button on the pane.
	 * 
	 * @param name
	 *            - name of the button.
	 * @param handler
	 *            - the event handler for when the button is pressed
	 * @return - returns a newly made button
	 */
	private Button makeButton(String name, EventHandler<ActionEvent> handler) {
		Button btn = new Button();
		btn.setText(name);
		btn.setOnAction(handler);
		btn.setMaxWidth(Double.MAX_VALUE);
		return btn;
	}
}
