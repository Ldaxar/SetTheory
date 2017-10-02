package logicalClasses;

import java.util.List;

import main.Set;

public class Union <T>
{	
	public Set<T> unionSet(Set<T> s1, Set<T> s2)
	{
		List<T> list1=s1.getList();
		List<T> list2=s2.getList();
		
		//result=
		return mergeUnique(list1, list2);
	}
	
	private Set<T> mergeUnique(List<T> list1, List<T> list2)
	{
		if (list2.size()>list1.size())
		{
			List<T> temp;
			temp=list1;
			list1=list2;
			list2=temp;
		}
		
		for (int i=0;i<list2.size();i++) 
			if (!list1.contains(list2.get(i))) list1.add(list2.get(i));
		return new Set<T>(list1);
	}	
	
}
