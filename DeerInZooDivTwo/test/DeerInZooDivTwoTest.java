import org.junit.Test;
import static org.junit.Assert.*;

public class DeerInZooDivTwoTest {
	
	@Test
	public void test0() {
		int N = 3;
		int K = 2;
		assertArrayEquals(new int[] {1, 2 }, new DeerInZooDivTwo().getminmax(N, K));
	}
	
	@Test
	public void test1() {
		int N = 3;
		int K = 3;
		assertArrayEquals(new int[] {0, 1 }, new DeerInZooDivTwo().getminmax(N, K));
	}
	
	@Test
	public void test2() {
		int N = 10;
		int K = 0;
		assertArrayEquals(new int[] {10, 10 }, new DeerInZooDivTwo().getminmax(N, K));
	}
	
	@Test
	public void test3() {
		int N = 654;
		int K = 321;
		assertArrayEquals(new int[] {333, 493 }, new DeerInZooDivTwo().getminmax(N, K));
	}
	
	@Test
	public void test4() {
		int N = 100;
		int K = 193;
		assertArrayEquals(new int[] {0, 3 }, new DeerInZooDivTwo().getminmax(N, K));
	}
}
