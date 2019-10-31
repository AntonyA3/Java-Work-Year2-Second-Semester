package model;

public class DiceGameEngine {
	 private Player p1; //human
	 private Player p2;
	 
	 public DiceGameEngine(Player p1,Player p2) {
		 this.p1 = p1;
		 this.p2 = p2;
	 }
	 
	 public DiceGameEngine() {
		 this.p1 = new Player();
		 this.p2 = new Player();
	 }
	 
	 public void setPlayer1(Player p1) {
		 this.p1 = p1;
	 }
	 
	 public void setPlayer2(Player p2) {
		 this.p2 = p2;
	 }
	 
	 public void setPlayers(Player p1, Player p2) {
		 this.p1 = p1;
		 this.p2 = p2;
	 }
	 
	 public Player getPlayer1() {
		return p1;
		 
	 }
	 public Player getPlayer2() {
		 return p2;
	 }
	 
	 public void play() {
		 p1.rollDice();
		 p2.rollDice();
	 }
	 
	 public String getGameResult() {
		String sep = "=================\n";
	
		String message = "";
		message += "Game Result Overview" + "\n";
		message += sep + "\n";
		
		if (p1.getDiceScore() < p2.getDiceScore()) {
			message += "You lose" + "\n";
		}else {
			message += "You Win" + "\n";
		}
		message += sep + "\n";
		
		message += "Your combined score is: " + p1.getDiceScore() + "\n" +
				"Your dice scores were: " + 
				p1.getPairOfDice().getBlue().getScore() + " and " +
				p1.getPairOfDice().getRed().getScore() + "\n\n";
		
		message += "Your Opponents combined score is: " + p2.getDiceScore() + "\n" +
				"Your dice scores were: " + 
				p2.getPairOfDice().getBlue().getScore()  + " and " +
				p2.getPairOfDice().getRed().getScore();
				
		return message;
		 
	 }
	 
	 

}
