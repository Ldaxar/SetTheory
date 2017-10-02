package logicalClasses;


import main.Set;

import java.util.List;

public class MembershipReverted <T>{

    public int checkMembership(Set<T> s2, Set<T> s1)
    {
        List<T> list1=s1.getList();
        List<T> list2=s2.getList();
        if (list1.size()<list2.size()) return -2;
        for (int i=0;i<list2.size();i++)
            if (!list1.contains(list2.get(i))) return -2;
        return 1;
    }

}
