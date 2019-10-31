package register;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;

public class RegisterRootPane extends VBox {
	private NamePane namePane;
	private ButtonPane buttonPane;
	private ViewPane viewPane;
	
	public RegisterRootPane() {
		namePane = new NamePane();
		//namePane.setPadding(new Insets(50, 25, 50, 25));
		this.getChildren().add(namePane);
		
		
		buttonPane = new ButtonPane();
		//buttonPane.setPadding(new Insets(5, 25, 50, 25));
		this.getChildren().add(buttonPane);
		
		viewPane = new ViewPane();
		viewPane.setStyle("-fx-background-color: #D68626;");
		//viewPane.setPadding(new Insets(5, 25, 50, 25));
		this.getChildren().add(viewPane);
		
		this.setSpacing(10);
		this.setPadding(new Insets(25));
		
	}

}
