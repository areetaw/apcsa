import java.util.Scanner;

public class WarmUp_8_24 
{
	
	public static void main(String[] args) 
	{
		String lion = "Fluffy";
		boolean hasEaten = false;
		int amAntelope = 2;
		double pmAntelope = 3.5;
		String newsReport = "";
		double totalAntelope = 0;
		
//		newsReport = "In the morning " + lion + " ate ";
//		newsReport = newsReport + (amAntelope + pmAntelope);
//		hasEaten = (amAntelope > 0);
//		totalAntelope = amAntelope + pmAntelope;
//		boolean full = hasEaten && (totalAntelope > 5);
//		newsReport = newsReport + ". " + lion + " is full.";
//		System.out.println(newsReport);
//		
//		// Warm up for September 14, 2017
//		Scanner console = new Scanner(System.in);
//		System.out.println("Question");
//		String input = console.nextLine();
//		System.out.println("You entered " + input);
//		
//		    System.out.print("What is your phrase? ");
//		    String phrase = console.next();
//		    System.out.print("How many times should I repeat it? ");
//		    String times = console.next();
//		    int i;
//		    i = Integer.valueOf(times).intValue();
//		    while (i != 0) {
//		        System.out.println(phrase); 
//		        i = i-1;
//		    }
		    
		// Warm up for September 25, 2017
		    
		    for (int x = 0; x < 3; x++) {
		    	for (int y = 0; y < 5; y++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		    for (int x = 0; x < 3; x++) {
		    	for (int y = 0; y < 2; y++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();
		    }
		    
		// Warm up for September 26, 2017 -- study monday night
		    
		    for (int rows = 0; rows < 5; rows++) {
		    	for (int stars = 0; stars < rows; stars++) {
		    		System.out.print("*");
		    	}
		    	System.out.println();;
		    }
		    
		    for (int rows = 0; rows < 5; rows++) {
		    	for (int stars = 5; stars > rows; stars--) {
		    		System.out.print("*");
		    	}
		    	System.out.println();;
		    }
	}
}

	
