
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		Scanner user = new Scanner (System.in);
		
		double weight, length, bmi;
		
		
		System.out.println("Enter your length: ");
		length = user.nextDouble();

		
		private boolean isValid (double length){
			this.length = length;
			   if(length > 350 || length  < 50){
			       System.out.println("Invalid length." );
			       return false;
			   }  
			   else return true;
		}
				
				System.out.println("Enter your weight: " );
			weight = user.nextDouble();
		
			
			
			length = (length*length)*0.01;
			bmi = weight/length;
			bmi = bmi*100;
			System.out.printf("%.2f",bmi);
		
	}
}
		/*
		  {
     // Creating a new keyboard input
    Scanner scanner = new Scanner(System.in);


   int room;   
   do {
      // Displaying a message on the screen
      System.out.println("What room are you in? ");
      room = scanner.nextInt();
   } while( !isValid(room) );

   ... //if else or switch
}

private boolean isValid(int room){
   if(room > 4 || room  < 1){
       System.out.println("Try again ;)" );
       return false;
   }  else return true;
}
		 */

		
			/*
			System.out.println("Enter your weight: " );
		} else {
			System.out.println("It doesn't seem you entered your length...\n\nEnter your length again:");
		}
		
		
		
		length = user.nextDouble();
		if (length > 30){
			System.out.println("Enter your weight: " );
		} else {
			System.out.println("It doesn't seem you entered your length...\n\nEnter your length again:");
		}
		
		
		weight = user.nextDouble();
		if (weight > 0){
			System.out.println("Your BMI is: " );
		} else {
			System.out.println("It doesn't seem you entered your weight...\nEnter your weight again:");
		}
		
		length = (length*length)*0.01;
		bmi =weight/length;
		bmi = bmi*100;
		System.out.printf("%.2f",bmi);
		
	*/
		
		/*
		System.out.println("Enter your length: ");
		length = user.nextInt();
		length = length/100;
		System.out.println(length > 0 ? "Enter your weight: " : "Your length can't be lower than 0.n/Enter your length:");
		
		
		weight = user.nextInt();
		length = (length*length);
		bmi =weight/length;
		bmi = bmi;
		System.out.println(length > 0 ? "Your BMI is " + bmi + ".": "Your weight can't be lower than 0.n/Enter your weight:");
		*/
		
