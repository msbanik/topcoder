import org.junit.Test;
import static org.junit.Assert.*;

public class SpaceWarDiv2Test {
	
	@Test
	public void test0() {
		int[] magicalGirlStrength = new int[] {2, 3, 5};
		int[] enemyStrength = new int[] {1, 3, 4};
		int[] enemyCount = new int[] {2, 9, 4};
		assertEquals(7, new SpaceWarDiv2().minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
	}
	
	@Test
	public void test1() {
		int[] magicalGirlStrength = new int[] {2, 3, 5};
		int[] enemyStrength = new int[] {1, 1, 2};
		int[] enemyCount = new int[] {2, 9, 4};
		assertEquals(5, new SpaceWarDiv2().minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
	}
	
	@Test
	public void test2() {
		int[] magicalGirlStrength = new int[] {14, 6, 22};
		int[] enemyStrength = new int[] {8, 33};
		int[] enemyCount = new int[] {9, 1};
		assertEquals(-1, new SpaceWarDiv2().minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
	}
	
	@Test
	public void test3() {
		int[] magicalGirlStrength = new int[] {17, 10, 29, 48, 92, 60, 80, 100, 15, 69, 36, 43, 70, 14, 88, 12, 14, 29, 9, 40};
		int[] enemyStrength = new int[] {93, 59, 27, 68, 48, 82, 15, 95, 61, 49, 68, 15, 16, 26, 64, 82, 7, 8, 92, 15};
		int[] enemyCount = new int[] {56, 26, 12, 52, 5, 19, 93, 36, 69, 61, 68, 66, 55, 28, 49, 55, 63, 57, 33, 45};
		assertEquals(92, new SpaceWarDiv2().minimalFatigue(magicalGirlStrength, enemyStrength, enemyCount));
	}
}
