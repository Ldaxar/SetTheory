package logicalClasses;

import java.util.ArrayList;
import java.util.List;

import main.Set;

public class Intersection <T>
{

	public Set<T> intersection(Set<T> s1, Set<T> s2)
	{
		List<T> list1=s1.getList();
		List<T> list2=s2.getList();
		List<T> result = new ArrayList<T>();
		if (list2.size()>list1.size())
		{
			List<T> temp;
			temp=list1;
			list1=list2;
			list2=temp;
		}
		
		for (int i=0;i<list2.size();i++) 
		{
			if (list1.contains(list2.get(i))) 
			{
				System.out.println(list2.get(i));
				result.add(list2.get(i));
			}
		}
			
		return new Set<T>(result);
	}
		
}
