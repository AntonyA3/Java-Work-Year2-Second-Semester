package model;


/** 
 * A Player has a name and has a pair of dice.
 * A player can roll it's dice and retrieve a score.
 * 
 * 
 * The player class is composed of a Name and a PairOfDice
 * 
 * @author p17150942
 */
public class Player {
	private Name name;
	private PairOfDice pairOfDice;
	
	
	/** Default constructor that creates a player with a default Name
	 * and a default pairOfDice 
	 */
	public Player() {
		name = new Name();
		pairOfDice = new PairOfDice();
	}
	
	/** Name only constructor that creates a player with a given Name
	 * and a default pairOfDice.
	 * 
	 * @param The name of the player
	 */
	public Player(Name name) {
		this.name = name;
		
	}
	
	/**
	 * Full constructor that creates a player with a given Name
	 * and a given pair of dice.
	 * @param name the name of the player.
	 * @param pairOfDice the pair of dice that the player holds.
	 */
	public Player(Name name, PairOfDice pairOfDice) {
		this.name = name;
		this.pairOfDice = pairOfDice;
	}
	
	/**
	 * Returns the current name of the player
	 * @return the current name of the player
	 */
	public Name getName() {
		return name;
	}
	
	/**
	 * Assigns a new name to this player.
	 * @param name the name to be assigned to the player.
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * Returns the current pair of dice this player holds.
	 * @return the current pair of dice this player holds.
	 */
	public PairOfDice getPairOfDice() {
		return this.pairOfDice;
	}
	
	/**
	 * Assigns a new pair of dice to this player.
	 * @param pairOfDice the pair of dice to be assigned to this player.
	 */
	public void setPairOfDice(PairOfDice pairOfDice) {
		this.pairOfDice = pairOfDice;
	}
	
	/**
	 * Calls the roll method within pairOfDice {@link PairOfDice #roll()}
	 */
	public void rollDice() {
		pairOfDice.roll();
	}
	
	/**
	 * Returns the dice score within pairOfDice by calling the method
	 * {@link PairOfDice #getScore()}
	 * @return the score from the pairOfDice
	 */
	public int getDiceScore() {
		return pairOfDice.getScore();
	}
	
	/**
	 * This sets the first name and the family name of the current name.
	 * @param fullName the full name as a string 
	 */
	public void setFullPlayerName(String fullName) {
		name.setFirstName(fullName.substring(0, fullName.indexOf(" ")));
		name.setFamilyName(fullName.substring(fullName.indexOf(" ")+ 1));
	}
	
	/** This will compare the player with a given object,
	 * this will return true if the object is the same class is not null
	 * and has matching fields.
	 * 
	 * @param obj the given object that is being compared against the player
	 * 
	 * @return true if the given object is a Player and has equivalent attributes to the current player,
	 * false otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Player object = (Player) obj;
		
		return name.equals(object.name) && pairOfDice.equals(object.pairOfDice);
	}
	
	/** Returns a textual representation of the state of the player. 
	 * 
	 * @return a textual representation of the state of the player.
	 */
	@Override
	public String toString() {
		return this.name.getFullName();
		/*return "Player:[name: " + name.toString() +
				", pairOfDice: " + pairOfDice.toString() + 
				"]";*/
	}

}
