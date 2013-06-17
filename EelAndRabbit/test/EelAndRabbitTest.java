import org.junit.Test;
import static org.junit.Assert.*;

public class EelAndRabbitTest {
	
	@Test
	public void test0() {
		int[] l = new int[] {2, 4, 3, 2, 2, 1, 10};
		int[] t = new int[] {2, 6, 3, 7, 0, 2, 0};
		assertEquals(6, new EelAndRabbit().getmax(l, t));
	}
	
	@Test
	public void test1() {
		int[] l = new int[] {1, 1, 1};
		int[] t = new int[] {2, 0, 4};
		assertEquals(2, new EelAndRabbit().getmax(l, t));
	}
	
	@Test
	public void test2() {
		int[] l = new int[] {1};
		int[] t = new int[] {1};
		assertEquals(1, new EelAndRabbit().getmax(l, t));
	}
	
	@Test
	public void test3() {
		int[] l = new int[] {8, 2, 1, 10, 8, 6, 3, 1, 2, 5};
		int[] t = new int[] {17, 27, 26, 11, 1, 27, 23, 12, 11, 13};
		assertEquals(7, new EelAndRabbit().getmax(l, t));
	}
}
