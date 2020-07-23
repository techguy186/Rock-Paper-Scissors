import java.util.Scanner;


public class RockPaperScissors {
	
	public static void determineWinner(String userChoice , String computerChoice ){
		
		if(userChoice.equals("wrong choice")) {
			
			System.out.println("You should choose between Rock, Paper and Scissors.");
		}
		
		System.out.print("The Result is : ");
		
		if(userChoice.equals(computerChoice)) {
			
			System.out.println("Tie");
			
		}
		
		if(userChoice.equals("rock")) {
			
			if(computerChoice.equals("paper")) {
				
				System.out.println("Computer won!");
				
			}
			
			else {
				
				System.out.println("You won!");
				
			}
			
		}
		
		if(userChoice.equals("paper")) {
			
			if(computerChoice.equals("scissors")) {
				
				System.out.println("Computer won!");
				
			}
			
			else {
				
				System.out.println("You won!");
				
			}
			
		}
		
		if(userChoice.equals("scissors")) {
			
			if(computerChoice.equals("rock")) {
				
				System.out.println("Computer won!");
				
			}
			
			else {
				
				System.out.println("You won!");
				
			}
			
		}

		
	}
	
	public static String getComputerInput(){
	
		int randomNumber = (int)Math.floor(Math.random() * 3);
		
		switch(randomNumber) {
		
		case 0:
			return "rock";
		case 1:
			return "paper";
		case 2:
			return "scissors";
		default:
			return "";
		
		}
		
	}

	public static String getUserInput(String userInput) {
		
		userInput = userInput.toLowerCase();
		
		if( userInput.equals("rock") || userInput.equals("paper") || userInput.equals("scissors") ) {
			
			return userInput;
			
		}
		
		else {
			
			
			return "wrong choice";
			
		}
		
	}
	
	public static void main(String args[]) {
		
		System.out.println("Welcome to Rock, Paper and Scissors Game : ");
		System.out.println("-------------------------------------------");
		
		System.out.println();
		System.out.println("Your Choices are Rock, Paper and Scissors.");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Put Your Choice : ");
		String getUser = sc.next();
		System.out.println("You threw : " + getUser);
		String userChoice = getUserInput(getUser);
		
		String computerChoice = getComputerInput();
		System.out.println("Computer threw : " + computerChoice);
		
		determineWinner(userChoice, computerChoice);
	}
	
}
