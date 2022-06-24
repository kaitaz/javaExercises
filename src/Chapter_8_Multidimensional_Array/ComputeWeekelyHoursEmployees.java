package Chapter_8_Multidimensional_Array;

/*(Compute the weekly hours for each employee) Suppose the weekly hours for all
employees are stored in a two-dimensional array. Each row records an employee’s
seven-day work hours with seven columns. For example, the following array
stores the work hours for eight employees. Write a program that displays employees
and their total hours in decreasing order of the total hours*/

public class ComputeWeekelyHoursEmployees {

	public static void main(String[] args) {
		int[][] employeesHours = {
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9}
		};
		
		String[] employeeName = new String[employeesHours.length];
		for (int i = 0; i < employeeName.length; i++) {
			employeeName[i] = "Employee " + i;
			}
		
		double[] employeeHours = sumEmployeeHours(employeesHours);
		sortEmployee(employeeHours, employeeName);
		displayEmployee(employeeName, employeeHours) ;
		
	}

	private static double[] sumEmployeeHours(int[][] employeesHours) {
		double [] total = new double[employeesHours.length];
		for (int row = 0; row < employeesHours.length; row++) {
			for (int column = 0; column < employeesHours[row].length; column++) {
				total[row] += employeesHours[row][column];
			}
		}
		

		return total;
	}
	
	private static void displayEmployee(String[] employee, double[] hours) {
		System.out.println("Worked hours of employees in decreasing order:");
		for (int i = 0; i < hours.length; i++) {
			System.out.printf("%2d.  %-10s \t%3.2f ", (i+1), employee[i], hours[i]);
			System.out.println();
		}
		
	}

	private static void sortEmployee(double[] total, String[] employees) {
		for (int i = 0; i < total.length - 1; i++) {
		
			double currentMax = total[i];
			String currentStrg = employees[i];
			int currentMaxIndex = i;
			int currentStrgIndex = i;
			
			for (int j = i + 1; j < total.length; j++) {
				if (currentMax < total[j]) {
				currentMax = total[j];
				currentStrg = employees[j];
				currentMaxIndex = j;
				currentStrgIndex= j;
				
				}
			}
			
			
			if (currentMaxIndex != i) {
			total[currentMaxIndex] = total[i];
			employees[currentStrgIndex] = employees[i];
			total[i] = currentMax;
			employees[i] = currentStrg;
			}
			
		}
		
	}
}
