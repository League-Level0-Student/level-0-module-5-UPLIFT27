package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Skillspractice {

	public static void main(String[] args) {

		Skillspractice skills = new Skillspractice();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();

	}

	void skill1() {

		String Dime = JOptionPane.showInputDialog("How many dimes do you have");
		int money = Integer.parseInt(Dime);

		int answer = money * 10;

		JOptionPane.showMessageDialog(null, "You have "+answer+ " cents");

		String height = JOptionPane.showInputDialog("how tall are you in inches");

		int tall = Integer.parseInt(height);

		if (tall <= 36) {
			JOptionPane.showMessageDialog(null, "eat some wheaties");
		} else {
			JOptionPane.showMessageDialog(null, "Good height");
		}

	}

	void skill2() {

		for (int in = 0; in <= 30; in++) {
			if (in % 3 == 0)
				System.out.print(in + " ");
		
		}
	}
	
	
	void skill3() {
		Random ran = new Random();
		System.out.println();
		int first = ran.nextInt(20);
		System.out.println(first);
		
		int second = ran.nextInt(10);
		System.out.println(second);
		
		int total = first-=second;
		System.out.println(total);

	}
	void skill4() {
		
	String city =	JOptionPane.showInputDialog("What City do you live in");
		
	if(city.equals("San Diego"))
	{
		JOptionPane.showMessageDialog(null, "You live in the world's finest ciyt");
	}
	else
	{
	JOptionPane.showMessageDialog(null, "Move to San Diego");	
	}
		
	int cars=2;
	
	JOptionPane.showMessageDialog(null, "There are 8 wheels between my family" );
	
	
	}
	void skill5() {
		
		String school = JOptionPane.showInputDialog("What School do you go to");
		
		JOptionPane.showMessageDialog(null, school+ " is a fantastic school");
		
	}

}
