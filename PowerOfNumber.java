import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter base number: ");
	int base = input.nextInt();

	System.out.print("Enter the power: ");
	int power = input.nextInt();

	int outcome = 0;
	
	while (power != 0){
	outcome *= base;
	}
	System.out.printf("%d^%d is %d%n", base, power, outcome);
	}
}