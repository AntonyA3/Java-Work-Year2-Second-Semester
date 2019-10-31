package register;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPane extends HBox {
	
	public ButtonPane() {
		
		this.setSpacing(10);
		this.setAlignment(Pos.CENTER);
		Button add = new Button("Add");
		this.getChildren().add(add);
		
		Button clear = new Button("Clear");
		this.getChildren().add(clear);
		
		Button remove = new Button("Remove");
		this.getChildren().add(remove);
		
		Button submit = new Button("Submit");
		this.getChildren().add(submit);
		
	}

}
