package test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import logicalClasses.Difference;
import logicalClasses.Intersection;
import main.Set;

public class DifferenceTest {

	@Test
	public void differenceTest() 
	{
		Set<Integer> s1 = new Set<Integer>();
		Set<Integer> s2 = new Set<Integer>();
		Difference<Integer> diff = new Difference<Integer>();
		Set<Integer> differenceResult;
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
		
		desiredResult.addElement(1);
		desiredResult.addElement(9);
		
		differenceResult=diff.difference(s1, s2);
		
		List<Integer> list = differenceResult.getList();
		for (Integer iterable_element : list) {
			System.out.println(iterable_element);
		}
		assertTrue(differenceResult.compareIfIdentical(desiredResult));
		
	}

}
