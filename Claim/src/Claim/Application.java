package Claim;

public class Application extends Person
{

	public static void main(String[] args)
	{
		
		
		Student s1 = new Student("Steve", "Goldman");
		Employee e1 = new Employee("Harley", "Test ");
		double telPhoneBillStudent = s1.calculateTelePhoneBill(100);
		double telPhoneBillEmployee = e1.calculateTelePhoneBill(100);
		System.out.println("Student: " + s1.firstName + " "+ s1.lastName + " Telephone bill with taxes is: " + telPhoneBillStudent);
		System.out.println("Employee: " + e1.firstName + " "+ e1.lastName + " Telephone bill with taxes is: " + telPhoneBillEmployee);
		
		double taxeStudent = s1.taxes(100);
		double taxeEmployee = e1.taxes(100);
		System.out.println("Student: " + s1.firstName + " " + s1.lastName + "Taxes are: " + taxeStudent);
		System.out.println("Employee: " + e1.firstName + " " + e1.lastName + "Taxes are: " + taxeEmployee);
		
		
		Student s2 = new Student("Oscar", "Goldman");
	    Employee e2 = new Employee("Kevin", "Oscar ");
	    double telPhoneBillStudent2 = s2.calculateTelePhoneBill(200);
	    double telPhoneBillEmployee2 = e2.calculateTelePhoneBill(200);
	    
		System.out.println("Student2: " + s2.firstName + " "+ s2.lastName + " Telephone bill with taxes is: " + telPhoneBillStudent2);
		System.out.println("Employee2: " + e2.firstName + " " + e2.lastName + " Telephone bill with taxes is: " + telPhoneBillEmployee2);
		
		

	}

	@Override
	public double taxes(double amount)
	{
		return 0;
	}

}
