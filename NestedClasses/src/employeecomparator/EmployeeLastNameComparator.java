package employeecomparator;

import java.util.Comparator;

public class EmployeeLastNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e2.getName().getFamilyName().compareTo(e1.getName().getFamilyName());
	}
	
}
