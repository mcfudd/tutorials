package tutorials;

import java.util.Scanner;

public class stringActivity02
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String firstName, middleName, lastName;
		
		System.out.println("Enter first name: ");
		firstName = scanner.next();
		
		System.out.println("Enter middle name: ");
		middleName = scanner.next();
		
		System.out.println("Enter last name: ");
		lastName = scanner.next();
		
		System.out.println("Full name is: " + firstName + " " + middleName + " " + lastName);
		
	}

}