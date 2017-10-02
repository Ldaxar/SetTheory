package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import logicalClasses.Complement;
import logicalClasses.Difference;
import main.Set;

public class ComplementTest {

	@Test
	public void complementTest() 
	{
		Set<Integer> s1 = new Set<Integer>();
		Set<Integer> s2 = new Set<Integer>();
		Complement<Integer> complement = new Complement<Integer>();
		Set<Integer> complementResult;
		Set<Integer> desiredResult = new Set<Integer>();
		
		s1.addElement(1);
		s1.addElement(2);
		s1.addElement(3);
		s1.addElement(9);
		
		s2.addElement(2);
		s2.addElement(3);
		s2.addElement(4);
		s2.addElement(5);
		s2.addElement(14);
		
		desiredResult.addElement(4);
		desiredResult.addElement(5);
		desiredResult.addElement(14);
		
		complementResult=complement.complement(s1, s2);
		
		List<Integer> list = complementResult.getList();
		for (Integer iterable_element : list) {
			System.out.println(iterable_element);
		}
		assertTrue(complementResult.isEquall(desiredResult));
		
	}

}
