package basicjunittests;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitAssertTest {
	JunitExample1 example1 = new JunitExample1();
	
	@Test
	public void TruncateInFirst2PositionsTest_StartingWithNonAA() {
		assertEquals("CDAA",example1.TruncateInFirst2Positions("CDAA"));
		assertEquals("",example1.TruncateInFirst2Positions("AA"));	
		System.out.println("JunitAssert in 'TruncateInFirst2PositionsTest_StartingWithNonAA' method");
	}
	
	@Test
	public void TruncateInFirst2PositionsTest_StartingWithAA() {
		assertEquals("C",example1.TruncateInFirst2Positions("AAC"));
		assertEquals("CD",example1.TruncateInFirst2Positions("AACD"));		
		System.out.println("JunitAssert in 'TruncateInFirst2PositionsTest_StartingWithAA' method");
	}
	@Test
	public void FirstAndLast2CharsTheSameTest_BasicPositiveScenario() {
		assertTrue(example1.areFirstAndLast2CharsTheSame("ABAB"));
		System.out.println("JunitAssert in 'FirstAndLast2CharsTheSameTest_BasicPositiveScenario' method");
	}

	@Test
	public void FirstAndLast2CharsTheSameTest_BasicNegativeScenario() {
		assertFalse(example1.areFirstAndLast2CharsTheSame("ABCD"));
		System.out.println("JunitAssert in 'FirstAndLast2CharsTheSameTest_BasicNegativeScenario' method");
	}

}
