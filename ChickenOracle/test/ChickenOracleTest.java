import org.junit.Test;
import static org.junit.Assert.*;

public class ChickenOracleTest {
	
	@Test
	public void test0() {
		int n = 10;
		int eggCount = 10;
		int lieCount = 0;
		int liarCount = 0;
		assertEquals("The egg", new ChickenOracle().theTruth(n, eggCount, lieCount, liarCount));
	}
	
	@Test
	public void test1() {
		int n = 60;
		int eggCount = 40;
		int lieCount = 0;
		int liarCount = 30;
		assertEquals("The oracle is a lie", new ChickenOracle().theTruth(n, eggCount, lieCount, liarCount));
	}
	
	@Test
	public void test2() {
		int n = 60;
		int eggCount = 20;
		int lieCount = 5;
		int liarCount = 25;
		assertEquals("The chicken", new ChickenOracle().theTruth(n, eggCount, lieCount, liarCount));
	}
	
	@Test
	public void test3() {
		int n = 1000;
		int eggCount = 500;
		int lieCount = 250;
		int liarCount = 250;
		assertEquals("Ambiguous", new ChickenOracle().theTruth(n, eggCount, lieCount, liarCount));
	}
}
