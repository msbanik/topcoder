import org.junit.Test;
import static org.junit.Assert.*;

public class SemiPerfectSquareTest {
	
	@Test
	public void test0() {
		int N = 48;
		assertEquals("Yes", new SemiPerfectSquare().check(N));
	}
	
	@Test
	public void test1() {
		int N = 1000;
		assertEquals("No", new SemiPerfectSquare().check(N));
	}
	
	@Test
	public void test2() {
		int N = 25;
		assertEquals("Yes", new SemiPerfectSquare().check(N));
	}
	
	@Test
	public void test3() {
		int N = 47;
		assertEquals("No", new SemiPerfectSquare().check(N));
	}
	
	@Test
	public void test4() {
		int N = 847;
		assertEquals("Yes", new SemiPerfectSquare().check(N));
	}
}
