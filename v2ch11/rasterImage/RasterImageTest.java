package rasterImage;

import javax.swing.*;
import java.awt.*;

/**
 * This program demonstrates how to build up an image from individual pixels.
 *
 * @author Cay Horstmann
 * @version 1.15 2018-05-01
 */
public class RasterImageTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new RasterImageFrame();
			                       frame.setTitle("RasterImageTest");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}
