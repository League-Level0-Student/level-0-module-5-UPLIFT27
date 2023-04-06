package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	static int hapiness =0;
	static String pet;
	public static void main(String[] args) {
		
		
		
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
 
		 pet = JOptionPane.showInputDialog("What pet do you want to buy");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while(100>=hapiness)
		 {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to Make your "+ pet  +" happy", "Ways to make Pet happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "take on a walk" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.

			if(task==0)
			{
				cuddle();
			}
			if(task==1)
			{
				food();
			}
			if(task==2)
			{
				walk();
			}
			
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

			
			
 }	
 if(hapiness>=100)
	{
		JOptionPane.showMessageDialog(null, "You love your "+ pet);
	}
	
	
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
	
	
	
	
	public static void cuddle()
	{
		
		hapiness+=20;
		
			JOptionPane.showMessageDialog(null, pet +"  pet is happier after cuddling  Hapiness level:  "+ hapiness);
		
		
		
		}
	
	public static void food()
	{
		hapiness+=15;
		JOptionPane.showMessageDialog(null,  pet +" is happy, because its not hungry   Hapiness Level:  "+ hapiness);
	}
	public static void walk()
	{
		hapiness+=10;
				JOptionPane.showMessageDialog(null, pet +"  is happy for spending time with him   Hapiness level: " + hapiness);
	}
	
	
	
	
}