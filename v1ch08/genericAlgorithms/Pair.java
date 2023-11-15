package genericAlgorithms;

import java.util.function.Supplier;

/**
 * @author Cay Horstmann
 * @version 1.00 2004-05-10
 */
public class Pair<T>
{
	private T first;
	private T second;

	public Pair()
	{
		first  = null;
		second = null;
	}

	public Pair(T first, T second)
	{
		this.first  = first;
		this.second = second;
	}

	public static <T> Pair<T> makePair(Supplier<T> constr)
	{
		return new Pair<>(constr.get(), constr.get());
	}

	public static <T> Pair<T> makePair(Class<T> cl)
	{
		try
		{
			return new Pair<>(cl.getConstructor()
			                    .newInstance(),
			                  cl.getConstructor()
			                    .newInstance());
		}
		catch (Exception e) {return null;}
	}

	public T getFirst()               {return first;}

	public void setFirst(T newValue)  {first = newValue;}

	public T getSecond()              {return second;}

	public void setSecond(T newValue) {second = newValue;}

	public String toString()          {return "(" + first + ", " + second + ")";}
}
