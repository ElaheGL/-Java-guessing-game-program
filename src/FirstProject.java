import java.util.Random;

import javax.swing.JOptionPane;

public class FirstProject {

	public static void main(String[] args) {
		
		Random randomGuess = new Random();
		int targetNumber = randomGuess.nextInt(10);
		int userGuess=0;
		int tries = 0;
		do {
		
			try {
		
				 userGuess= Integer.parseInt(JOptionPane.showInputDialog("enter your guess"));
				 tries++;
			}
			catch (Exception e) {
				JOptionPane.showMessageDialog(null, "please enter an integer number");
			}
			if(userGuess > targetNumber) JOptionPane.showMessageDialog(null, "your guess is bigger than me");
			else if  (userGuess < targetNumber)JOptionPane.showMessageDialog(null, "your guess is smaller than me");
			
		}
		while(userGuess != targetNumber);
	
		JOptionPane.showMessageDialog(null,"you win after"+tries+"tries");
	}

}
