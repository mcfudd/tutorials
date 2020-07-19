package tutorials;

import java.util.Scanner;

public class arrayActivity02
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String[] animal = new String[5];
		
		System.out.println("Enter 5 animals:");
		
		animal[0] = scanner.next();
		animal[1] = scanner.next();
		animal[2] = scanner.next();
		animal[3] = scanner.next();
		animal[4] = scanner.next();
		
		System.out.println("\n\nThansk!\n\nYou entered:\n" + animal[0] + "\n" + animal[1] + "\n" + animal[2] + "\n" + animal[3] + "\n" + animal[4]);
		

	}

}
