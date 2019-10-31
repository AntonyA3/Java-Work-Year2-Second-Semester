package namecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/** A register can add names to the register
 * The Register class has a list of names
 * 
 * @author p17150942
 */
public class Register implements Iterable<Name>{
	private ArrayList<Name> nameList;
	
	/** The default constructor for the register.
	 * This creates an empty array list that can store names.
	 * 
	 */
	public Register() {
		this.nameList = new ArrayList<Name>();
	}
	
	/** Returns the Size of the current register
	 * 
	 * @return the size of the current register
	 */
	public int registerSize() {
		return nameList.size();
	}
	
	/** Clears all the names from name list 
	 * in the current register.
	 * 
	 */
	public void clearRegister() {
		this.nameList.clear();
	}
	
	/** Adds a name to the register's name list
	 * 
	 * @param name the name to be added to the register's  name list
	 */
	public void addName(Name name) {
		nameList.add(name);
	}
	
	public void addName(int index, Name n) {
		if (index >= 0 && index <= nameList.size()) {
			nameList.add(index, n);
		}
		
		
	}
	
	/** Returns whether or not the name list of the register is empty
	 * 
	 * @return true if the name list of the register is empty. false otherwise
	 */
	public boolean isRegisterEmpty() {
		return nameList.size() == 0;
	}
	
	/** Removes a name from a name list by index then returns the name.
	 * 
	 * @param index the index of the name to be removed.
	 * @return the name that was removed from the nameList.
	 */
	public Name removeName(int index) {
		Name oldName = nameList.get(index);
		nameList.remove(index);
		return oldName;	
	}

	/** Gets the name at the given index if the index is valid
	 * 
	 * @param index The index to be retrieved in the name list
	 * @return The name or null if the index is invalid
	 */
	public Name getName(int index) {
		if (index >= 0 && index < nameList.size()) {
			return nameList.get(index);
		}
		return null;
		
	}
	

	/** returns a textual representation of the state of the Register
	 * 
	 * @return the textual representation of the Register
	 */
	public String toString() {
		return "Register:[nameList:" + nameList + "]";
	}
	
	/** Finds all Names that contain a given family name
	 * 
	 * @param familyName The family name used to search the register
	 * @return true if the family name was in the register, returns false otherwise
	 */
	public boolean searchRegisterByFamilyName(String familyName) {
		return nameList.stream().anyMatch(x -> x.getFamilyName().equals(familyName));
	}
	
	
	/** Iterates through the name list of the Register and counts the first names that end with the given character
	 * 
	 * @param ch the given character 
	 * @return the number of first names of names that end with the given character
	 */
	public int countFirstNameOccurrences(char ch) {
		int sum = 0;
		for (Name name: nameList) {
			if (name.getFirstName().endsWith(String.valueOf(ch))) {
				sum +=1;
			}
		}
		return sum;
	}

	/** Will return the iterator of the register.
	 * 
	 */
	@Override
	public Iterator<Name> iterator() {
		return nameList.iterator();
		
	
	}
	
	/** Will sort the current name list
	 * 
	 */
	public void sortRegister() {
		Collections.sort(nameList);
	}
	
	public void sortRegister(Comparator<Name> c) {
		nameList.sort(c);
	}
	
}
