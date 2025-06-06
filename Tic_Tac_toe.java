import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Tic_Tac_toe {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	char[] boxes = {'1','2','3','4','5','6','7','8','9'};
	char player1 = 'X';
	char player2 = 'O';
	System.out.println("Press the number in the box to occupy.\n Player 1 = X\n Player 2 = O");
	System.out.println("\n");
	int toss = (int)((Math.random() * 2) + 1);

	char currentPlayer = '0';
	char userChoice =' ';
	if(toss == 1){
	System.out.println("Player 1 Starts");
	currentPlayer = player1;
	}else{
		System.out.println("Player 2 Starts");
		currentPlayer = player2;
	}

	int counter = 0;
	boolean choice = true;

	while (choice = true && counter < 9){ 
	int count1 = 0; int count2 = 0; int count3 = 0; int count4 = 0; int count5 = 0;
	int count6 = 0; int count7 = 0; int count8 = 0; int count9 = 0; 

	System.out.printf("\n  %s | %s | %s%n ", boxes[0], boxes[1], boxes[2]);
	System.out.println("---+---+---");
	System.out.printf("  %s | %s | %s%n ", boxes[3], boxes[4], boxes[5]);
	System.out.println("---+---+---");
	System.out.printf("  %s | %s | %s%n ", boxes[6], boxes[7], boxes[8]);
	System.out.print("\n");
		
	while (counter != 5){
		System.out.print("Player 1: ");
		userChoice = input.next().charAt(0);
		choice = true;
		for(int index = 1; index < 2; index++){
			System.out.print("Player 2: ");
			userChoice = input.next().charAt(0);
			choice = true;
			counter += 1;
			}
		}
		switch(userChoice){

		case 1: {
			if (boxes[0] != player1 || boxes[0] != player2 || boxes[0] != '1' ){
				boxes[0] = userChoice; choice = true;
				}
			} break;
		case 2:{
				if (boxes[1] != player1 || boxes[1] != player2 || boxes[1] != '2' ){
				boxes[1] = userChoice; choice = true;
				}
			} break;
		case 3:{
			if (boxes[2] != player1 || boxes[2] != player2 || boxes[2] != '3' ){
				boxes[2] = userChoice; choice = true;
				}
			} break;
		case 4:{
			if (boxes[3] != player1 || boxes[3] != player2 || boxes[3] != '4' ){
				boxes[3] = userChoice; choice = true;
				}
			} break;
		case 5:{
			if (boxes[4] != player1 || boxes[4] != player2 || boxes[4] != '5' ){
				boxes[4] = userChoice; choice = true;
				}
			} break;
		case 6:{
			if (boxes[5] != player1 || boxes[5] != player2 || boxes[5] != '6' ){
				boxes[5] = userChoice; choice = true;
				}
			} break;
		case 7:{
			if (boxes[6] != player1 || boxes[6] != player2 || boxes[6] != '7' ){
				boxes[6] = userChoice; choice = true;
				}
			} break;
		case 8:{
			if (boxes[7] != player1 || boxes[7] != player2 || boxes[7] != '8' ){
				boxes[7] = userChoice; choice = true;
				}
			} break;
		case 9:{
			if (boxes[8] != player1 || boxes[8] != player2 || boxes[8] != '9' ){
				boxes[8] = userChoice; choice = true;
				}
			} break;
		}

	if (boxes[0] == player1 && boxes[1] == player1 && boxes[2] == player1 || 
	boxes[3] == player1 && boxes[4] == player1 && boxes[5] == player1 || 
	boxes[6] == player1 && boxes[7] == player1 && boxes[8] == player1 ||
	boxes[0] == player1 && boxes[3] == player1 && boxes[6] == player1 ||
	boxes[1] == player1 && boxes[4] == player1 && boxes[7] == player1 ||
	boxes[2] == player1 && boxes[5] == player1 && boxes[8] == player1 ||
	boxes[0] == player1 && boxes[4] == player1 && boxes[8] == player1 ||
	boxes[2] == player1 && boxes[4] == player1 && boxes[6] == player1
	){	
	  System.out.println("Player 1 won. Congratulations...");
	  choice = false;
	  }
	else if (boxes[0] == player2 && boxes[1] == player2 && boxes[2] == player2 || 
	boxes[3] == player2 && boxes[4] == player2 && boxes[5] == player2 || 
	boxes[6] == player2 && boxes[7] == player2 && boxes[8] == player2 ||
	boxes[0] == player2 && boxes[3] == player2 && boxes[6] == player2 ||
	boxes[1] == player2 && boxes[4] == player2 && boxes[7] == player2 ||
	boxes[2] == player2 && boxes[5] == player2 && boxes[8] == player2 ||
	boxes[0] == player2 && boxes[4] == player2 && boxes[8] == player2 ||
	boxes[2] == player2 && boxes[4] == player2 && boxes[6] == player2
	){
	  System.out.print("Player 2 won. Congratulations...");
	  choice = false;
	}
	else if (counter == 9){
		System.out.print("It's a tie");
		choice = false;
		}	

	}

	}

}