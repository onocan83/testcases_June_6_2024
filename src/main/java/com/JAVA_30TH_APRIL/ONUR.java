package com.JAVA_30TH_APRIL;

import java.io.IOException;

public class ONUR {

	public static void main(String[] args) throws IOException {
	
	

		        char shouldContinue;

		        System.out.println("Welcome to Rock, Paper, Scissors!");

		        do {
		            System.out.print("Player A, enter your move (R for Rock, P for Paper, S for Scissors): ");
		            char moveA = (char) System.in.read();
		            System.in.read(); // Consume the newline character

		            System.out.print("Player B, enter your move (R for Rock, P for Paper, S for Scissors): ");
		            char moveB = (char) System.in.read();
		            System.in.read(); // Consume the newline character}
		        

		            if (moveA == moveB) {
		                System.out.println("It's a tie!");
		            } else if ((moveA == 'R' && moveB == 'S') || (moveA == 'P' && moveB == 'R') || (moveA == 'S' && moveB == 'P')) {
		                System.out.println("Rock Breaks Scissors. Player A wins!");
		            } else {
		                System.out.println("Player B wins!");
		            }

		            System.out.print("Do you want to play again? (Y/N): ");
		            shouldContinue = (char) System.in.read();
		            System.in.read(); // Consume the newline character
		        
		        }
		        while (shouldContinue == 'Y');

		        System.out.println("Thanks for playing Rock, Paper, Scissors!");
		    
		
		        }
	
		        }


