import org.junit.Test;
import static org.junit.Assert.*;

public class TheSquareRootDilemmaTest {
	
	@Test
	public void test0() {
		int N = 2;
		int M = 2;
		assertEquals(2, new TheSquareRootDilemma().countPairs(N, M));
	}
	
	@Test
	public void test1() {
		int N = 10;
		int M = 1;
		assertEquals(3, new TheSquareRootDilemma().countPairs(N, M));
	}
	
	@Test
	public void test2() {
		int N = 3;
		int M = 8;
		assertEquals(5, new TheSquareRootDilemma().countPairs(N, M));
	}
	
	@Test
	public void test3() {
		int N = 100;
		int M = 100;
		assertEquals(310, new TheSquareRootDilemma().countPairs(N, M));
	}
}
