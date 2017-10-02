package test;


import java.util.List;


import logicalClasses.Union;
import main.Set;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnionTest {

	@Test
	public void unionTest() 
	{
		Set<Integer> s1 = new Set<Integer>();
		Set<Integer> s2 = new Set<Integer>();
		Union<Integer> union = new Union<Integer>();
		Set<Integer> unionResult;
		Set<Integer> desiredResult = new Set<Integer>();
		
		s1.addElement(1);
		s1.addElement(2);
		s1.addElement(3);
		
		s2.addElement(2);
		s2.addElement(3);
		s2.addElement(4);
		
		desiredResult.addElement(1);
		desiredResult.addElement(2);
		desiredResult.addElement(3);
		desiredResult.addElement(4);
		
		unionResult=union.unionSet(s1, s2);
		
		List<Integer> list = unionResult.getList();

		//assertTrue(unionResult.isEqual(desiredResult),);
		assertEquals(unionResult.isEqual(desiredResult),0);
		
		
		
	}
	
	@Test
	public void equals()
	{
		Set<Integer> desiredResult = new Set<Integer>();
		
		desiredResult.addElement(1);
		desiredResult.addElement(2);
		desiredResult.addElement(3);
		desiredResult.addElement(4);
		
		
		assertEquals(desiredResult.isEqual(desiredResult),0);
	}

}
