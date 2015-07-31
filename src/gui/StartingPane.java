package gui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class StartingPane extends GridPane{
	
	public StartingPane (){
		this.setAlignment(Pos.CENTER);
		this.setHgap(10);
		this.setVgap(10);
		this.setPadding(new Insets(25, 25, 25, 25));
		
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		this.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("First Name:");
		this.add(userName, 0, 1);

		TextField userTextField = new TextField();
		this.add(userTextField, 1, 1);

		Label pw = new Label("Last Name:");
		this.add(pw, 0, 2);

		TextField pwBox = new TextField();
		this.add(pwBox, 1, 2);
		
		Button btn = new Button();
		btn.setText("Make User");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				//TODO: Add some interaction
			}
		});
		btn.setAlignment(Pos.BOTTOM_RIGHT);
		this.add(btn, 1, 3);
	}
}
