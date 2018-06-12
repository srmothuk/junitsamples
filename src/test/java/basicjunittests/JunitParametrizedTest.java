package basicjunittests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JunitParametrizedTest {
	JunitExample1 example1 = new JunitExample1();
	
	private String input;
	private String expectedoutput;
	
	public JunitParametrizedTest(String input, String expectedoutput) {
		super();
		this.input = input;
		this.expectedoutput = expectedoutput;
	}

	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutput [][] = {
				{"AACD", "CD"}, 
				{"ACD", "CD"}
				};
		System.out.println("JunitAssert in 'testConditions' method");
		return Arrays.asList(expectedOutput);
	}
	
	@Test
	public void JunitParametrizedTest() {
		assertEquals(expectedoutput,example1.TruncateInFirst2Positions(input));								
		System.out.println("JunitAssert in 'JunitParametrizedTest' method");
	}
}
