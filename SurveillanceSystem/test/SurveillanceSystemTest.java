import org.junit.Test;
import static org.junit.Assert.*;

public class SurveillanceSystemTest {
	
	@Test
	public void test0() {
		String containers = "-X--XX";
		int[] reports = new int[] {1, 2};
		int L = 3;
		assertEquals("??++++", new SurveillanceSystem().getContainerInfo(containers, reports, L));
	}
	
	@Test
	public void test1() {
		String containers = "-XXXXX-";
		int[] reports = new int[] {2};
		int L = 3;
		assertEquals("???-???", new SurveillanceSystem().getContainerInfo(containers, reports, L));
	}
	
	@Test
	public void test2() {
		String containers = "------X-XX-";
		int[] reports = new int[] {3, 0, 2, 0};
		int L = 5;
		assertEquals("++++++++++?", new SurveillanceSystem().getContainerInfo(containers, reports, L));
	}
	
	@Test
	public void test3() {
		String containers = "-XXXXX---X--";
		int[] reports = new int[] {2, 1, 0, 1};
		int L = 3;
		assertEquals("???-??++++??", new SurveillanceSystem().getContainerInfo(containers, reports, L));
	}
	
	@Test
	public void test4() {
		String containers = "-XX--X-XX-X-X--X---XX-X---XXXX-----X";
		int[] reports = new int[] {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
		int L = 7;
		assertEquals("???++++?++++++++++++++++++++??????--", new SurveillanceSystem().getContainerInfo(containers, reports, L));
	}
}
