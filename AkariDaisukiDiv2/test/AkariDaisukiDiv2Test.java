import org.junit.Test;
import static org.junit.Assert.*;

public class AkariDaisukiDiv2Test {
	
	@Test
	public void test0() {
		String S = "topcoderdivtwo";
		assertEquals(2, new AkariDaisukiDiv2().countTuples(S));
	}
	
	@Test
	public void test1() {
		String S = "foxciel";
		assertEquals(0, new AkariDaisukiDiv2().countTuples(S));
	}
	
	@Test
	public void test2() {
		String S = "magicalgirl";
		assertEquals(4, new AkariDaisukiDiv2().countTuples(S));
	}
	
	@Test
	public void test3() {
		String S = "waaiusushioakariusushiodaisuki";
		assertEquals(75, new AkariDaisukiDiv2().countTuples(S));
	}
	
	@Test
	public void test4() {
		String S = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		assertEquals(8924, new AkariDaisukiDiv2().countTuples(S));
	}
}
