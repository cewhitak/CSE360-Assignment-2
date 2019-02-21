package cse360assign2;

/**
 * Name: Courtney Whitaker
 * ClassID: 589
 * Assignment #2
 * Description: This code will add, subtract, multiple, and divide a number by a submitted
 * value. The program will also print a string of all the calculations that were completed.  
 */ 


public class Calculator {
	private int total;
	
	public Calculator () {
		total = 0;  
	}
	
	public int getTotal () {
		return total;
	}
	 
	public void add (int value) {
		total= total + value;
	}
	
	public void subtract (int value) {
		total= total - value;
	}
	
	public void multiply (int value) {
		total= total * value;
		System.out.println(total);
	}
	
	public void divide (int value) {
		if(value == 0)
		{
			total=0;
			
		}
		else
		{
			total= total / value;
		}
		System.out.println(total);
	}
	
	public String getHistory () {
		return "";
	}

}

 