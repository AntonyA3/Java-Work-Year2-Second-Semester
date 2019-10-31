package namecomparator;

import java.util.Comparator;
public class RegisterApp {

	public static void main(String[] args) {
		Register reg = new Register();
		reg.addName(new Name("Mx", "Nix"));
		reg.addName(new Name ("Lex", "Mix"));
		reg.addName(new Name("Lone", "Paul"));
		reg.addName(new Name("Wesyte", "Acton"));
		
		//reg.forEach(x -> System.out.println(x.toString()));
		
	
		//reg.sortRegister(Comparator.reverseOrder());
		//reg.forEach(x -> System.out.println(x.toString()));
		
		
		/*reg.sortRegister((Name n1, Name n2) -> n1.getFirstName().compareTo(n2.getFirstName()));
		reg.forEach(x -> System.out.println(x.toString()));
		
		reg.sortRegister((Name n1, Name n2) -> n1.getFamilyName().compareTo(n2.getFamilyName()));
		reg.forEach(x -> System.out.println(x.toString()));
		*/
		
		reg.sortRegister(Comparator.reverseOrder());
		
		reg.sortRegister(Comparator.comparing(n -> n.getFirstName()));
		reg.forEach(x -> System.out.println(x.toString()));
		
		reg.sortRegister(Comparator.comparing(Name :: getFamilyName, Comparator.reverseOrder()));
		reg.forEach(x -> System.out.println(x.toString()));
	}

}
