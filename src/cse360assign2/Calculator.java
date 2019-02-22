package cse360assign2;

/**
 * Name: Courtney Whitaker
 * ClassID: 589
 * Assignment #2
 * Description: This code will add, subtract, multiple, and divide a number by a submitted
 * value. The program will also print a string of all the calculations that were completed.  
 */ 

/**
 * The Calculator class creates a calculator object that can add, subtract, multiply, 
 * and divide 
 * @author Courtney2
 *
 */

public class Calculator {
	private int total;
	private String history="0";
	/**
	 * Calculator is the constructor that sets the calculator to zero
	 * @author Courtney2
	 *
	 */
	
	public Calculator () {
		total = 0;   
		
	}
	
	/**
	 * getTotal returns the current value of total, the value of the calculator after
	 * all calculations have been completed
	 * @author Courtney2
	 *
	 */
	
	public int getTotal () {
		return total;
	}
	 
	/**
	 * add method adds a value to the current total value in the calculator
	 * @author Courtney2
	 *
	 */
	
	public void add (int value) {
		total= total + value;
		history= history + " + " + value;
	}
	
	/**
	 * subtract method subtracts a value from the current total value in the calculator
	 * @author Courtney2
	 *
	 */
	
	public void subtract (int value) {
		total= total - value;
		history= history + " - " + value;
	}
	
	/**
	 * multiply method multiplies a value by the current total value in the calculator
	 * @author Courtney2
	 *
	 */
	
	public void multiply (int value) {
		total= total * value;
		history= history + " * " + value;
		
	}
	
	/**
	 * divide method divides a value from the current total value in the calculator
	 * and if the value is 0 the total is set to 0
	 * @author Courtney2
	 *
	 */
	
	public void divide (int value) {
		if(value == 0)
		{
			total=0;
			
		}
		else
		{
			total= total / value;
		}
		history= history + " / " + value;
	}
	
	/**
	 * getHistory method returns a string of all the calculations that took place
	 * @author Courtney2
	 *
	 */
	
	public String getHistory () {
		return history;
	}
	

}

 