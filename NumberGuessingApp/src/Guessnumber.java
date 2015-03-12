import java.util.Scanner;

public class Guessnumber {

	public static void main(String[] args) {

		String user_decsion; 
		String user_answer;
		int upper_bound = 1000; //we can scale our game by varying upper and lower bounds
		int lower_bound = 0; // We can also scan the range bounds from user
		
		int question_count=0; // to keep track of number of questions		

		System.out.println("Think of a number between "+lower_bound+" and "+ upper_bound + " and remember");
		System.out.println("and Now, Computer is gonna guess the number in your mind");
		System.out.println("All you need is play the game, by just answering simple questions");
		System.out.println("Its simple! You need to respond answer only with any of the "
						+ "three words Higher or Lower or Yes");
		System.out.println("What if you need to exit: its Simple enter End");
		System.out.println("Enter ready to start");

		int temp_number = (upper_bound+lower_bound)/2;
		Scanner scan = new Scanner(System.in);
		user_decsion = scan.next(); //capture users initial decision whether he is ready or not
		if (user_decsion.equalsIgnoreCase("ready")) {
			System.out.println("Is the number "+ temp_number+"?");
			
			do{
				question_count++;
				user_answer = scan.next(); //capture users answers
				if (user_answer.equalsIgnoreCase("higher")) {
					lower_bound = temp_number+1;
					temp_number = (upper_bound+lower_bound)/2;
					System.out.println("Is the number "+ temp_number+"?");
				} else if (user_answer.equalsIgnoreCase("lower")) {
					upper_bound = temp_number-1;
					temp_number = (upper_bound+lower_bound)/2;
					System.out.println("Is the number "+ temp_number+"?");
				} else if (user_answer.equalsIgnoreCase("yes")) {
					System.out.println("There you go! Computer has guessed your number!");
					System.out.println("Question count :"+question_count);
				} else if (user_answer.equalsIgnoreCase("end")) {
					System.out.println("Thanks or playing! come again later!");
				} else {
					System.out.println("Please answer only with any of the "
							+ "three words Higher or Lower or Yes");
					System.out.println("If you need to exit: its Simple! enter End");
				}
			}while(!(user_answer.equalsIgnoreCase("yes")||user_answer.equalsIgnoreCase("end")));

		} else {
			System.out.println("Enter ready to start");
			System.out.println("If you need to exit: its Simple! enter End");
			user_decsion = scan.next();
			if(user_decsion.equalsIgnoreCase("end"))
			{
				System.out.println("Thanks or playing! come again later!");
			}
			
		}

	}

}
