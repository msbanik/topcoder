import org.junit.Test;
import static org.junit.Assert.*;

public class CircleMarketTest {
	
	@Test
	public void test0() {
		int[] openTime = new int[] {0, 0, 0};
		int[] closeTime = new int[] {100, 100, 100};
		int travelTime = 3;
		assertEquals(3, new CircleMarket().makePurchases(openTime, closeTime, travelTime));
	}
	
	@Test
	public void test1() {
		int[] openTime = new int[] {45, 45, 0};
		int[] closeTime = new int[] {50, 50, 20};
		int travelTime = 15;
		assertEquals(1, new CircleMarket().makePurchases(openTime, closeTime, travelTime));
	}
	
	@Test
	public void test2() {
		int[] openTime = new int[] {1000, 1000};
		int[] closeTime = new int[] {1010, 1010};
		int travelTime = 1;
		assertEquals(2, new CircleMarket().makePurchases(openTime, closeTime, travelTime));
	}
	
	@Test
	public void test3() {
		int[] openTime = new int[] {999999, 2, 4};
		int[] closeTime = new int[] {1000000, 22, 44};
		int travelTime = 2;
		assertEquals(2, new CircleMarket().makePurchases(openTime, closeTime, travelTime));
	}
	
	@Test
	public void test4() {
		int[] openTime = new int[] {363, 237, 382, 232, 392, 3829, 99999, 12};
		int[] closeTime = new int[] {365, 1239, 2384, 234, 394, 3831, 100001, 15};
		int travelTime = 3;
		assertEquals(3, new CircleMarket().makePurchases(openTime, closeTime, travelTime));
	}
}
