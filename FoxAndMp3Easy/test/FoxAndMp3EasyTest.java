import org.junit.Test;

import static org.junit.Assert.*;

public class FoxAndMp3EasyTest {
    @Test
    public void test10() {
        int param0 = 3;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test11() {
        int param0 = 10;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test12() {
        int param0 = 16;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test13() {
        int param0 = 32;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test14() {
        int param0 = 109;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test15() {
        int param0 = 1000;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "1000.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test16() {
        int param0 = 1;
        assertArrayEquals(new String[]{"1.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test17() {
        int param0 = 114;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test18() {
        int param0 = 87;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test19() {
        int param0 = 127;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test20() {
        int param0 = 29;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test21() {
        int param0 = 43;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test22() {
        int param0 = 67;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test23() {
        int param0 = 511;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test24() {
        int param0 = 1;
        assertArrayEquals(new String[]{"1.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test25() {
        int param0 = 17;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test26() {
        int param0 = 148;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test27() {
        int param0 = 62;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test28() {
        int param0 = 35;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test29() {
        int param0 = 567;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test30() {
        int param0 = 143;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test31() {
        int param0 = 43;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test32() {
        int param0 = 127;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test33() {
        int param0 = 1;
        assertArrayEquals(new String[]{"1.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test34() {
        int param0 = 120;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test35() {
        int param0 = 112;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test36() {
        int param0 = 102;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test37() {
        int param0 = 21;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test38() {
        int param0 = 256;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test39() {
        int param0 = 10;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test40() {
        int param0 = 12;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test41() {
        int param0 = 160;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test42() {
        int param0 = 46;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test43() {
        int param0 = 4;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test44() {
        int param0 = 29;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test45() {
        int param0 = 5;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test46() {
        int param0 = 55;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test47() {
        int param0 = 942;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test48() {
        int param0 = 52;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "6.mp3", "7.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test49() {
        int param0 = 17;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test50() {
        int param0 = 8;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test51() {
        int param0 = 135;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test52() {
        int param0 = 3;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test53() {
        int param0 = 10;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test54() {
        int param0 = 104;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test55() {
        int param0 = 116;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test56() {
        int param0 = 114;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test57() {
        int param0 = 131;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test58() {
        int param0 = 46;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test59() {
        int param0 = 60;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test60() {
        int param0 = 1;
        assertArrayEquals(new String[]{"1.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test61() {
        int param0 = 45;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test62() {
        int param0 = 88;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test63() {
        int param0 = 133;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test64() {
        int param0 = 40;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test65() {
        int param0 = 979;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test66() {
        int param0 = 117;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test67() {
        int param0 = 6;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test68() {
        int param0 = 109;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test69() {
        int param0 = 111;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test70() {
        int param0 = 27;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test71() {
        int param0 = 1;
        assertArrayEquals(new String[]{"1.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test72() {
        int param0 = 19;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test73() {
        int param0 = 57;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test74() {
        int param0 = 640;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test75() {
        int param0 = 46;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test76() {
        int param0 = 2;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test77() {
        int param0 = 103;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test78() {
        int param0 = 10;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test79() {
        int param0 = 10;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test80() {
        int param0 = 8;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test81() {
        int param0 = 9;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test82() {
        int param0 = 382;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test83() {
        int param0 = 4;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test84() {
        int param0 = 21;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test85() {
        int param0 = 91;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test86() {
        int param0 = 59;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test87() {
        int param0 = 7;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test88() {
        int param0 = 141;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "15.mp3", "16.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test89() {
        int param0 = 101;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test90() {
        int param0 = 37;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test91() {
        int param0 = 132;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test92() {
        int param0 = 42;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test93() {
        int param0 = 13;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test94() {
        int param0 = 32;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test95() {
        int param0 = 821;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test96() {
        int param0 = 34;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test97() {
        int param0 = 20;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test98() {
        int param0 = 93;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test99() {
        int param0 = 2;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test100() {
        int param0 = 123;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test101() {
        int param0 = 40;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test102() {
        int param0 = 577;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test103() {
        int param0 = 123;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test104() {
        int param0 = 142;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "15.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test105() {
        int param0 = 150;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test106() {
        int param0 = 79;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test107() {
        int param0 = 18;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test108() {
        int param0 = 128;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test109() {
        int param0 = 3;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test110() {
        int param0 = 136;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test111() {
        int param0 = 146;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test112() {
        int param0 = 135;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test113() {
        int param0 = 59;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test114() {
        int param0 = 1;
        assertArrayEquals(new String[]{"1.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test115() {
        int param0 = 43;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test116() {
        int param0 = 31;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test117() {
        int param0 = 48;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test118() {
        int param0 = 49;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test119() {
        int param0 = 50;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test120() {
        int param0 = 51;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "6.mp3", "7.mp3", "8.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test121() {
        int param0 = 52;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "6.mp3", "7.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test122() {
        int param0 = 300;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test123() {
        int param0 = 100;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test124() {
        int param0 = 999;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test125() {
        int param0 = 500;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test126() {
        int param0 = 501;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test127() {
        int param0 = 151;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test128() {
        int param0 = 888;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test129() {
        int param0 = 701;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "110.mp3", "111.mp3", "112.mp3", "113.mp3", "114.mp3", "115.mp3", "116.mp3", "117.mp3", "118.mp3", "119.mp3", "12.mp3", "120.mp3", "121.mp3", "122.mp3", "123.mp3", "124.mp3", "125.mp3", "126.mp3", "127.mp3", "128.mp3", "129.mp3", "13.mp3", "130.mp3", "131.mp3", "132.mp3", "133.mp3", "134.mp3", "135.mp3", "136.mp3", "137.mp3", "138.mp3", "139.mp3", "14.mp3", "140.mp3", "141.mp3", "142.mp3", "143.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test130() {
        int param0 = 70;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3", "46.mp3", "47.mp3", "48.mp3", "49.mp3", "5.mp3", "50.mp3", "51.mp3", "52.mp3", "53.mp3", "54.mp3"}, new FoxAndMp3Easy().playList(param0));
    }

    @Test
    public void test0() {
        int n = 3;
        assertArrayEquals(new String[]{"1.mp3", "2.mp3", "3.mp3"}, new FoxAndMp3Easy().playList(n));
    }

    @Test
    public void test1() {
        int n = 10;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(n));
    }

    @Test
    public void test2() {
        int n = 16;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "2.mp3", "3.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(n));
    }

    @Test
    public void test3() {
        int n = 32;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "4.mp3", "5.mp3", "6.mp3", "7.mp3", "8.mp3", "9.mp3"}, new FoxAndMp3Easy().playList(n));
    }

    @Test
    public void test4() {
        int n = 109;
        assertArrayEquals(new String[]{"1.mp3", "10.mp3", "100.mp3", "101.mp3", "102.mp3", "103.mp3", "104.mp3", "105.mp3", "106.mp3", "107.mp3", "108.mp3", "109.mp3", "11.mp3", "12.mp3", "13.mp3", "14.mp3", "15.mp3", "16.mp3", "17.mp3", "18.mp3", "19.mp3", "2.mp3", "20.mp3", "21.mp3", "22.mp3", "23.mp3", "24.mp3", "25.mp3", "26.mp3", "27.mp3", "28.mp3", "29.mp3", "3.mp3", "30.mp3", "31.mp3", "32.mp3", "33.mp3", "34.mp3", "35.mp3", "36.mp3", "37.mp3", "38.mp3", "39.mp3", "4.mp3", "40.mp3", "41.mp3", "42.mp3", "43.mp3", "44.mp3", "45.mp3"}, new FoxAndMp3Easy().playList(n));
    }
}
