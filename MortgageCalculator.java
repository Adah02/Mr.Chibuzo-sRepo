import java.util.Scanner;
public class MortgageCalculator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter principal amount: "); 
	double principalAmount = input.nextDouble();

	System.out.print("Enter annual percentage rate: "); 
	double annualPercentageRate = input.nextDouble();

	System.out.print("Enter duration in years: ");
	double duration = input.nextDouble();

	final double constantPercentage = 100;
	double actualRate = (annualPercentageRate / constantPercentage);
	double annualInterestRate = (actualRate * (Math.pow((1 + actualRate),duration)));

	double actualRateAndYears = (Math.pow((1 + actualRate),duration) - 1);

	double mortgage = (principalAmount * (annualInterestRate / actualRateAndYears));
	
	final double monthsPerYear = 12;
	double monthlyPayment = mortgage / (duration * monthsPerYear);

	System.out.printf("%nThe mortgage amount is %.2f. %nThe monthly repayment for $%.2f in %.0f year(s) is $%.2f",mortgage, principalAmount, duration, monthlyPayment);
	}
}