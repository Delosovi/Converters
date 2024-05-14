import java.util.Scanner;

public class ChangeConverter {
	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
	
		System.out.println("Enter the number of quarters: ");
		int userQuarters = scnr.nextInt();
		
		System.out.println("Enter the number of dimes: ");
		int userDimes = scnr.nextInt();
		
		System.out.println("Enter the number of nickels: ");
		int userNickles = scnr.nextInt();
		
		System.out.println("Enter the number of pennies: ");
		int userPennies = scnr.nextInt();
		
		System.out.print("You entered: \n" + userQuarters + " quarters \n" + userDimes + " dimes \n" + userNickles + " nickles \n" + userPennies + " pennies \n");

	    double finalChange = (0.25 * userQuarters) + (0.10 * userDimes) + (0.05 * userNickles) + (0.01 * userPennies);
	    
	    System.out.printf("The total in dollars is $%1.2f", finalChange);
}
 }
