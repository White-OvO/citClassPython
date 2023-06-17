package cit129LabWeek1Part3;

import java.util.Scanner;

import ConsoleColorsCode.ConsoleColors;

public class DevelopingAProgram {

	public static void main(String[] args) {
		/*Keep in mind my variables are as follow :
		 * p  = KiloGram
		 * K  = LBwEIGHT
		 * 
		 * 
		 * 
		 */
		
		
		
	    System.out.println(ConsoleColors.BANANA_YELLOW);
		System.out.println("Enter the amount of LB you would to like to convert to Kilograms");
		
		
		int LBWeight = 0;
		Scanner scanner =  new Scanner(System.in);
		LBWeight = scanner.nextInt();
		
		
		
		double KiloGram ;
		KiloGram = LBWeight/2.2046;
		
		
		System.out.println(LBWeight + "LB "+ " is converted to : " + KiloGram + "Kilograms") ; 
		
	}

}
