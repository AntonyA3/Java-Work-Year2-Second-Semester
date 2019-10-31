package view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class GameResult extends HBox{
	TextArea ta;
	HBox hbox;
	
	public GameResult() {
		this.hbox = new HBox();
		this.ta = new TextArea();
		ta.setPadding(new Insets(64));
		HBox.setHgrow(ta, Priority.ALWAYS);
		
		this.getChildren().add(ta);
		
		
		
	}
	
	public void setResultText(String text) {
		ta.setText(text);
		
	}
	
	
}
