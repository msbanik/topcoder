import org.junit.Test;
import static org.junit.Assert.*;

public class BlackAndWhiteSolitaireTest {
	
	@Test
	public void test0() {
		String cardFront = "BBBW";
		assertEquals(1, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
	
	@Test
	public void test1() {
		String cardFront = "WBWBW";
		assertEquals(0, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
	
	@Test
	public void test2() {
		String cardFront = "WWWWWWWWW";
		assertEquals(4, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
	
	@Test
	public void test3() {
		String cardFront = "BBWBWWBWBWWBBBWBWBWBBWBBW";
		assertEquals(10, new BlackAndWhiteSolitaire().minimumTurns(cardFront));
	}
}
