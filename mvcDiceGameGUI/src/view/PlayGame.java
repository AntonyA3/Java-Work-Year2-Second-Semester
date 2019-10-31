package view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import model.Player;


public class PlayGame extends GridPane{
	private Label label1, label2, label3;
	private ComboBox<Player> cb;
	private TextField tf1, tf2;
	private Button btn1;
	
	public PlayGame() {
		this.label1 = new Label("Select Opponent");
		this.add(label1, 0, 0);
		
		this.label2 = new Label("First name");
		this.add(label2, 0, 1);
		
		this.label3 = new Label("Surname");
		this.add(label3, 0, 2);
		
		
		this.cb = new ComboBox<Player>();
		this.add(cb, 1, 0);
		
		
		this.tf1 = new TextField("Name");
		this.add(tf1, 1, 1);
		
		this.tf2 = new TextField("Name");
		this.add(tf2, 1, 2);
		
		this.btn1 = new Button("Play Game");
		this.add(btn1, 1, 3);
		
		
		ColumnConstraints c0 = new ColumnConstraints(100, 200, Double.MAX_VALUE );
		ColumnConstraints c1 = new ColumnConstraints(100, 200, Double.MAX_VALUE);
		c1.setHgrow(Priority.ALWAYS);
		this.getColumnConstraints().addAll(c0, c1);
	}
		
	public void setOpponents(Player[] players) {
		cb.getItems().addAll(players);
		cb.getSelectionModel().select(0);
	}
	
	public String getFirstName() {
		return this.tf1.getText();
	}
	
	public String getSurname() {
		return this.tf2.getText();
	}
	
	public Player getSelectedOpponent() {
		return this.cb.getSelectionModel().getSelectedItem();
		
	}
	
	public void addComboBoxHandler(EventHandler<ActionEvent> handler) {
		cb.setOnAction(handler);
	}
	
	public void addPlayGameHandler(EventHandler<ActionEvent> handler) {
		btn1.setOnAction(handler);
		
	}
	
	
	
	
			

	
}
