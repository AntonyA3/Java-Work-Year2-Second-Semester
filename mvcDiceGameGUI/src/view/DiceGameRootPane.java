package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Accordion;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

public class DiceGameRootPane extends TabPane{
	private PlayGame pg;
	private GameResult gr;
	private Tab pgTab, grTab;
	
	
	public DiceGameRootPane(PlayGame pg, GameResult gr) {
		
		this.pg = pg;
		this.pg.setPadding(new Insets(50));
		this.pg.setHgap(20);
		this.pg.setVgap(20);
		this.pg.setAlignment(Pos.TOP_CENTER);
		
		
		this.gr = gr;
		this.gr.setAlignment(Pos.CENTER);
		
		
		this.pgTab = new Tab("Play", pg);
		this.grTab = new Tab("Result", gr);
		
		this.getTabs().addAll(this.pgTab, this.grTab);
		this.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

	}
	
	public PlayGame getPlayGame() {
		return this.pg;
	}
	
	public GameResult getGameResult() {
		return this.gr;
	}
	
	public Tab getPlayGameTab() {
		return this.pgTab;
	}
	
	public Tab getGameResultsTab() {
		return this.grTab;
	}
	
	
	
	

}
