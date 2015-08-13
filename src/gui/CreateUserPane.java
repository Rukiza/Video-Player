package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CreateUserPane extends GridPane {

	private TextField firstName;
	private TextField lastName;

	public CreateUserPane() {

		this.setAlignment(Pos.CENTER);
		this.setHgap(10);
		this.setVgap(10);
		this.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Create a User");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		this.add(scenetitle, 0, 0, 2, 1);

		// Makes the text fields and labels
		this.add(makeTextArea(), 0, 1, 2, 2);

		// Creates the Make user button
		// Should create a user and take them to the user interaction screen.
		this.add(makeButton("Make User", new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO: Make User
				// TODO: Load User
				// TODO: Load in user menu.
			}
		}), 1, 3);

		// Creates the back button
		// when clicked should take you back to the starting pane.
		this.add(makeButton("Back", new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				VideoApplication.setStage(new Scene(new StartingPane(),
						VideoApplication.width, VideoApplication.height));
			}
		}), 0, 3);
	}

	/**
	 * Makes buttons.
	 * 
	 * @param name
	 *            - name of the button
	 * @param handler
	 *            - the event handler for the button
	 * @return - a new button.
	 */
	private Button makeButton(String name, EventHandler<ActionEvent> handler) {
		Button btn = new Button();
		btn.setText(name);
		btn.setOnAction(handler);
		return btn;
	}

	/**
	 * Creates the Text area
	 * 
	 * @return - VBox contain the fist name, last name and there accociated text
	 *         fields
	 */
	private VBox makeTextArea() {
		HBox top = new HBox();
		HBox bottom = new HBox();
		Label fn = new Label("First Name:");
		Label ln = new Label("Last Name:");
		firstName = new TextField();
		lastName = new TextField();
		top.getChildren().addAll(fn, firstName);
		bottom.getChildren().addAll(ln, lastName);
		VBox box = new VBox();
		box.getChildren().addAll(top, bottom);
		return box;
	}
}
