import org.junit.Test;
import static org.junit.Assert.*;

public class IncubatorEasyTest {
	
	@Test
	public void test0() {
		String[] love = new String[] {"NY","NN"};
		assertEquals(1, new IncubatorEasy().maxMagicalGirls(love));
	}
	
	@Test
	public void test1() {
		String[] love = new String[] {"NYN", "NNY", "NNN"};
		assertEquals(1, new IncubatorEasy().maxMagicalGirls(love));
	}
	
	@Test
	public void test2() {
		String[] love = new String[] {"NNYNN","NNYNN","NNNYY","NNNNN","NNNNN"};
		assertEquals(2, new IncubatorEasy().maxMagicalGirls(love));
	}
	
	@Test
	public void test3() {
		String[] love = new String[] {"NNNNN","NYNNN","NYNYN","YNYNN","NNNNN"};
		assertEquals(2, new IncubatorEasy().maxMagicalGirls(love));
	}
	
	@Test
	public void test4() {
		String[] love = new String[] {"NNNNN","NNNNN","NNNNN","NNNNN","NNNNN"};
		assertEquals(5, new IncubatorEasy().maxMagicalGirls(love));
	}
	
	@Test
	public void test5() {
		String[] love = new String[] {"Y"};
		assertEquals(0, new IncubatorEasy().maxMagicalGirls(love));
	}
}
