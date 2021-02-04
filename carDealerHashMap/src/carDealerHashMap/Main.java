package carDealerHashMap;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		HashMap<String, String> car = new HashMap<String, String>();
		
		car.put( "Prius","Toyota");
		car.put("Forester", "Subaru");
		car.put("Spark", "Chevrolet");
		car.put("Jetta", "Volkswagon");
		car.put("Civic", "Honda");
		car.put("Accord", "Honda");
		
		
		System.out.println("Howdy! What car model are you looking for today?");
		String customerRequest = userInput.nextLine();
		
		if (car.containsKey(customerRequest))
		{
			System.out.println("You're in luck! We have that vehicle is in stock, right this way.");
//			System.out.printf("It appears you are looking for a %s, so come this way, our Honda section is right here!", customerRequest, car.get(customerRequest));
//			
// What is we wanted to have 2 "if" values? I really just cannot get it to do what I want. Turns out brute force doesn't really work in coding. Well at least not java. HTML and CSS was much easier to force to do what I wanted it to do. Now I'm just terrified there's so much to learn in java!
		}
		else 
		{
			System.out.printf("Oh no! It looks like we do not have that vehicle in stock today. Check back with us next week!");
			userInput.close();
			System.exit(0);
		}
	
	}
	
	
}

		
// IGNORE ALL THIS PLEASE. THE PROCESS AIN'T PRETTY 		
//		
//		if (car.containsKey(customerRequest))
//		 {
//			 	System.out.printf("It appears you are looking for a %s, so come this way, our Honda section is right here!", customerRequest, car.get(customerRequest));

//			 	System.out.printf("You're in luck! That vehicle is in stock, right this way.");
//		 }
//		 else (car.containsKey(customerRequest)==false);
//		 {		
//			 	System.out.printf("Oh no! Looks like we do not have that vehicle in stock today. Check back with us next week!");
//		 }
//		 
//		 userInput.close();
//  
//	}
// }
