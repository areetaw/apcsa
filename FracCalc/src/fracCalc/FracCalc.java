package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) 
    {
    	Scanner console = new Scanner(System.in);
		System.out.println("What something that you want to calculate?");
		String input = console.nextLine();
		System.out.print(produceAnswer(input));
		
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input)
    {
    	String[] arr = input.split(" ");
        return arr[arr.length-1];
    }

    // TODO: Fill in the space below with any helper methods that you think you will need
    
}
