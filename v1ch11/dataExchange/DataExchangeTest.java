package dataExchange;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.36 2021-05-30
 */
public class DataExchangeTest
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new DataExchangeFrame();
			                       frame.setTitle("DataExchangeTest");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}
