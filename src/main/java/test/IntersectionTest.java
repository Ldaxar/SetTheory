package test;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import logicalClasses.Intersection;
import main.Set;

public class IntersectionTest {

	@Test
	public void intersectionTest() 
	{
		Set<Integer> s1 = new Set<Integer>();
		Set<Integer> s2 = new Set<Integer>();
		Intersection<Integer> intersection = new Intersection<Integer>();
		Set<Integer> intersectionResult;
		Set<Integer> desiredResult = new Set<Integer>();
		
		s1.addElement(1);
		s1.addElement(2);
		s1.addElement(3);
		
		s2.addElement(2);
		s2.addElement(3);
		s2.addElement(4);
		s2.addElement(5);
		
		desiredResult.addElement(2);
		desiredResult.addElement(3);
		
		intersectionResult=intersection.intersection(s1, s2);
		
		List<Integer> list = intersectionResult.getList();
		for (Integer iterable_element : list) {
			//System.out.println(iterable_element);
		}
		assertTrue(intersectionResult.compareIfIdentical(desiredResult));
		
	}

}
