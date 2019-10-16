package Claim;

public abstract class Person
{	
	protected String firstName;
	protected String lastName;
	
	//public abstract double taxes(double amount);
	
	public double calculateTelePhoneBill(double amount)
	{
		return this.taxes(amount) + amount;
	      
	}

	public double taxes(double amount)
	{
		return this.taxes(amount);
	      
	}
	
//Getters and Setters
	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
}
