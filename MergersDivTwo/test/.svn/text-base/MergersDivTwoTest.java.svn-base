import org.junit.Test;
import static org.junit.Assert.*;

public class MergersDivTwoTest {
	
	@Test
	public void test0() {
		int[] revenues = new int[] {5, -7, 3};
		int k = 2;
		assertEquals(1.5, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] revenues = new int[] {5, -7, 3};
		int k = 3;
		assertEquals(0.3333333333333333, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] revenues = new int[] {1, 2, 2, 3, -10, 7};
		int k = 3;
		assertEquals(2.9166666666666665, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] revenues = new int[] {-100, -100, -100, -100, -100, 100};
		int k = 4;
		assertEquals(-66.66666666666667, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
	
	@Test
	public void test4() {
		int[] revenues = new int[] {869, 857, -938, -290, 79, -901, 32, -907, 256, -167, 510, -965, -826, 808, 890,
 -233, -881, 255, -709, 506, 334, -184, 726, -406, 204, -912, 325, -445, 440, -368};
		int k = 7;
		assertEquals(706.0369290573373, new MergersDivTwo().findMaximum(revenues, k), 1e-9);
	}
}
