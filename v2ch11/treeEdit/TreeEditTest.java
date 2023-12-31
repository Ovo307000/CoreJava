package treeEdit;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates tree editing.
 *
 * @author Cay Horstmann
 * @version 1.05 2018-05-01
 */
public class TreeEditTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new TreeEditFrame();
			                       frame.setTitle("TreeEditTest");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}
