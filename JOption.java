/**
 * 
 * @author John Tyler Gafford
 *jtg2246@email.vccs.edu
 *September 8, 2016
 *
 */

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import java.lang.Object;

public class JOption {
	public static void main(String[] args) {
		Object integer;
		JOptionPane pane = new JOptionPane("Please enter a value between -127 to 128"
			, JOptionPane.PLAIN_MESSAGE
			, JOptionPane.DEFAULT_OPTION
			, null, null);
		pane.setWantsInput(true);
		JDialog Input = pane.createDialog(null, "Input");
		Input.setBounds(120, 130, 300, 300);
		Input.setVisible(true);
		Input.setAlwaysOnTop(true);
		integer = pane.getInputValue();
		JOptionPane set = new JOptionPane(integer
			, JOptionPane.PLAIN_MESSAGE
			, JOptionPane.DEFAULT_OPTION
			, null, null, pane.getInputValue());
		JDialog result = set.createDialog(null, "Your Input");
		result.setBounds(120, 130, 300, 300);
		result.setVisible(true);
		result.setAlwaysOnTop(true);
	}
}
