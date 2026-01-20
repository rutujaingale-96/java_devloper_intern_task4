package internship;

import java.util.Scanner;

public class Task4 {
	
        public int add(int a, int b) {
	        return a + b;
	    }

	    
	    public double subtract(double a, double b) {
	        return a - b;
	    }

	   
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    
	    public double divide(double a, double b) throws ArithmeticException {
	        
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	        return a / b;
	    }

	   public double add(double a, double b) {
	        return a + b;
	    }

	     public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    
	    public void demonstratePassByValue(int num) {
	        System.out.println("  Initial value inside method: " + num);
	        num = 100; 
	        System.out.println("  Value inside method after change: " + num);
	    }

	   
	    public static void main(String[] args) {
	        Task4 calc = new Task4();
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("--- Calculator Demonstration ---");
	        System.out.println("int addition : "+calc.add(5, 3));

	        System.out.println("double addition : "+ calc.add(5.5, 3.2));

	        System.out.println("three int addition : )"+ calc.add(1, 2, 3));

	       
	        System.out.println("subtraction : "+ calc.subtract(10.0, 4.5));

	        System.out.println("multiplication : "+ calc.multiply(6.0, 7.0));

	        
	        try {
	        	System.out.println("division : "+ calc.divide(10.0, 2.0));
	        } catch (ArithmeticException e) {
	            System.out.println("Division error : " + e.getMessage());
	        }

	        
	        try {
	        	System.out.println("division : "+ calc.divide(10.0, 0.0));
	        } catch (ArithmeticException e) {
	            System.out.println("Division error: " + e.getMessage());
	        }

	        
	        System.out.println("\n--- Pass-by-Value Demonstration ---");
	        int originalNum = 50;
	        System.out.println("  Original value before method call: " + originalNum);
	        calc.demonstratePassByValue(originalNum);
	        System.out.println("  Original value after method call: " + originalNum); // Remains 50

	        scanner.close();
	    
	}

}
