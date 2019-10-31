package namecomparator;

/**
 * A name has a first name and a family name.
 * There is an option to produce a full name by combining these.
 * 
 * @author Luke
 */
public class Name implements Comparable<Name> {

	//Fields
	private String firstName;
	private String familyName;
	
	
	//Constructors
	
	/**The default constructor that creates a name with a 
	 * first name and family name as an empty string.
	 * 
	 */
	public Name() {
		firstName = "";
		familyName = "";
	}
	
	/** The custom constructor for the Name.
	 * 
	 * @param firstName The first name given to the new name 
	 * @param familyName The family name given to the new name
	 */
	public Name(String firstName, String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}

	
	//Methods
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	/** Sets the family name of the current Name
	 * 
	 * @param familyName The new family name for this Name
	 */
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	
	/** Returns the first name of the current name
	 * 
	 * @return the first name of the name
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/** Returns the family name of the current name
	 * 
	 * @return the last name of the current name
	 */
	public String getFamilyName() {
		return familyName;
	}

	/** Returns the first name and last name concatenated
	 * into a string
	 * 
	 * @return The first name and last name concatenated into a string
	 */
	public String getFullName() {
		if (firstName.equals("") && familyName.equals("")) {
			return "";
		} else {
			return firstName + " " + familyName;
		}
	}
	
	/** Returns a textual representation of this Name
	 * @return A textual representation of this name
	 */
	@Override
	public String toString() {
		return "Name:[firstName=" + firstName + ", familyName=" + familyName + "]";
	}
	
	/** Compares an object to the current name.
	 * Will return if the class is equal, and the fields are equal to each other
	 * otherwise it will return false.
	 * 
	 * @param obj the object to be compared to this name 
	 * 
	 * @return True if the object is equal to this name, false otherwise
	 */
	@Override
	public boolean equals(Object obj) {
		// test exceptional cases, i.e. obj not null and is a Name
		if (obj == null || this.getClass() != obj.getClass())
			return false;

		Name other = (Name) obj; // downcast to a Name object

		// compare first & family names using String's .equals() method
		return this.familyName.equals(other.familyName)
			&& this.firstName.equals(other.firstName);
	}
	
	@Override
	/** Compare the a name to this name 
	 * 
	 * @param other The name to be compared to this name
	 * 
	 * @return 1 if the name is greater, 0 if the name if equal, -1 if the name is less
	 */
	public int compareTo(Name other) {
		int result = this.familyName.compareTo(other.familyName);
		
		if (result == 0) {
			result = this.firstName.compareTo(other.firstName);
		}
		
		return result;
	}
}
