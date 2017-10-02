package logicalClasses;

import java.util.List;

import main.Set;

public class Complement <T>
{
	public Set<T> complement(Set<T> s1, Set<T> s2)
	{
		List<T> list1=s1.getList();
		List<T> list2=s2.getList();
		
		for (int i=0;i<list1.size();i++) list2.remove(list1.get(i));
			
		return new Set<T>(list2);
	}
}
