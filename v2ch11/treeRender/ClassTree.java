package treeRender;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates cell rendering and listening to tree selection events.
 *
 * @author Cay Horstmann
 * @version 1.05 2018-05-01
 */
public class ClassTree
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new ClassTreeFrame();
			                       frame.setTitle("ClassTree");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}

