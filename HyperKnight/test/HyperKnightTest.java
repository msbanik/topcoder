import org.junit.Test;
import static org.junit.Assert.*;

public class HyperKnightTest {
	
	@Test
	public void test0() {
		int a = 2;
		int b = 1;
		int numRows = 8;
		int numColumns = 8;
		int k = 4;
		assertEquals(20L, new HyperKnight().countCells(a, b, numRows, numColumns, k));
	}
	
	@Test
	public void test1() {
		int a = 3;
		int b = 2;
		int numRows = 8;
		int numColumns = 8;
		int k = 2;
		assertEquals(16L, new HyperKnight().countCells(a, b, numRows, numColumns, k));
	}
	
	@Test
	public void test2() {
		int a = 1;
		int b = 3;
		int numRows = 7;
		int numColumns = 11;
		int k = 0;
		assertEquals(0L, new HyperKnight().countCells(a, b, numRows, numColumns, k));
	}
	
	@Test
	public void test3() {
		int a = 3;
		int b = 2;
		int numRows = 10;
		int numColumns = 20;
		int k = 8;
		assertEquals(56L, new HyperKnight().countCells(a, b, numRows, numColumns, k));
	}
	
	@Test
	public void test4() {
		int a = 1;
		int b = 4;
		int numRows = 100;
		int numColumns = 10;
		int k = 6;
		assertEquals(564L, new HyperKnight().countCells(a, b, numRows, numColumns, k));
	}
	
	@Test
	public void test5() {
		int a = 2;
		int b = 3;
		int numRows = 1000000000;
		int numColumns = 1000000000;
		int k = 8;
		assertEquals(999999988000000036L, new HyperKnight().countCells(a, b, numRows, numColumns, k));
	}
}
