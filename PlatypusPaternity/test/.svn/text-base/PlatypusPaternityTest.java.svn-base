import org.junit.Test;
import static org.junit.Assert.*;

public class PlatypusPaternityTest {
	
	@Test
	public void test0() {
		String[] femaleCompatibility = new String[] {"YYYY", "YYYY"};
		String[] maleCompatibility = new String[] {"NNYN", "YYYN"};
		String[] siblingGroups = new String[] {"YYYN", "NNNY"};
		assertEquals(5, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
	}
	
	@Test
	public void test1() {
		String[] femaleCompatibility = new String[] {"NNYYY"};
		String[] maleCompatibility = new String[] {"YYNNN"};
		String[] siblingGroups = new String[] {"YYNNN", "NNYYY"};
		assertEquals(0, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
	}
	
	@Test
	public void test2() {
		String[] femaleCompatibility = new String[] {"YYYYYYYYN"};
		String[] maleCompatibility = new String[] {"YYYYYYYYY"};
		String[] siblingGroups = new String[] {"YNYNYNYNY",
 "NNNYNYNNN",
 "NYNNNNNYN"};
		assertEquals(4, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
	}
	
	@Test
	public void test3() {
		String[] femaleCompatibility = new String[] {"YY"};
		String[] maleCompatibility = new String[] {"YY"};
		String[] siblingGroups = new String[] {"YN", "NY"};
		assertEquals(3, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
	}
	
	@Test
	public void test4() {
		String[] femaleCompatibility = new String[] {"YYNNYYNNYYNN",
 "YNYNYNYNYNYN",
 "YYYNNNYYYNNN"};
		String[] maleCompatibility = new String[] {"NYYNNYYNNYYN",
 "YYNYYYNYYYNY",
 "NNNNNNYYYYYY"};
		String[] siblingGroups = new String[] {"NYNNNYNNNNNN",
 "NNNNNNNNYNNN",
 "NNYNNNNNNNYN",
 "YNNNNNNYNNNN",
 "NNNNNNNNNYNY",
 "NNNYYNYNNNNN"};
		assertEquals(4, new PlatypusPaternity().maxFamily(femaleCompatibility, maleCompatibility, siblingGroups));
	}
}
