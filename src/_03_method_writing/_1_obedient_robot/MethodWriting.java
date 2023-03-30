package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class MethodWriting {

	public static Robot rob = new Robot();

	public static void main(String[] args) {

		rob.penDown();
		rob.setSpeed(100);
	//	robsquare();

	//	robtriangle();
     //   robcircle();
		
	
    String shape =JOptionPane.showInputDialog("What shape do you want to draw");
    String color = JOptionPane.showInputDialog("What Color do you want: We have red, green, and blue");
    
    if(color.equals("red"))		
    {
    	rob.setPenColor(1000,0,0);
    }
    if(color.equals("blue"))		
    {
    	rob.setPenColor(0,0,1000);
    }
    if(color.equals("green"))		
    {
    	rob.setPenColor(0,1000,0);
    }
    
    
    if(shape.equals("circle"))
    {
        robcircle()	;
        }
    else if(shape.equals("square"))    
    {
    	robsquare();
    }
    else if(shape.equals("triangle"))
    {	
   robtriangle();
    
    }
    else
    {
    	JOptionPane.showMessageDialog(null, "Misspelled or cannot print out that shape");
    }
        
        
	
	
	
	
	
	
	}

	public static void robsquare() {
		for (int i = 0; i < 4; i++) {
			rob.move(100);
			rob.turn(90);
		}

	}

	public static void robtriangle() {
rob.setX(100);
		
		for (int i = 0; i < 3; i++) {

			rob.move(100);
			rob.turn(120);

		}

	}
	
	public static void robcircle()
	{
		rob.setY(100);
		
		for(int i=0; i<360; i++)
		{
			
			rob.move(1);
			rob.turn(1);
		}

		
		
		
	}
	
	
	
	
	
	

}
