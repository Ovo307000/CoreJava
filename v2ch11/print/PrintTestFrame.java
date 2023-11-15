package print;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 * This frame shows a panel with 2D graphics and buttons to print the graphics and to set up
 * the page format.
 */
public class PrintTestFrame extends JFrame
{
	private PrintComponent           canvas;
	private PrintRequestAttributeSet attributes;

	public PrintTestFrame()
	{
		canvas = new PrintComponent();
		add(canvas, BorderLayout.CENTER);

		attributes = new HashPrintRequestAttributeSet();

		var buttonPanel = new JPanel();
		var printButton = new JButton("Print");
		buttonPanel.add(printButton);
		printButton.addActionListener(event ->
		                              {
			                              try
			                              {
				                              PrinterJob job = PrinterJob.getPrinterJob();
				                              job.setPrintable(canvas);
				                              if (job.printDialog(attributes)) job.print(attributes);
			                              }
			                              catch (PrinterException e)
			                              {
				                              JOptionPane.showMessageDialog(PrintTestFrame.this, e);
			                              }
		                              });

		var pageSetupButton = new JButton("Page setup");
		buttonPanel.add(pageSetupButton);
		pageSetupButton.addActionListener(event ->
		                                  {
			                                  PrinterJob job = PrinterJob.getPrinterJob();
			                                  job.pageDialog(attributes);
		                                  });

		add(buttonPanel, BorderLayout.NORTH);
		pack();
	}
}
