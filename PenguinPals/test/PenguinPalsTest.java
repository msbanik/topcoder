import org.junit.Test;
import static org.junit.Assert.*;

public class PenguinPalsTest {
	
	@Test
	public void test0() {
		String colors = "RRBRBRBB";
		assertEquals(3, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test1() {
		String colors = "RRRR";
		assertEquals(2, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test2() {
		String colors = "BBBBB";
		assertEquals(2, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test3() {
		String colors = "RBRBRBRBR";
		assertEquals(4, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test4() {
		String colors = "RRRBRBRBRBRB";
		assertEquals(5, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test5() {
		String colors = "R";
		assertEquals(0, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test6() {
		String colors = "RBRRBBRB";
		assertEquals(3, new PenguinPals().findMaximumMatching(colors));
	}
	
	@Test
	public void test7() {
		String colors = "RBRBBRBRB";
		assertEquals(4, new PenguinPals().findMaximumMatching(colors));
	}
}
