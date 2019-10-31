package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Background;
import model.DiceGameEngine;
import model.Die;
import model.Name;
import model.PairOfDice;
import model.Player;
import view.DiceGameRootPane;
import view.GameResult;
import view.PlayGame;

public class DiceGameController {
	private GameResult gr;
	private PlayGame pg;
	private DiceGameEngine dicegame;
	private DiceGameRootPane rootView;
	public DiceGameController(DiceGameRootPane view, DiceGameEngine model) {
		this.rootView = view;
		this.gr = view.getGameResult();
		this.pg = view.getPlayGame();
		this.pg.setOpponents(setupOpponentPlayers());
		this.dicegame = new DiceGameEngine();
		
		dicegame.setPlayer2(pg.getSelectedOpponent());
		addHandlers();
		
	}
	
	private void addHandlers() {
		pg.addComboBoxHandler(new ChangeOpponentHandler());
		pg.addPlayGameHandler(new PlayTheGameHandler());
	}
	
	private class ChangeOpponentHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			dicegame.setPlayer2(pg.getSelectedOpponent());
			
			
		}
		
	}
	
	private class PlayTheGameHandler implements EventHandler<ActionEvent>{

		@Override
		public void handle(ActionEvent event) {
			Player humanPlayer = new Player(new Name(pg.getFirstName(), pg.getSurname()), new PairOfDice(new Die (6), new Die(6)));
			dicegame.setPlayer1(humanPlayer);
			dicegame.play();
			rootView.getSelectionModel().select(rootView.getGameResultsTab());
			gr.setResultText(dicegame.getGameResult());
	
			
		}
		
	}
	
	private Player[] setupOpponentPlayers() {
		Player easy = new Player(new Name("Easy", "Opponent"), new
		PairOfDice(new Die(5), new Die(5)));
		
		Player medium = new Player(new Name("Medium", "Opponent"), new
		PairOfDice(new Die(6), new Die(6)));
		
		Player hard = new Player(new Name("Hard", "Opponent"), new
		PairOfDice(new Die(7), new Die(7)));
		
		return new Player[] {easy, medium, hard};
		}
	
	
}
