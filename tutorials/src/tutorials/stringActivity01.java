package tutorials;

public class stringActivity01
{

	public static void main(String[] args)
	{
		String firstName = "John";
		String lastName = "Smith";
		
		String fullName = firstName + " " + lastName;
		
		System.out.println("Name: " + fullName);
		
		
		firstName = "Frank";
		lastName = "Smells";
		
		fullName = firstName + " " + lastName;
		
		System.out.println("\n\n" + firstName + "\n" + lastName + "\nName: " + fullName);
	}

}
