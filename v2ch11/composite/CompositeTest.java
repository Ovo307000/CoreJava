package composite;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates the Porter-Duff composition rules.
 *
 * @author Cay Horstmann
 * @version 1.05 2018-05-01
 */
public class CompositeTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new CompositeTestFrame();
			                       frame.setTitle("CompositeTest");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}

