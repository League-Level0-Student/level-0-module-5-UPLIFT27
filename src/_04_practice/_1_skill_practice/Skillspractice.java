package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

public class Skillspractice {

	public static void main(String[] args) {	
	
	

		
		String Dime = JOptionPane.showInputDialog( "How many dimes do you have");
		int money = Integer.parseInt(Dime);
		
	int answer = total(money, 10);
	
	JOptionPane.showMessageDialog(null, answer(answer));
	
	
	String height = JOptionPane.showInputDialog("how tall are you in inches");
	
	int tall = Integer.parseInt(height);
	
	if(tall<=36)
	{
		JOptionPane.showMessageDialog(null, "eat some wheaties");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Good");
	}
	
	
	
	for(int in=0; in<=30; in++)
	{
		if(in%3==0)
		System.out.print(in+ " ");
	}
		
	
	
	
	
	
	ffwe
	
	
	
	
	
	}
public static int total(int a , int b)
{
	return a*b;
}
public static String answer(int answer)
{
	return "you have "+ answer + " cents";
}




}
