import java.util.Scanner;

public class CurrencyChanger {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner (System.in);
		
		System.out.println("Enter number of Jamaican Dollars : ");
		double jamaican = scnr.nextDouble();
		
		System.out.println("Enter number of Dominican Pesos : ");
		double dominican = scnr.nextDouble();
		
		System.out.println("Enter number of Cuban Pesos : ");
		double cuban = scnr.nextDouble();
		
		double finalJamaican = (jamaican * 0.0069);
		double finalDominican = (dominican * 0.017);
		double finalCuban = (cuban * 0.042);
		
		double finalCurrency = (finalJamaican + finalDominican + finalCuban);
		
		System.out.printf( "US Dollars = $%.2f\n" , finalCurrency);
	}

}
