package comboBox;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.36 2018-04-10
 */
public class ComboBoxTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new ComboBoxFrame();
			                       frame.setTitle("ComboBoxTest");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}