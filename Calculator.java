package cmp167project;


import java.util.Scanner;
public class Calculator {

	public static void main(String[] args)  {
	
		
		 Scanner input = new Scanner(System.in); // This is going to collect the users input 
		
		String mathOperator = ""; //holds the math operator symbol
		String userChoice = ""; // holds the users choice to use the calculator again
		boolean isMathOperatorValid = false;// error if math operator symbol is invalid
		boolean startOverYN = true; //  true to see if the user wants to continue the program
		double answer = 0.0; // This holds the answer depending on the calculations
		int numberstouse; //total numbers being calculated
		double result1 = 0.0; //result for the first operation in standard mode
	

		do { 
		//  Prompts Standard/Scientific
		System.out.println("Enter the calculator mode: Standard/Scientific?");
		String mode = input.next();
		
		
		/** choosing Standard mode*/
		if (mode.equals("Standard")) 
		{
		
		System.out.println("The calculator will operate in standard mode.");
		
	    /** Prompt the user for the operation to use and assign the math operator */

		do {
		System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
		mathOperator = input.next();
		
		//How to handle the operator
		// loop gives us a definite stop with the numbers allowed to be input
      
		if (mathOperator.equals("+")) {
			// Do the addition operations
			int i;
			isMathOperatorValid = true;
		   { System.out.println("How many numbers do you want to add?");
		   numberstouse = input.nextInt();
			System.out.println("Enter " + numberstouse + " numbers");
			for (i = 1; i <= numberstouse; i++) {
				double num11 = input.nextDouble();
				 result1 = result1 + num11;
				
				}
			 System.out.println("Result: " + result1);
		   }
			
		} else {
			if (mathOperator.equals("/")) {
				// Do the division operations
				double num12 = 1.0;
				double result2 = 1.0;
				int i;
				isMathOperatorValid = true;
				{ System.out.println("How many numbers do you want to divide?");
				numberstouse = input.nextInt();
				System.out.println("Enter " + numberstouse + " numbers");
				result2 = input.nextDouble();
				for (i = 1; i < numberstouse; i++) {
					 num12 = input.nextDouble();
					 result2 = result2 / num12;
				}
				 System.out.println("Result: " + result2);
				
				 
			}} else {
				if (mathOperator.equals("*")) {
					double num13;
					double result3 = 1.0;
					int i;
					// Do the mult operations
					isMathOperatorValid = true;
					{ System.out.println("How many numbers do you want to multiply?");
					numberstouse = input.nextInt();
					System.out.println("Enter " + numberstouse + " numbers");
					for (i = 1; i <= numberstouse; i++) {
						num13 = input.nextDouble();
						result3 = result3 * num13;
						
						}
					System.out.println("Result: " + result3);
					 }
				}
				
				else {
					if (mathOperator.equals("-")) {
						double num14 = 0.0;
						double results4 = 0.0;
						int i;
						// Do the subtraction operations
						isMathOperatorValid = true;
						{ System.out.println("How many numbers do you want to subtract?");
						numberstouse = input.nextInt();
						System.out.println("Enter " + numberstouse + " numbers");
						results4 = input.nextDouble();
						for (i = 1; i < numberstouse ; i++) {
							num14 = input.nextDouble();
							results4 = results4 - num14;
							
							}
						System.out.println("Result: " + results4);
						 }
						 
					}
					else
					{
						//if invalid operator
						/** The loop will check to see if the operator is valid for calculations  */
						System.out.println("Invalid operator " + mathOperator);
						isMathOperatorValid = false;
					}

				}

			}	

		}
		
		} while(!isMathOperatorValid);
	
		
		} else {
			if (mode.equals("Scientific")) {
				
				/** Prompt the user for the operation to use and assign the math operator: SCIENTIFIC MODE */
				System.out.println("The calculator will operate in scientific mode.");
			do { System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
				mathOperator = input.next();
				
				
				if (mathOperator.equals("+")) {
					// Does the addition operations
					int i;
					isMathOperatorValid = true;
				   { System.out.println("How many numbers do you want to add?");
				   numberstouse = input.nextInt();
					System.out.println("Enter " + numberstouse + " numbers");
					for (i = 1; i <= numberstouse; i++) {
						double num11 = input.nextDouble();
						 result1 = result1 + num11;
					
						}
					 System.out.println("Result: " + result1);
				   }
					
				}
				   
				   else {
						if (mathOperator.equals("/")) {
							// Does the division operations
							double num12 = 1.0;
							double result2 = 1.0;
							int i;
							isMathOperatorValid = true;
							{ System.out.println("How many numbers do you want to divide?");
							numberstouse = input.nextInt();
							System.out.println("Enter " + numberstouse + " numbers");
							result2 = input.nextDouble();
							for (i = 1; i < numberstouse; i++) {
								 num12 = input.nextDouble();
								 result2 = result2 / num12;
							}
							 System.out.println("Result: " + result2);
							
							 
						}} else {
							if (mathOperator.equals("*")) {
								double num13;
								double result3 = 1.0;
								int i;
								// Does the multiplication operations
								isMathOperatorValid = true;
								{ System.out.println("How many numbers do you want to multiply?");
								numberstouse = input.nextInt();
								System.out.println("Enter " + numberstouse + " numbers");
								for (i = 1; i <= numberstouse; i++) {
									num13 = input.nextDouble();
									result3 = result3 * num13;
									
									}
								System.out.println("Result: " + result3);
								 }
							}
							else {
								if (mathOperator.equals("-")) {
									double num14 = 0.0;
									double results4 = 0.0;
									int i;
									// Does the subtraction operations
									isMathOperatorValid = true;
									{ System.out.println("How many numbers do you want to subtract?");
									numberstouse = input.nextInt();
									System.out.println("Enter " + numberstouse + " numbers");
									results4 = input.nextDouble();
									for (i = 1; i < numberstouse ; i++) {
										num14 = input.nextDouble();
										results4 = results4 - num14;
										
										}
									System.out.println("Result: " + results4);
									 }
									 
								} else {
									if (mathOperator.equals("sin")) {
										// Does the sin calculation
										isMathOperatorValid = true;
										System.out.println("Enter a number in radians to find the sine");
										double radian = input.nextDouble();
										{answer = Math.sin(radian);
										 } System.out.println("Result: " + answer);
										
									} else {
										if (mathOperator.equals("cos")) {
											//  Does the cos calculation
											isMathOperatorValid = true;
											System.out.println("Enter a number in radians to find the cosine");
											double radian = input.nextDouble();
											{answer = Math.cos(radian);
											 } System.out.println("Result: " + answer);
											}
											else {
												if (mathOperator.equals("tan")) {
													//  Does the tan calculation
													isMathOperatorValid = true;
													System.out.println("Enter a number in radians to find the tangent");
													double radian = input.nextDouble();
													{answer = Math.tan(radian);
													 }
													System.out.println("Result: " + answer);											
												}
											
						
								else
								{
									//invalid operator
									System.out.println("Invalid operator " + mathOperator);
									isMathOperatorValid = false;
								}

							}

						}	

					}
			}

		}}} while(!isMathOperatorValid);
			
			}}

	
	
		
		
		
		System.out.println("Do you want to start over? (Y/N)");
		userChoice = input.next(); //Yes or No to re-do mathematics calculations
		
		if(userChoice.equals("Y"))
		{
			startOverYN = true;   //if yes, restarted answers that need to be cleared and renewed
			answer = 0.0;
			result1 = 0.0;
		}
		
		else if(userChoice.equals("N"))
		{
			  
			{startOverYN = false;
			System.out.println("Goodbye");  //if no, we end input and "Goodbye"
			input.close();
			}	
		}
		
		else {System.exit(0);}
		
		}while(startOverYN);
		
		

	}

	
	
	
	
	
	
}
