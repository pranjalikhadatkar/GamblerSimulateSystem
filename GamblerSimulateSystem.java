package com.GamblerSimulateSystem;

import java.util.Scanner;

public class GamblerSimulateSystem {

	static int AMOUNT_OF_STAKE=100;
	static int BET_AMOUNT=1;
	static int WON=1;
	static int LOST=0;
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Initial amount of stake is "+AMOUNT_OF_STAKE);
		 System.out.println("Amount to bet after every play "+BET_AMOUNT);
		 int currentcashofplayer = AMOUNT_OF_STAKE;
		 
		 while(currentcashofplayer > 50 && currentcashofplayer < 150) {
			 int play = (int) Math.floor(Math.random() * 10) % 2;
			 System.out.println("Gamblers play:"+play);
		 
			 switch(play) {
		 		case 1:
		 			currentcashofplayer = currentcashofplayer + BET_AMOUNT;
		 			System.out.println("Total current cash gambler has "+currentcashofplayer);
		 			 System.out.println("Player won the current play");
		 			break;
		 		case 0:
		 			currentcashofplayer = currentcashofplayer - BET_AMOUNT;
		 			System.out.println("Total current cash gambler has "+currentcashofplayer);
		 			 System.out.println("Player lost the current play");
		 			break;
		 		default:
		 			System.out.println("default");
			 }
			 
		 }
		 if(currentcashofplayer==150 || currentcashofplayer==50) {
			 System.out.println("Gambler Quit the game for the day");
		 }
		 sc.close();
	}

}
