package textio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NameProcessor {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Name> nameList = new ArrayList<Name>();
		Scanner sc = new Scanner(new File("names.txt"));
		
		sc.useDelimiter("[<>\\r\\n]+");
		
		String id = sc.next();
		
		while(!id.equals("end")) {
			
			nameList.add(new Name(id, sc.next()));
			
			id = sc.next();
			
		}
		//System.out.print(nameList);
		sc.close();
		
		PrintWriter out = new PrintWriter(new File("shorter_names.txt"));
		

		
		nameList.stream().filter(x -> x.getFullName().length() < 12).forEach(x -> out.println(x.getFullName()));
		out.close();
	}
	

}
