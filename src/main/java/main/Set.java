package main;

import java.util.ArrayList;
import java.util.List;

public class Set <T> implements SetComperable<T>
{
	List<T> list = new ArrayList<T>();
	
	public Set()
	{
		
	}
	public Set(List<T> al)
	{
		this.list=al;
	}

	public void addElement(T o)
	{
		list.add(o);
	}
	
	public List<T> getList()
	{
		return list;
	}
	
	public int isEqual(Set<T> compareable)
	{
		List<T> list2=compareable.getList();
		if (list.size()!=list2.size()) return -2;
		for (int i=0; i<list.size();i++)
		{
			
			if (!list.contains(list2.get(i))) return -2;
		}
		return 0;
		
	}
	
	
	
}
