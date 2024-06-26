package employeecomparator;

import java.util.Comparator;

public class EmployeeRegisterDemo {

	public static void main(String[] args) {
		EmployeeRegister reg = new EmployeeRegister("Finance");
		
		reg.addEmployee(new Employee(new Name("Tom", "Ford"), new Date(5,5,2013), 15500.50));
		reg.addEmployee(new Employee(new Name("Anna", "Holdon"), new Date(1,3,2009), 10000));
		reg.addEmployee(new Employee(new Name("Katie", "Wood"), new Date(4,1,2010), 25000.50));
		reg.addEmployee(new Employee(new Name("Dharmesh", "Palal"), new Date(1,12,2012), 12000));
		
		System.out.println("All employee data...\n" + reg.toString() + "\n");
		
		System.out.println("List of employee names:");
		for (int i=0;i < reg.size(); i++) {
			System.out.println(reg.getEmployee(i).getName().getFullName());
		}
		
		System.out.println("====================");
		
		System.out.println("Number of employees: " + reg.size());
		System.out.println("Total salary: " + reg.getTotalSalary());
		System.out.println("Average salary: " + reg.getAverageSalary());

		
		reg.sortEmployee(new Comparator<Employee> () {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.compareTo(e2);
			} 
		});
		System.out.println("");
		for (int i=0;i < reg.size(); i++) {
			System.out.println(reg.getEmployee(i).getName().getFullName());
		}
		
		
		System.out.println("");
		reg.sortEmployee(new EmployeeLastNameComparator());
		for (int i=0;i < reg.size(); i++) {
			System.out.println(reg.getEmployee(i).getName().getFullName());
		}
		
		System.out.println("");
		Comparator<Employee> sortEmployee = (Employee e1, Employee e2) -> e1.getName().getFirstName().compareTo(e2.getName().getFirstName());
		reg.sortEmployee(sortEmployee);
		
	}

}
