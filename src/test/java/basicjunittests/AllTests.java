package basicjunittests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayCompareTest.class, JunitAnnotationTest.class, JunitAssertTest.class, JunitParametrizedTest.class })

public class AllTests {

}
