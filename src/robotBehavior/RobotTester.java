package robotBehavior;

import java.util.Scanner;

public class RobotTester {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Robot r1 = new Robot("Big Robot");
		Robot r2 = new Robot("George v.2.1");
		Robot r3 = new Robot("R2");
		Robot r4 = new Robot("IBB");
		
		  r1.setBehavior(new AgressiveBehavior());
		  r2.setBehavior(new DefensiveBehavior()); 
		  r3.setBehavior(new NormalBehavior());
		  r4.setBehavior(new ErraticBehavior());
		  
		  r1.move(); 
		  r2.move(); 
		  r3.move(); 
		  r4.move();
		  
		  System.out.println("\r\nNew behaviors: " +
							"\r\n\t'Big Robot' gets really scared," +
							"\r\n\t'George v.2.1' becomes really mad because " +
							"it's always attacked by other robots," + 
							"\r\n\t and R2 keeps its calm\r\n");
		  
		  r1.setBehavior(new DefensiveBehavior());
		  r2.setBehavior(new AgressiveBehavior());
		  
		  r1.move(); 
		  r2.move(); 
		  r3.move(); 
		  r4.move();
		  
		Robot selectBot = r1; 
		boolean t = true;
		
		System.out.println("Hello there! Welcome to Rumble. This program will allow you to select a Robot and it's behavior.\n"	
				           + "The behavior implemented will determine how a robot interacts with his neighbore.\n");
		while (t == true) {
			System.out.println("Please select a robot acording to it's respective number:\n" 
					           + "1-" + r1.getName() + "\n2-" + r2.getName() + "\n3-" + r3.getName() + "\n4-" + r4.getName());
			int bot = keyboard.nextInt();
			switch (bot) {
				case 1: 
					selectBot = r1;
					break;
				case 2: 
					selectBot = r2;
					break;
				case 3: 
					selectBot = r3;
					break;
				case 4: 
					selectBot = r4;
					break;
			}
			System.out.println("Please select a behavior acording to it's respective number:\n" 
								+ "1- Agressive \n2- Defensive \n3- Normal \n4- Erratic");
			int behavior = keyboard.nextInt();
			switch (behavior) {
				case 1: 
					selectBot.setBehavior(new AgressiveBehavior());
					selectBot.move();
					break;
				case 2: 
					selectBot.setBehavior(new DefensiveBehavior());
					selectBot.move();
					break;
				case 3: 
					selectBot.setBehavior(new NormalBehavior());
					selectBot.move();
					break;
				case 4: 
					selectBot.setBehavior(new ErraticBehavior());
					selectBot.move();
					break;
			}
			System.out.println("\nWould you like to change another robot's behavior? 1(yes) or 2(no)");
			int continu = keyboard.nextInt();
			if (continu==2){
				System.out.println("Thanks for playing, good bye.");
				t = false;
			}
		}
	}
}
	

