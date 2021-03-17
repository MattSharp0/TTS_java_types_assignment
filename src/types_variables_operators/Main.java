package types_variables_operators;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner line = new Scanner(System.in);
		int lifeUniverseAndEverything = 42;
		
		System.out.println("What is the meaning of life, the universe and everything?");
		int theQuestion = input.nextInt();
		
		if (theQuestion == lifeUniverseAndEverything) {
			System.out.println("Then what is the question?");
			String answer = line.nextLine();
			
			
			System.out.println(answer + "? hmmm...I will have to think about it... \n"
					+ "Come back in 500 million years");
		
		}	else {
			System.out.println("So long and thanks for all the fish");
		}

	}

}
