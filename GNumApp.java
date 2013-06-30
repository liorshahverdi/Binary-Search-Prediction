package g1;
import javax.swing.*;


public class GNumApp {
	

	public static void main (String [] args)
	{
		GNumber myGNumber = new GNumber();
		int choice = -1;
		int result = 50;
		
		JOptionPane.showMessageDialog(null, "Think of a number x, such that 1<=x<=100");
		while (choice != 0)
		{
			String[] choices = {"Correct!","Higher", "Lower"};
			choice = JOptionPane.showOptionDialog(null, "Was your number..."+ result+"?", "Guess My Number", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, choices, choices[2]);
			if (choice == 2)
			{
				//number guessed is lower than result 
				myGNumber.setMaxLimit(result);
				result = (myGNumber.getMax() + myGNumber.getMin()) / 2;
			}
			else if (choice == 1)
			{
				//number guessed is higher than result 
				myGNumber.setMinLimit(result);
				result = (myGNumber.getMax() + myGNumber.getMin()) / 2;
			}
			
		}
	}
}
