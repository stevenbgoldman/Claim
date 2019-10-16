package Claim;

public class Employee extends Person implements Bills
{ 
	public Employee(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		return;
	}
	
	
// Override
		@Override
		public double taxes(double amount)
		{
			return amount * .20;
		}
		
		public String toString()
		{
			return "\nFirst Name: " + firstName + " "	+ "\nLast Name: " + lastName;
		}

}
