import org.junit.Test;
import static org.junit.Assert.*;

public class CuttingBitStringTest {
	
	@Test
	public void test0() {
		String S = "101101101";
		assertEquals(3, new CuttingBitString().getmin(S));
	}
	
	@Test
	public void test1() {
		String S = "1111101";
		assertEquals(1, new CuttingBitString().getmin(S));
	}
	
	@Test
	public void test2() {
		String S = "00000";
		assertEquals(-1, new CuttingBitString().getmin(S));
	}
	
	@Test
	public void test3() {
		String S = "110011011";
		assertEquals(3, new CuttingBitString().getmin(S));
	}
	
	@Test
	public void test4() {
		String S = "1000101011";
		assertEquals(-1, new CuttingBitString().getmin(S));
	}
	
	@Test
	public void test5() {
		String S = "111011100110101100101110111";
		assertEquals(5, new CuttingBitString().getmin(S));
	}

    @Test
    public void test10() {
        String param0 = "101101101";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test11() {
        String param0 = "1111101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test12() {
        String param0 = "00000";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test13() {
        String param0 = "110011011";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test14() {
        String param0 = "1000101011";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test15() {
        String param0 = "111011100110101100101110111";
        assertEquals(5, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test16() {
        String param0 = "1101100011010111001001101011011100010111011110101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test17() {
        String param0 = "0101";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test18() {
        String param0 = "1001";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test19() {
        String param0 = "11111111111111111111111111111111111111111111111111";
        assertEquals(50, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test20() {
        String param0 = "10111001110011";
        assertEquals(4, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test21() {
        String param0 = "10011100011110011100111110100001001110011";
        assertEquals(7, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test22() {
        String param0 = "10111110101111000011111010000100111110100001001101";
        assertEquals(4, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test23() {
        String param0 = "11101111011011111101110011101101101111011101101111";
        assertEquals(22, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test24() {
        String param0 = "11111101111111011111011101";
        assertEquals(10, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test25() {
        String param0 = "1011111110111111011111101111111111101111110111";
        assertEquals(14, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test26() {
        String param0 = "11111011111101111110111111011111101111110111111011";
        assertEquals(8, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test27() {
        String param0 = "11111011111111101111111101111111101111110111111111";
        assertEquals(20, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test28() {
        String param0 = "11111011111101111111011111101111111111111101111111";
        assertEquals(20, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test29() {
        String param0 = "11001110001";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test30() {
        String param0 = "110011000100101101";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test31() {
        String param0 = "111110100001001";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test32() {
        String param0 = "101111101";
        assertEquals(5, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test33() {
        String param0 = "11001110001111101";
        assertEquals(6, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test34() {
        String param0 = "0";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test35() {
        String param0 = "1";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test36() {
        String param0 = "00";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test37() {
        String param0 = "10";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test38() {
        String param0 = "01";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test39() {
        String param0 = "11";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test40() {
        String param0 = "000";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test41() {
        String param0 = "100";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test42() {
        String param0 = "010";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test43() {
        String param0 = "110";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test44() {
        String param0 = "001";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test45() {
        String param0 = "101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test46() {
        String param0 = "011";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test47() {
        String param0 = "111";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test48() {
        String param0 = "00000000000000000000000000000000000000000000000000";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test49() {
        String param0 = "101101101101101101101101101101101101101101101101";
        assertEquals(16, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test50() {
        String param0 = "00010111001110100000101101001100010011111111100110";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test51() {
        String param0 = "11101001011110011100110111100111000111000100001010";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test52() {
        String param0 = "01010101001001100110001101101110111100111111001100";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test53() {
        String param0 = "01000000100101011000001001011111111100100100100111";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test54() {
        String param0 = "10001110000011011101010011010001011111010100000001";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test55() {
        String param0 = "11110101100011101001011001110010110000";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test56() {
        String param0 = "0101011001101011010111000100010";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test57() {
        String param0 = "001001011000000011001011100001000111000";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test58() {
        String param0 = "11001111010110010000110011100110011111001101";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test59() {
        String param0 = "0011100";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test60() {
        String param0 = "1";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test61() {
        String param0 = "101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test62() {
        String param0 = "11001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test63() {
        String param0 = "1111101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test64() {
        String param0 = "1001110001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test65() {
        String param0 = "110000110101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test66() {
        String param0 = "11110100001001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test67() {
        String param0 = "10011000100101101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test68() {
        String param0 = "1011111010111100001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test69() {
        String param0 = "111011100110101100101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test70() {
        String param0 = "100101010000001011111001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test71() {
        String param0 = "10111010010000111011011101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test72() {
        String param0 = "1110100011010100101001010001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test73() {
        String param0 = "1001000110000100111001110010101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test74() {
        String param0 = "101101011110011000100000111101001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test75() {
        String param0 = "11100011010111111010100100110001101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test76() {
        String param0 = "10001110000110111100100110111111000001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test77() {
        String param0 = "1011000110100010101111000010111011000101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test78() {
        String param0 = "110111100000101101101011001110100111011001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test79() {
        String param0 = "100010101100011100100011000001001000100111101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test80() {
        String param0 = "10101101011110001110101111000101101011000110001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test81() {
        String param0 = "1101100011010111001001101011011100010111011110101";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test82() {
        String param0 = "11110011100111011100111100110110110111100110111001";
        assertEquals(16, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test83() {
        String param0 = "101110011100011001110001111110110011100011111101";
        assertEquals(7, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test84() {
        String param0 = "11001110011111010000100110110111100111110100001001";
        assertEquals(8, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test85() {
        String param0 = "1111010000100111110100001001110000110101";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test86() {
        String param0 = "101111011100110101100101110011011111010111100001";
        assertEquals(4, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test87() {
        String param0 = "111010001101010010100101000110011100011";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test88() {
        String param0 = "11110100001001111011100110101100101";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test89() {
        String param0 = "111101000010011001010100000010111110011";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test90() {
        String param0 = "1111101101110100100001110110111011100110011100011";
        assertEquals(5, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test91() {
        String param0 = "1001110001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test92() {
        String param0 = "11011110000010110110101100111010011101100111001";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test93() {
        String param0 = "101110011100110110110110111001110011100110111001";
        assertEquals(12, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test94() {
        String param0 = "11111011100111001100111000110011100011011001110001";
        assertEquals(7, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test95() {
        String param0 = "1100110011100011111010000100110111110100001001";
        assertEquals(5, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test96() {
        String param0 = "111110110111110101111000011001110001";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test97() {
        String param0 = "101111011100110101100101100101010000001011111001";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test98() {
        String param0 = "100110001001011011110100011010100101001010001";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test99() {
        String param0 = "101101011110011000100000111101001101";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test100() {
        String param0 = "111011100110101100101101101";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test101() {
        String param0 = "1011111010111100001";
        assertEquals(1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test102() {
        String param0 = "10111001110111100000101101101011001110100111011001";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test103() {
        String param0 = "10111010010000111011011101100101010000001011111001";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test104() {
        String param0 = "11111111111111111111111111110";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test105() {
        String param0 = "1011111011011111011011111011011111011011111011111";
        assertEquals(29, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test106() {
        String param0 = "0011";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test107() {
        String param0 = "00000000000000000000000001111111111111111111111111";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test108() {
        String param0 = "11001000110000100111001110010101";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test109() {
        String param0 = "10101101011110001110101111000101101011000110001101";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test110() {
        String param0 = "1000111000011011110010011011111100000110111001";
        assertEquals(3, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test111() {
        String param0 = "1010101";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test112() {
        String param0 = "111110111111011111101101";
        assertEquals(4, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test113() {
        String param0 = "1000000000000000000000000000000000000000000000000";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test114() {
        String param0 = "000001111101";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test115() {
        String param0 = "11010110101111000111010111100010110101100011000111";
        assertEquals(4, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test116() {
        String param0 = "110111110101";
        assertEquals(-1, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test117() {
        String param0 = "11111011111010111100001";
        assertEquals(5, new CuttingBitString().getmin(param0));
    }
    @Test
    public void test118() {
        String param0 = "11011000110101110010011010110111000101110111101011";
        assertEquals(2, new CuttingBitString().getmin(param0));
    }
}
