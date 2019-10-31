package view;

import java.util.Observer;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import model.Counter;

public class CounterPane extends HBox implements Observer{


	private Label numberField;
	private Button plusButton;
	private Button minusButton;

	//accepts a reference to the model for event handling
	public CounterPane() {
		//set the style for this pane 
		this.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		this.getStyleClass().add("counter-pane");

	
		
		// ------------Number Field-----------------------
		numberField = new Label();
		
        //---------------Plus Button---------------------
        this.plusButton = new Button("+");
      
        
        //---------------Minus Button---------------------
        this.minusButton = new Button("-");
  
        //add nodes to the scene graph for this pane
        this.getChildren().addAll(minusButton, numberField, plusButton);
	
	}

	//updates the view
    public void updateTextField(int count) {
    	numberField.setText(String.valueOf(count));
    }
    
    public void addPlusButtonHandler(EventHandler<ActionEvent> handler) {
    	plusButton.setOnAction(handler);	
    }
    
    public void addMinusButtonHandler(EventHandler<ActionEvent> handler) {
    	minusButton.setOnAction(handler);
    }

	@Override
	public void update(java.util.Observable o, Object arg) {
		Integer count = (Integer) arg;
		this.updateTextField(count);
	}




}
