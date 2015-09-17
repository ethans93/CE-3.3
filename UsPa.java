import java.util.Scanner;

public class UsPa
{
	public static void main (String [] args)
	{

	String password0, username0, password1, username1;
	Scanner keyboard = new Scanner (System.in);

	username0 = "Ethan";
	password0 = "Steen";

	
	System.out.print("Username: ");
	username1 = keyboard.next();
	System.out.println();

	System.out.print("Password: ");
	password1 = keyboard.next();
	System.out.println();
	
	if (password0.equals(password1) && username0.equals(username1))
	{
	System.out.println("Welcome " + username0 + "!");
	}
	else
	{
		while (!password0.equals(password1) || !username0.equals(username1))
		{
		System.out.println("Wrong Username and/or Password!");
		System.out.println();
		
		System.out.print("Username: ");
		username1 = keyboard.next();
		System.out.println();

		System.out.print("Password: ");
		password1 = keyboard.next();
		System.out.println();
		
		
			if (password0.equals(password1) && username0.equals(username1))
			{
			System.out.println("Welcome " + username0 + "!");
			}
		}
	}
	}
}
		