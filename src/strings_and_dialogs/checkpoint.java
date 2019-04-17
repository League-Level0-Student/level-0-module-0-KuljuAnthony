package strings_and_dialogs;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class checkpoint {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What's Your favorite color?");
	JOptionPane.showMessageDialog(null, input +" is my favorite color too");
	
	Robot q=new Robot();
	q.setSpeed(100);
	q.penDown();
	q.turn(120);
	q.move(200);
	q.turn(120);
	q.move(200);
	q.turn(120);
	q.move(200);
	
}
}
