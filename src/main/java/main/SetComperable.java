package main;

public interface SetComperable <T> 
{
	
	public default boolean compareObject(T o1, T o2)
	{
		if (o1.equals(o2)) return true;
		else return false;
	}
}

