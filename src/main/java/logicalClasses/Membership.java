package logicalClasses;

import java.util.List;

import main.Set;

public class Membership <T>
{
	public int checkMembership(Set<T> s1, Set<T> s2)
	{
		List<T> list1=s1.getList();
		List<T> list2=s2.getList();
		if (list1.size()<list2.size()) return -2;
		for (int i=0;i<list2.size();i++)
			if (!list1.contains(list2.get(i))) return -2;
		return -1;
	}
}
