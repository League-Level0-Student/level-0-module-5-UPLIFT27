package _99_extra;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	static Robot rob = new Robot();

	public static void main(String[] args) {

		// 1. Create a new Robot

		// 2. Set the speed to 100
		rob.setSpeed(100);

		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Green", "Blue", "Purple", "Yellow" }, 0);

		// 3. Use if statements to check the the value of colorChoice and set the pen
		// color accordingly
		if (colorChoice == 1) {
			rob.setPenColor(1000, 0, 0);
			;
		}
		if (colorChoice == 2) {
			rob.setPenColor(0, 1000, 0);
		}
		if (colorChoice == 3) {
			rob.setPenColor(0, 0, 1000);
		}

		if (colorChoice == 4) {
			rob.setPenColor(255, 255, 0);
		}
		if (colorChoice == 5) {
			rob.setPenColor(102, 0, 153);
		}

		// 4. Ask the use how many polygons they want to be drawn.
		String i = JOptionPane.showInputDialog("how many polygons do you want to be drawn");
		String shape = JOptionPane.showInputDialog("what shape do you want drawn");
		// 5. Use the robot to draw the number of polygons the user requested.
		int pol = Integer.parseInt(i);

		for (int f = pol; f > 0; f--) {
			rob.penDown();

			if (shape.equals("square")) {
				square();
			}

			else if (shape.equals("triangle")) {
triangle();
			}
			else if(shape.equals("octagon"))
			{
			octagon();
			}

			rob.penUp();
			rob.turn(45);
			rob.move(180);

		}
	}

	public static void square() {
		for (int j = 4; j > 0; j--) {

			rob.turn(90);
			rob.move(100);
		}
	}

	public static void triangle() {
		for (int m = 3; m > 0; m--) {
			rob.turn(120);
			rob.move(100);

		}

	}
	public static void octagon() {
		for(int m=8; m>0; m--)
		{
			rob.turn(45);
			rob.move(50);
		}
	}
	
	// 6. Make it so your shapes do not overlap

	// 7. Challenge: add more colors to the Option Dialog.
}
