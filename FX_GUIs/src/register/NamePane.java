package register;


import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.beans.value.ObservableStringValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class NamePane extends GridPane{
	
	public NamePane() {
		
		this.setVgap(10);
		this.setHgap(10);
		this.setStyle("-fx-background-color: #D6D6D6;");
		this.setAlignment(Pos.CENTER);
	
		
		Text title = new Text("Title");
		
		this.add(title, 0, 0);
		
		Text firstName = new Text("First Name");
		this.add(firstName, 0, 1);
		
		Text surname = new Text("Surname");
		this.add(surname, 0, 2);
		
		ObservableList<String> nameTitle = FXCollections.observableArrayList("Mr","Mrs", "Ms","Miss", "Dr"); 
		
		ChoiceBox<String> titleBox = new ChoiceBox<String>();
		titleBox.setItems(nameTitle);
		this.add(titleBox, 1, 0);
		
		TextField firstNameBox = new TextField();
		this.add(firstNameBox, 1, 1);
		
		TextField surnameBox = new TextField();
		this.add(surnameBox, 1, 2);
		
		
	
		
		

		
	}

}
