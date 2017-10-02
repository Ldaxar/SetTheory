package test;

import logicalClasses.Membership;
import logicalClasses.MembershipReverted;
import main.Set;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MembershipTestReverted {

    private MembershipReverted membershipR= new MembershipReverted();
    private Set<Integer> s1;
    private Set<Integer> s2;

    @Before
    public void setUp()
    {
        s1 = new Set<Integer>();
        s2 = new Set<Integer>();

        s1.addElement(1);
        s1.addElement(2);
        s1.addElement(3);

        s2.addElement(2);
        s2.addElement(1);
    }

    @Test
    public void isNotMember()
    {
        //assertFalse(membership.checkMembership(s1, s2));
        assertEquals(membershipR.checkMembership(s1, s2), -2);
    }

    @Test
    public void isMember()
    {
        //assertTrue(membership.checkMembership(s2, s1));
        assertEquals(membershipR.checkMembership(s2, s1), 1);
    }

}
