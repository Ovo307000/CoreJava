package book;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates the printing of a multi-page book. It prints a "banner", by
 * blowing up a text string to fill the entire page vertically. The program also contains
 * a generic print preview dialog.
 *
 * @author Cay Horstmann
 * @version 1.14 2018-05-10
 */
public class BookTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new BookTestFrame();
			                       frame.setTitle("BookTest");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}
