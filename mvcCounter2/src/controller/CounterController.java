package controller;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Counter;
import view.CounterPane;

public class CounterController {
	private CounterPane view;
	private Counter model;

	public CounterController(CounterPane view, Counter model) {
		this.view = view;
		this.view.updateTextField(model.getCount());
		this.model = model;
		this.model.addObserver(view);
		
		this.view.addPlusButtonHandler(new IncrementButtonHandler());
		this.view.addMinusButtonHandler(new DecrementButtonHandler());
		
		
	}
	
	private class IncrementButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
    		model.increment();
    		
		}
    }

    private class DecrementButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
    		model.decrement();
    		
    	}
    }
}
