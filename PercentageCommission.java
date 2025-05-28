import java.util.Scanner;

public class PercentageCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Type -1 to stop");
	System.out.print("Enter your budget: ");
	double amount = input.nextDouble();

	double totalAmount = amount;
	int numberOfItems = 0;
	
	while (amount != -1){
	numberOfItems++;
	System.out.print("Enter your budget: ");
	amount = input.nextDouble();
	totalAmount += amount;
	}

	double constantWeeklyCommission = 200;
	double percentageCommission = (9.00 / 100);
	double commissionFromSales = (totalAmount * percentageCommission);
	double totalCommission = constantWeeklyCommission + commissionFromSales;

	System.out.printf("Your total commission for the week is $%.2f%nFor %d items.", 	totalCommission, numberOfItems);
	}
}