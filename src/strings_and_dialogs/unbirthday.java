package strings_and_dialogs;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("When is your birthday? (MM/DD)");
		if (input.equals("(04/17)")) {
       JOptionPane.showMessageDialog(null, "Happy Birthday!");
		}else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday :'(");
		}

	}
}
