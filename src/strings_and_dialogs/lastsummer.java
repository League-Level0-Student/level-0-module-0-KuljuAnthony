package strings_and_dialogs;

import javax.swing.JOptionPane;

public class lastsummer {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What is your name?");
	String inpout = JOptionPane.showInputDialog("What did you do last summer?");
	JOptionPane.showMessageDialog(null, "I know that you "+input+" last summer,"+inpout+" . Muhahaha!");
	
	
}
}
