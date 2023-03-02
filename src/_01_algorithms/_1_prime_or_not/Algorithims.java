package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Algorithims {

	public static void main(String[] args){


		String number = JOptionPane.showInputDialog("Enter a number to see if it is prime number or not");
		int jox = Integer.parseInt(number);
		int j =0;
		for(int i =1; i<=jox; i++){
			if( jox%i==0){
				j++;
			}
				if(j>2)
				{
				JOptionPane.showMessageDialog(null, "It is not Prime it is a Even number");
				}
			else{
				
				JOptionPane.showMessageDialog(null, "It is a Prime number");
			
			}

		}
		
		
	}	

		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
