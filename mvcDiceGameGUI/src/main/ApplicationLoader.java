package main;

import controller.DiceGameController;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;
import model.DiceGameEngine;
import view.DiceGameRootPane;
import view.GameResult;
import view.PlayGame;

public class ApplicationLoader extends Application {

	private Parent view;


	@Override
	public void init() {
		this.view = new DiceGameRootPane(new PlayGame(), new GameResult());
		DiceGameEngine model = new DiceGameEngine();
		new DiceGameController((DiceGameRootPane)view, model);
		
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Scene scene = new Scene(view);
		stage.setTitle("Dice Game GUI");		
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
