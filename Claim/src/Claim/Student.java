package Claim;

import java.util.*;

public class Student extends Person implements Bills
{
	 
	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		
		return;
	}
	
	List<Student> students = new ArrayList<Student>();
	
	// Override
	@Override
	public double taxes(double amount)
	{
		
		return amount * .02;
	}
	
	public String toString()
	{
		return "\nFirst Name: " + firstName + " "	+ "\nLast Name: " + lastName;
	}



	
	
}
