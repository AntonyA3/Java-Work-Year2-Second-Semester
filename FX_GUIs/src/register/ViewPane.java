package register;

import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

public class ViewPane extends VBox{
	
	public ViewPane() {
		
		ListView<String> listView = new ListView<String>();
		listView.getItems().add("Lol");
		
		this.getChildren().add(listView);
	}

}
