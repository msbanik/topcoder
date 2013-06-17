import org.junit.Test;
import static org.junit.Assert.*;

public class RandomColoringDiv2Test {
	
	@Test
	public void test0() {
		int maxR = 5;
		int maxG = 1;
		int maxB = 1;
		int startR = 2;
		int startG = 0;
		int startB = 0;
		int d1 = 0;
		int d2 = 1;
		assertEquals(3, new RandomColoringDiv2().getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
	}
	
	@Test
	public void test1() {
		int maxR = 4;
		int maxG = 2;
		int maxB = 2;
		int startR = 0;
		int startG = 0;
		int startB = 0;
		int d1 = 3;
		int d2 = 3;
		assertEquals(4, new RandomColoringDiv2().getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
	}
	
	@Test
	public void test2() {
		int maxR = 4;
		int maxG = 2;
		int maxB = 2;
		int startR = 0;
		int startG = 0;
		int startB = 0;
		int d1 = 5;
		int d2 = 5;
		assertEquals(0, new RandomColoringDiv2().getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
	}
	
	@Test
	public void test3() {
		int maxR = 6;
		int maxG = 9;
		int maxB = 10;
		int startR = 1;
		int startG = 2;
		int startB = 3;
		int d1 = 0;
		int d2 = 10;
		assertEquals(540, new RandomColoringDiv2().getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
	}
	
	@Test
	public void test4() {
		int maxR = 6;
		int maxG = 9;
		int maxB = 10;
		int startR = 1;
		int startG = 2;
		int startB = 3;
		int d1 = 4;
		int d2 = 10;
		assertEquals(330, new RandomColoringDiv2().getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
	}
	
	@Test
	public void test5() {
		int maxR = 49;
		int maxG = 59;
		int maxB = 53;
		int startR = 12;
		int startG = 23;
		int startB = 13;
		int d1 = 11;
		int d2 = 22;
		assertEquals(47439, new RandomColoringDiv2().getCount(maxR, maxG, maxB, startR, startG, startB, d1, d2));
	}
}
