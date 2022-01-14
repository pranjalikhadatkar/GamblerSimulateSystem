package com.GamblerSimulateSystem;

import java.util.Scanner;

public class GamblerSimulateSystem {

	static int AMOUNT_OF_STAKE=100;
	static int TOTAL_AMOUNT_DIFF_IN_MONTH=0;
	static int BET_AMOUNT=1;
	static int WON=1;
	static int LOST=0;
	static int TOTAL_AMOUNT=0;
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Initial amount of stake is "+AMOUNT_OF_STAKE);
		 System.out.println("Amount to bet after every play "+BET_AMOUNT);
		 int currentcashofplayer = AMOUNT_OF_STAKE;
		 
		 for (int i = 1; i <= 30; i++) {
			 while(currentcashofplayer > 50 && currentcashofplayer < 150) {
				 int play = (int) Math.floor(Math.random() * 10) % 2;
				 System.out.println("Player play:"+play);
		 
				 switch(play) {
		 			case 1:
		 				currentcashofplayer = currentcashofplayer + BET_AMOUNT;
		 				System.out.println("Total cash Player has "+currentcashofplayer);
		 				break;
		 			case 0:
		 				currentcashofplayer = currentcashofplayer - BET_AMOUNT;
		 				System.out.println("Total cash Player has "+currentcashofplayer);
		 				break;
		 			default:
		 				System.out.println("default");
				 }
				 
			 }
			 if(currentcashofplayer==150 || currentcashofplayer==50) {
				 
				 System.out.println("Player Quit the game for the day"+i);
			 }
			 if(currentcashofplayer > 100) {
				 int amountWonPerDay = currentcashofplayer - AMOUNT_OF_STAKE;
				 System.out.println("Player won day"+i+" $ "+amountWonPerDay);
				 				 
			 }
			 else if(currentcashofplayer < 100){
				 int amountLostPerDay = AMOUNT_OF_STAKE - currentcashofplayer;
				 System.out.println("Player lost day"+i+" $ "+amountLostPerDay);
			 }

			 TOTAL_AMOUNT = currentcashofplayer;
		}
		 System.out.println("Total amount player has after 30 days: " + TOTAL_AMOUNT +" $");
		 TOTAL_AMOUNT_DIFF_IN_MONTH = TOTAL_AMOUNT - AMOUNT_OF_STAKE * 30;
		 if(TOTAL_AMOUNT_DIFF_IN_MONTH > 0) {
			 System.out.println("Total cash Player won "+TOTAL_AMOUNT_DIFF_IN_MONTH +" $");
		 }
		 else {
			 System.out.println("Total cash Player lost in that month "+TOTAL_AMOUNT_DIFF_IN_MONTH+" $");
		 }
		 sc.close();
	}
}
