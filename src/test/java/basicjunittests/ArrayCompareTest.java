package basicjunittests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySorting() {
		int[] numbers = {5, 20, 15, 12};
		int[] expected= {5, 12, 15, 20};
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
		System.out.println("JunitAssert in 'testArraySorting' method");
	}

	@Test(expected=NullPointerException.class)
	public void testArraySorting_NullPointerException() {
		int[] numbers = null;
		Arrays.sort(numbers);
		System.out.println("JunitAssert in 'testArraySorting_NullPointerException' method");
	}

	@Test(timeout=100)
	public void testArraySorting_PerformanceTesting() {
		int array[] = {10, 20, 30};
		for (int i=1;i<=10;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
		System.out.println("JunitAssert in 'testArraySorting_PerformanceTesting' method");
	}
}
