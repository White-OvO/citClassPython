package citlab1;

import java.util.Scanner;

public class chp1and3 {

	public static void main(String[] args) {
// do not upload
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 1. What is my alternate email address when Canvas is not working?
		 * 
		 * ans:
The alternate email address when canvas is not working is efat.taghva@csn.edu
		 * 
2. What is the total percentage of grade assigned to labs?

The percentage of a graded assignment for the labs are 
Lab assignments – 10% 

3. One KiloByte is approximately how many Bytes?

There are approximately 1000 bytes per kilobyte. 

4. What does the CPU do?
The CPU is the brain of the computer, receiving program steps just as raptor pseudo 
code format. The arithmetic and logical operations this is how the computer stores 
information and the order matter that it comprehend with. Manipulating other computers 
and working as one.The cpu is filled with thousands of transmitters that interact with the computer. 

5. When I turn off my computer, all my data in memory is lost (TRUE or FALSE)?


When someone turns off their computer memory is lost. The ram is in charge of this duty and having the system shut down without saving any data will cause it to erase. 


6. What is the value of the following expression? 22 + 8 – 6 * 3
Ans: 12

7. Suppose Me = 20 and You = 5, what is the value of the following expressions:
a. Me * You ^ 2 / 10
ans:  50
b. ((Me + You) * 2 – (You – Me) * 4) ^ 2
ans: 12100

c. 30 % 8
Ans: 6

d. 10 % 27
Ans:10


e. Me * You % 2
Ans: 0.0

8. Suppose X = 10 and Y = 6, and Z = 5, what is the value of the following expressions:
a. X % Z + Y
Ans: 06


b. X % (Y + Z)
Ans : 10


9. Suppose income = 5000 and taxRate = 8, what is the value of tax after the following
expression?
a. tax = income * taxRate / 100

Ans: 400

10. Suppose the price of a book is $80 and the discount rate is 15%, what is the expression to
calculate the price of the book after application of discount.


ans: the expression would be x = 0.15 ; y = 80 = 12
0.15 x 80 = 12

orugibak = 80 
discount = 12

sale price = 68



11. What would display on the screen if the following set of instructions was included in an
actual program?
• The variable a starts with 0
• The variable b starts with -2
• Add 3 to a
• Add -8 to b
• Add a and b, and store the result in c
• Display the value of c
• Add 7 to a
• Display the value of a
• Display the value of c
12. Write the pseudocode for a problem that prompts the user to enter the number of quarters,
dimes, and nickels. Calculate and output the total value of coins in pennies.


ans:
wite "how many quarters"
input quarters
write :"how many dime"
input dime
write: "how nany nickles"
input nickles
change = dimes *10 + quarter *25 + nickles *5+ pennies
Display "the total pennies are = "+ change




13. Write a Raptor code for the following problem that calculates the current balance in a
bank account. Ask the user for:
a. The starting balance
b. The amount of deposit
c. The amount of withdrawals
		 * ANS: write "Good morning would you like to check balance?"
		 * input: 
		 * balance
		 * 
		 * write " amount of deposit is  + deposit"
		 * 
		 * input deposit
		 * 
		 * write " amount that you are withdrawing today is"
		 * input withdraw
		 * 
		 * write "avaliable balance is"
		 * 
		 * input balance
		 * 
		 */
		
/*the pseudocode above is incorrct
 * 
 * Compute the cost of downloading music online
 * 
 * input thr number of songs to purchase, Songs
 * 
 * Input Songs
 * 
 * Compute the total cost
 * Set DollarPrice = 0.99 * Songs 
 * 
 * output the total cost:
 * 
 * Write DollarPrice
 * 
 * ------------------------------------------------------
 * in the example above we used both Songs and DollarPrice variable which we give dollarprice 0.99 
 * 
 * 
 * 
 * 
 * 
 * 
 * 		
 */
		
		
		
		

		
		int Songs = 0;
		double DollarPrice = 0.0;
		
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the amount of songs you wish to purchase today. ");
		Songs = scanner.nextInt();
		DollarPrice = 0.99 * Songs;
		System.out.println("Your total is : " + DollarPrice);
		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		///22 + 8 – 6 * 3
		int x = 22;
		int y = 8;
		int u = 6;
		int i = 3;
		System.out.println(x + y - u * i);
		

//7.  Suppose Me = 20 and You = 5, what is the value of the following expressions:
//		a. Me * You ^ 2 / 10		
	int me = 20;
	double you = 5;
	double xy = 2;
	int yx = 10;
	int yx2 = 4;
	System.out.println("question 7A:" + me * (Math.pow(you, xy))/yx);
		
	
	//8.((Me + You) * 2 – (You – Me) * 4) ^ 2
	System.out.println("Question 7B part 1: " + ((me + you)* xy - (you -me) * yx2));   //taking short cut need to see how to do it on one code.
	
	double b = 110;
	
	System.out.println("Question 7B part 2: " + Math.pow(b, xy));
	
	//30 % 8

	
	int bc = 30;
	int cb = 8;
	//10 % 27
	
	System.out.println("question 7c: " + bc % cb);
	
	//10 % 27
	
	int vb = 10;
	int vb2 = 27;
	System.out.println("questipon 7d: " +vb % vb2);
	
	//Me * You % 2
	System.out.println("question 7e: " + me * you % xy);

	
	
	//Suppose X = 10 and Y = 6, and Z = 5, what is the value of the following expressions:
	//a. X % Z + Y
	int xyx = 10;
	int xyxy = 6;
	int yxy = 5;
	System.out.println("Question 8a: " + xyx % yxy + xyxy);
	
//	b. X % (Y + Z)
	
	System.out.println("Question 8b: " + xyx % (xyxy + yxy));
	
	// Suppose income = 5000 and taxRate = 8, what is the value of tax after the following expression?
//			a. tax = income * taxRate / 100
	int income = 5000;
	int taxRate = 8;
	int tax = income * taxRate / 100;
	System.out.println("question 9: " + tax );
	
	
	
	/*
	 * 10. Suppose the price of a book is $80 and the discount rate is 15%, what is the expression to
calculate the price of the book after application of discount.

ans: the expression would be x = 0.15 ; y = 80 = 12
0.15 x 80 = 12

orugibak = 80 
discount = 12

sale price = 68
	 * 
	 * 
	 */
	double xx1 = 0.15;
	int xx2 = 80;
	System.out.println("question 10 : " + xx1 * xx2);
	
	
	
	/*write a pseudocode fpr a problem to calculate a cars gas mileage
	 * 
	 * 
	 * 
	 * INPUT : milesDriven, gasUsed
	 * 
	 * output: mileage
	 * 1.start
	 * 2. input milesDriven
	 * 3.input gasUsed
	 * 4.set mileage = milesDriven / gas used
	 *  5. end
	 * 
	 */
	
	
	/*write a pseudocode for  a problem to calcluakte the total cost to buying 4 plane tikets.
	 * 
	 * input : ticketPrice
	 * output: totalPricw
	 * 
	 * 
	 * 	1. start
	 * 2. input ticketPrice
	 * 3.set TotalPrice = 4 * ticketprice
	 *	4. Display totalaPrice
	 *5. end 
	 * 
	 * 
	 * 
	 */
/////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//The modulus operator 
	
	
	//15 % 2 = 1 
			//this is because 15 % 2 = 7 with a remidner of 1
	
System.out.println("modulus operations example : 15 % 2 = : "); 	
System.out.println(15 % 2 );

	}
}

