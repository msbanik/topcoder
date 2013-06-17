import org.junit.Test;
import static org.junit.Assert.*;

public class RollingDiceDivTwoTest {
	
	@Test
	public void test0() {
		String[] rolls = new String[] {"137", "364", "115", "724"};
		assertEquals(14, new RollingDiceDivTwo().minimumFaces(rolls));
	}
	
	@Test
	public void test1() {
		String[] rolls = new String[] {"1112", "1111", "1211", "1111"};
		assertEquals(5, new RollingDiceDivTwo().minimumFaces(rolls));
	}
	
	@Test
	public void test2() {
		String[] rolls = new String[] {"24412", "56316", "66666", "45625"};
		assertEquals(30, new RollingDiceDivTwo().minimumFaces(rolls));
	}
	
	@Test
	public void test3() {
		String[] rolls = new String[] {"931", "821", "156", "512", "129", "358", "555"};
		assertEquals(19, new RollingDiceDivTwo().minimumFaces(rolls));
	}
	
	@Test
	public void test4() {
		String[] rolls = new String[] {"3", "7", "4", "2", "4"};
		assertEquals(7, new RollingDiceDivTwo().minimumFaces(rolls));
	}
	
	@Test
	public void test5() {
		String[] rolls = new String[] {"281868247265686571829977999522", "611464285871136563343229916655", "716739845311113736768779647392", "779122814312329463718383927626",
"571573431548647653632439431183", "547362375338962625957869719518", "539263489892486347713288936885", "417131347396232733384379841536"};
		assertEquals(176, new RollingDiceDivTwo().minimumFaces(rolls));
	}
}
