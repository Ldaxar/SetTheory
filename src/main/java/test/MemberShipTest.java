package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.Membership;
import main.Set;
import main.Union;

public class MemberShipTest 
{
	private Membership<Integer> membership= new Membership<Integer>();;
	private Set<Integer> s1;
	private Set<Integer> s2;
	
	@Before
	public void setUp()
	{
		s1 = new Set<Integer>();
		s2 = new Set<Integer>();
		
		s1.addElement(1);
		s1.addElement(2);
		
		s2.addElement(2);
		s2.addElement(1);
		s2.addElement(3);
	}

	@Test
	public void isNotMember() 
	{
		assertFalse(membership.checkMembership(s1, s2));
	}
	
	@Test
	public void isMember() 
	{
		assertTrue(membership.checkMembership(s2, s1));
	}
	
	

}
