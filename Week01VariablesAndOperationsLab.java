package week01;

	public class Week01VariablesAndOperationsLab {

		public static void main(String[] args) {
			System.out.println("Week 1 Lab");

			// 1. Create a variable to hold the quantity of 
			//		available plane seats left on a flight	
			int availablePlaneSeats = 20;

			
			// 2. Create a variable to hold the cost of groceries at checkout
					double costGroceries = 54.25;

			
			// 3. Create a variable to hold a person's middle initial
					char middleInitial = 'S';

		
			// 4. Create a variable to hold true if it's hot outside 
			//		and false if it's cold outside
					
					boolean ifHotOutside = true;

			
			// 5. Create a variable to hold a customer's first name
					String firstName = "Sam";

			
			// 6. Create a variable to hold a street address
					String street = "1245 Sam Street";
			

			// 7. Print all variables to the console
					System.out.println(availablePlaneSeats);
					System.out.println(costGroceries);
					System.out.println(middleInitial);
					System.out.println(ifHotOutside);
					System.out.println(firstName);
					System.out.println(street);
					
		

			// 8. A customer booked 2 plane seats, 
			//		remove 2 seats from the available seats variable
					
					availablePlaneSeats -= 2;
		

			// 9. Impulse candy bar purchase, add 2.15 to the grocery total
			// 		costOfGroceries = costOfGroceries + 2.15;
					
					costGroceries = costGroceries + 2.15;


			// 10.  The birth certificate was printed incorrectly, 
			//		change the middle initial to something else
					middleInitial = 'C';
			

			// 11.  The season has changed, update the hot outside 
			//			variable to be opposite of what it was
					
					ifHotOutside = false;


			// 12.  Create a new variable called full name using the customer's first name, 
			//			the middle initial, and a last name of your choice
					String lastName = "Samson";
					String fullName = firstName + " " + middleInitial + " " + lastName;
		

			// 13.  Print a line to the console that introduces the customer and says they live
			// 			at the address variable
	System.out.println("Good Morning, I would like to introduce " + fullName +", who lives at " + street + "." );
			
			
		}


}
