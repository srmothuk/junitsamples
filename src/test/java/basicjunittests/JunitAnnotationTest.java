package basicjunittests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitAnnotationTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass Annotation Executed");
	}

	@Before
	public void setUp() {
		System.out.println("Before Annotation Executed");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1 method Executed");
	}

	@Test
	public void test2() {
		System.out.println("Test 2 method Executed");
	}
	
	@After
	public void TearDown() {
		System.out.println("After Annotation Executed");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass Annotation Executed");
	}

}
