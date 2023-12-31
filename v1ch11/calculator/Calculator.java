package calculator;

import javax.swing.*;
import java.awt.*;

/**
 * @author Cay Horstmann
 * @version 1.35 2018-04-10
 */
public class Calculator
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater(() ->
		                       {
			                       var frame = new CalculatorFrame();
			                       frame.setTitle("Calculator");
			                       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			                       frame.setVisible(true);
		                       });
	}
}
