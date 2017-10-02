package logicalClasses;

import java.util.ArrayList;
import java.util.List;

import main.Set;

public class Difference <T>
{

	public Set<T> difference(Set<T> s1, Set<T> s2)
	{
		List<T> list1=s1.getList();
		List<T> list2=s2.getList();
		
		for (int i=0;i<list2.size();i++) list1.remove(list2.get(i));
			
		return new Set<T>(list1);
	}
		
}
