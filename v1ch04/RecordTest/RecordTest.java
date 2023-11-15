import java.util.Date;

/**
 * This program demonstrates records.
 *
 * @author Cay Horstmann
 * @version 1.0 2021-05-13
 */
public class RecordTest
{
	public static void main(String[] args)
	{
		var p = new Point(3, 4);
		System.out.println("Coordinates of p: " + p.x() + " " + p.y());
		System.out.println("Distance from origin: " + p.distanceFromOrigin());
		// Same computation with static field and method
		System.out.println("Distance from origin: " + Point.distance(Point.ORIGIN, p));

		// A mutable record
		var pt = new PointInTime(3, 4, new Date());
		System.out.println("Before: " + pt);
		pt.when()
		  .setTime(0);
		System.out.println("After: " + pt);

		// Invoking a compact constructor

		var r = new Range(4, 3);
		System.out.println("r: " + r);
	}
}

record Point(double x, double y)
{
	// A static field and method
	public static Point ORIGIN = new Point();

	// A custom constructor
	public Point() {this(0, 0);}

	public static double distance(Point p, Point q)
	{
		return Math.hypot(p.x - q.x, p.y - q.y);
	}

	// A method
	public double distanceFromOrigin()
	{
		return Math.hypot(x, y);
	}
}

record PointInTime(double x, double y, Date when) {}

record Range(int from, int to)
{
	// A compact constructor
	public Range
	{
		if (from > to) // Swap the bounds
		{
			int temp = from;
			from = to;
			to   = temp;
		}
	}
}
