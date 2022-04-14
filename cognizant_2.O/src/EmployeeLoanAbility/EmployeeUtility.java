package EmployeeLoanAbility;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {
		// Fill your code here
		Object[] objects = Arrays.stream(details).map(detail -> {
			String[] values = detail.split(";");
			String eId = values[0];
			String eName = values[1];
			double salary = Double.parseDouble(values[2]);

			Employee employee = new Employee();
			employee.setEmpId(eId);
			employee.setEmpName(eName);
			employee.setSalary(salary);

			return employee;
		}).toArray();

		return Arrays.copyOf(objects, objects.length, Employee[].class);

	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		// Fill your code here
		return Arrays.stream(empDetails);

	}

	public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {

		// Fill your code here
		Object[] objects = empStream.filter(employee -> employee.getSalary() >= minSalary)
				.sorted((e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId())).map(employee -> String.format("%s %s %.1f",
						employee.getEmpId(), employee.getEmpName(), employee.getSalary()))
				.toArray();

		return Arrays.copyOf(objects, objects.length, String[].class);
	}

}

/*
Enter the number of Employees

5

Enter the details of Employees

100;Adonis;25000

104;Andres;20000

103;Sai Shankar;35000

101;James;50000

102;Jack;30000

Enter the minimum eligible salary

30000
*/