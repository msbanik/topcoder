import org.junit.Test;
import static org.junit.Assert.*;

public class MarblePositioningTest {
	
	@Test
	public void test0() {
		int[] radius = new int[] {1, 2};
		assertEquals(2.8284271247461903, new MarblePositioning().totalWidth(radius), 1e-9);
	}
	
	@Test
	public void test1() {
		int[] radius = new int[] {7,7,7};
		assertEquals(28.0, new MarblePositioning().totalWidth(radius), 1e-9);
	}
	
	@Test
	public void test2() {
		int[] radius = new int[] {10, 20, 30};
		assertEquals(62.92528739883945, new MarblePositioning().totalWidth(radius), 1e-9);
	}
	
	@Test
	public void test3() {
		int[] radius = new int[] {100, 100,11,11,25};
		assertEquals(200.0, new MarblePositioning().totalWidth(radius), 1e-9);
	}
	
	@Test
	public void test4() {
		int[] radius = new int[] {1,999950884,1};
		assertEquals(63246.0, new MarblePositioning().totalWidth(radius), 1e-9);
	}
}
