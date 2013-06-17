import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryTest {

    @Test
    public void test0() {
        int[] sales = new int[]{5};
        int[] daysAvailable = new int[]{15};
        assertEquals(10, new Inventory().monthlyOrder(sales, daysAvailable));
    }

    @Test
    public void test1() {
        int[] sales = new int[]{75, 120, 0, 93};
        int[] daysAvailable = new int[]{24, 30, 0, 30};
        assertEquals(103, new Inventory().monthlyOrder(sales, daysAvailable));
    }

    @Test
    public void test2() {
        int[] sales = new int[]{8773};
        int[] daysAvailable = new int[]{16};
        assertEquals(16450, new Inventory().monthlyOrder(sales, daysAvailable));
    }

    @Test
    public void test3() {
        int[] sales = new int[]{1115, 7264, 3206, 6868, 7301};
        int[] daysAvailable = new int[]{1, 3, 9, 4, 18};
        assertEquals(36091, new Inventory().monthlyOrder(sales, daysAvailable));
    }

    @Test
    public void test5() {
        int[] daysAvailable = new int[]{5};
        int[] sales = new int[]{15};
        assertEquals(10, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test6() {
        int[] daysAvailable = new int[]{75, 120, 0, 93};
        int[] sales = new int[]{24, 30, 0, 30};
        assertEquals(103, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test7() {
        int[] daysAvailable = new int[]{8773};
        int[] sales = new int[]{16};
        assertEquals(16450, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test8() {
        int[] daysAvailable = new int[]{1115, 7264, 3206, 6868, 7301};
        int[] sales = new int[]{1, 3, 9, 4, 18};
        assertEquals(36091, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test9() {
        int[] daysAvailable = new int[]{9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999};
        int[] sales = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        assertEquals(299970, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test10() {
        int[] daysAvailable = new int[]{6709, 3119, 9767, 805, 8272, 9067, 1485, 8406, 1692, 3891, 6412, 6837, 1370, 6687, 5588, 4579, 1661, 4765, 6660, 7124, 5579, 9940, 7285, 7737, 2194, 7837, 8061, 9622, 9105, 8520, 4440, 120, 0, 3408, 5921, 3407, 6672, 8748, 3548, 9884, 4600, 1807, 976, 3762, 8595};
        int[] sales = new int[]{27, 26, 13, 21, 25, 4, 11, 14, 29, 29, 25, 12, 17, 24, 3, 12, 24, 23, 18, 8, 5, 4, 14, 20, 10, 25, 30, 24, 19, 19, 5, 8, 0, 23, 16, 12, 10, 24, 2, 15, 14, 6, 23, 12, 12};
        assertEquals(15791, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test11() {
        int[] daysAvailable = new int[]{3179, 502, 2481, 8901};
        int[] sales = new int[]{26, 27, 28, 29};
        assertEquals(4024, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test12() {
        int[] daysAvailable = new int[]{1606, 5854, 7677, 2747, 2875, 5832, 1412, 3806, 7955, 5848, 6799, 6235, 18, 5091, 4250, 717, 2673};
        int[] sales = new int[]{9, 25, 21, 27, 2, 5, 17, 27, 2, 1, 26, 14, 14, 11, 16, 2, 10};
        assertEquals(27522, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test13() {
        int[] daysAvailable = new int[]{8514, 6386, 2876, 8878, 3832, 6676, 7371, 0, 3513, 9508, 3336, 1740, 2913, 7194, 8017, 6514, 3914, 6034, 3546, 647, 8034, 1703, 9470, 5021, 1921, 5717, 1599, 4858, 222, 1648, 9636, 1119, 690, 7644, 887, 9396, 8997, 2759, 9522};
        int[] sales = new int[]{8, 25, 2, 18, 20, 20, 3, 0, 25, 12, 26, 20, 7, 9, 12, 25, 24, 2, 11, 28, 17, 8, 21, 15, 5, 22, 8, 13, 8, 12, 20, 11, 29, 26, 28, 23, 15, 19, 21};
        assertEquals(14562, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test14() {
        int[] daysAvailable = new int[]{5874, 1405, 6468, 1187, 2415, 7586, 3336, 6116, 3483, 8604, 6197, 4688, 58, 2768, 675};
        int[] sales = new int[]{26, 8, 8, 26, 18, 16, 10, 13, 9, 12, 3, 17, 11, 8, 12};
        assertEquals(13043, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test15() {
        int[] daysAvailable = new int[]{356, 2759, 3928, 6623, 8557, 9569, 7859, 603, 2837, 6872, 8087, 1909, 9583, 2216, 3108, 5405, 7107, 2857, 2883, 8872, 8975, 8746, 8961, 6454, 623, 3188, 8119, 0, 7158, 2239, 5853, 1658, 4355, 3234, 354, 8725};
        int[] sales = new int[]{11, 14, 29, 1, 23, 7, 4, 1, 25, 3, 1, 9, 13, 1, 15, 9, 5, 1, 7, 4, 9, 12, 29, 8, 10, 18, 5, 0, 20, 18, 14, 18, 9, 28, 5, 13};
        assertEquals(34034, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test16() {
        int[] daysAvailable = new int[]{5817, 7936, 9671, 9315, 5755, 5120, 7662};
        int[] sales = new int[]{5, 24, 7, 10, 27, 3, 11};
        assertEquals(27530, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test17() {
        int[] daysAvailable = new int[]{5218, 3332, 2125, 1159, 4602, 5056, 9142, 5835, 6108, 8999, 3697, 4966, 4458, 8561, 6715, 8545, 933, 8830};
        int[] sales = new int[]{2, 1, 21, 20, 7, 29, 12, 9, 30, 2, 26, 29, 30, 19, 23, 22, 15, 21};
        assertEquals(25202, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test18() {
        int[] daysAvailable = new int[]{6250, 2445, 3641, 440, 2624, 2770, 2695, 886, 2421, 9488, 5972, 4280, 3031, 268, 4606, 1024, 7447, 7562, 1547, 1706, 7026, 4634, 5261, 9407, 6243, 5837, 1774, 3278, 9921, 2304, 7091, 4701, 2262, 0, 4372, 1098, 1388, 7448, 6407, 8165, 3706};
        int[] sales = new int[]{25, 8, 17, 28, 14, 2, 30, 24, 3, 29, 30, 5, 7, 18, 23, 28, 9, 10, 27, 29, 19, 14, 3, 26, 11, 18, 2, 17, 6, 21, 15, 16, 30, 0, 25, 8, 23, 1, 15, 20, 16};
        assertEquals(17505, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test19() {
        int[] daysAvailable = new int[]{827, 2707, 5453, 8236, 6742, 3419, 6210, 7071, 1004, 9399, 0, 731, 6202, 5211, 489, 3432, 8156, 2104, 9826, 8538, 6047, 6480, 2917, 9936};
        int[] sales = new int[]{17, 27, 22, 19, 10, 13, 10, 26, 14, 23, 0, 24, 4, 2, 27, 21, 4, 6, 8, 2, 12, 10, 4, 26};
        assertEquals(23034, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test20() {
        int[] daysAvailable = new int[]{1112, 5630, 2575, 2126, 8610};
        int[] sales = new int[]{24, 27, 29, 8, 25};
        assertEquals(5723, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test21() {
        int[] daysAvailable = new int[]{8940, 4269, 3920, 8049, 5137};
        int[] sales = new int[]{3, 28, 15, 23, 3};
        assertEquals(32737, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test22() {
        int[] daysAvailable = new int[]{1909, 6223, 6585, 6533, 3227, 4318, 7631, 5096, 2680, 3249, 9298, 8453, 9355, 8512, 6160, 3484, 2415, 6952, 9744, 232, 8367, 7882, 10};
        int[] sales = new int[]{9, 9, 6, 12, 24, 12, 30, 1, 15, 22, 28, 14, 22, 28, 9, 22, 6, 12, 21, 13, 4, 3, 4};
        assertEquals(22709, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test23() {
        int[] daysAvailable = new int[]{2043, 2554, 0, 851, 7549, 7567, 6621, 1379, 6610, 2992, 9208, 4133, 7521, 0, 7489, 5398, 790, 6632, 3262, 5313, 7944, 2594, 6149, 4040, 7165, 3907, 7963, 7464, 1355, 4398, 3144, 833, 3418, 2731, 6833, 5403, 5523, 9175, 9329, 4953, 3423, 6475, 8400, 205, 8913, 149, 1148, 552, 110};
        int[] sales = new int[]{19, 20, 0, 29, 15, 3, 16, 11, 14, 1, 18, 12, 2, 0, 28, 6, 4, 12, 3, 26, 10, 17, 22, 28, 11, 11, 21, 21, 1, 20, 27, 15, 17, 28, 26, 19, 11, 16, 1, 9, 16, 17, 25, 6, 30, 11, 24, 18, 19};
        assertEquals(21153, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test24() {
        int[] daysAvailable = new int[]{9284, 3574, 8527, 648, 204, 5549, 5283, 5382, 9218, 4553, 841, 6177, 1476, 1069, 4227, 424, 2024, 8736, 9758, 2482, 5102, 9129, 5098, 9212, 0, 1339, 4342, 0, 4688, 2694, 4805, 9384, 1777, 4092, 5335, 4557, 6347, 179, 1946, 7412, 4956, 6673};
        int[] sales = new int[]{17, 20, 3, 14, 8, 18, 1, 25, 21, 9, 20, 18, 30, 15, 13, 7, 7, 2, 23, 4, 28, 9, 20, 23, 0, 1, 15, 0, 3, 9, 13, 15, 12, 26, 28, 26, 13, 2, 9, 8, 7, 25};
        assertEquals(20016, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test25() {
        int[] daysAvailable = new int[]{4010, 6439, 282, 9089, 95, 3176, 8042, 4084, 6350, 2239, 7659, 8792, 41};
        int[] sales = new int[]{17, 27, 16, 25, 19, 8, 30, 9, 3, 26, 27, 15, 10};
        assertEquals(11668, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test26() {
        int[] daysAvailable = new int[]{3102, 375, 4102, 4785, 6866, 8797, 7474, 2130, 0, 292, 2396, 641, 7051, 0, 1667, 9182, 2302, 2999, 6944, 7494, 6679, 4487, 0, 2884, 6614, 4163, 4463, 690, 4677, 146, 6106, 5815, 8665, 9810, 1331, 0, 888, 6508, 4851, 4561, 8529, 9003, 515, 1492, 9316, 7207, 2596, 2951};
        int[] sales = new int[]{19, 17, 1, 18, 18, 19, 9, 10, 0, 6, 26, 18, 10, 0, 23, 1, 19, 1, 11, 26, 29, 22, 0, 15, 7, 3, 26, 8, 10, 6, 8, 20, 26, 8, 19, 0, 13, 20, 29, 13, 3, 8, 25, 3, 22, 8, 7, 3};
        assertEquals(23923, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test27() {
        int[] daysAvailable = new int[]{6653, 3960, 7474, 7436, 5614, 66, 3301, 0, 7094, 187, 9833, 9436, 2563, 8159, 2469, 3060, 2423, 0, 863, 2022, 5054, 1268, 8602, 4020, 0, 1368, 0, 7557, 4007, 9446, 2303, 6933, 3931, 5236, 1733, 4082, 3432, 0, 2077};
        int[] sales = new int[]{28, 8, 29, 29, 17, 28, 27, 0, 23, 21, 21, 24, 22, 18, 17, 19, 4, 0, 19, 16, 11, 13, 14, 13, 0, 20, 0, 30, 2, 10, 20, 24, 2, 18, 4, 15, 22, 0, 7};
        assertEquals(11561, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test28() {
        int[] daysAvailable = new int[]{7680, 9971, 9702, 0, 3020, 0, 574, 4482, 5847, 7283, 1350, 8271, 1775, 690, 653, 362, 8526, 7182, 4683, 5595, 9582, 3633, 4882};
        int[] sales = new int[]{24, 20, 13, 0, 25, 0, 1, 23, 22, 7, 27, 8, 3, 15, 30, 28, 2, 18, 4, 12, 8, 10, 27};
        assertEquals(19369, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test29() {
        int[] daysAvailable = new int[]{2468, 1227, 704, 6128, 478, 6399, 8144, 2047, 3653, 9150, 9416, 99, 4596, 7321, 0, 3442, 4686, 992, 698, 3662, 6472, 4344, 0, 4540, 0, 7134, 3229, 8868, 9937, 3161, 1636, 6045, 8331, 1787, 9906, 5512, 5388};
        int[] sales = new int[]{27, 25, 26, 16, 21, 25, 3, 19, 21, 16, 20, 10, 27, 16, 0, 24, 27, 8, 16, 3, 6, 13, 0, 7, 0, 26, 15, 8, 22, 26, 30, 22, 16, 16, 19, 18, 25};
        assertEquals(11867, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test30() {
        int[] daysAvailable = new int[]{6492, 4280, 8331, 528, 7579, 3313, 6358, 3245, 3544, 4703, 6910, 1634, 7775, 1953, 8576, 7651, 379, 3588, 1515, 6082, 3483, 3879, 5719, 8803, 1325, 8136, 8830, 4792, 9305, 7170, 5077, 1459, 3105, 6332, 6519, 3145, 2443, 7569, 6142, 9410, 3543, 1507, 1299, 5355};
        int[] sales = new int[]{4, 18, 1, 20, 10, 29, 18, 17, 25, 5, 25, 23, 22, 12, 24, 23, 15, 21, 16, 13, 9, 8, 23, 7, 6, 8, 5, 18, 30, 22, 21, 7, 28, 11, 17, 24, 23, 7, 4, 10, 16, 5, 27, 19};
        assertEquals(18738, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test31() {
        int[] daysAvailable = new int[]{2008, 0, 6923, 9599, 2801, 6220, 7087, 8648, 9466};
        int[] sales = new int[]{12, 0, 26, 3, 7, 18, 15, 22, 17};
        assertEquals(21756, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test32() {
        int[] daysAvailable = new int[]{4866, 6478, 1596, 1427, 5917, 2006, 3867, 2873, 431, 7735, 7369, 9697, 1561, 7788, 5774, 4175};
        int[] sales = new int[]{2, 25, 9, 19, 29, 24, 22, 11, 17, 28, 4, 6, 28, 27, 23, 29};
        assertEquals(15316, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test33() {
        int[] daysAvailable = new int[]{2951, 372, 5221, 6564, 9787, 8834, 9306, 8344, 6535, 5236, 3180, 5653, 2356, 3678, 7422, 6483, 5092, 6160, 9579, 584, 2597, 5324, 6008, 4476, 736, 1594, 3412, 5072, 8258, 1015, 9617, 559, 2193, 292, 1085};
        int[] sales = new int[]{21, 15, 28, 11, 15, 8, 8, 18, 28, 25, 2, 30, 18, 28, 5, 20, 23, 9, 22, 16, 21, 18, 25, 26, 23, 3, 29, 14, 20, 28, 7, 10, 22, 15, 20};
        assertEquals(11940, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test34() {
        int[] daysAvailable = new int[]{4397, 4507, 1910, 682, 3131, 548, 15, 6341, 7367, 5732, 9045, 311, 9096, 8083, 7270, 8586, 3895, 7496, 870, 2841, 7804, 802, 3955, 9238, 0, 7248, 4408, 2342, 2529, 0, 9821, 2848, 4509, 1231, 3584, 6354, 632};
        int[] sales = new int[]{8, 25, 6, 20, 10, 23, 24, 7, 4, 5, 25, 24, 18, 13, 10, 15, 7, 30, 3, 4, 5, 12, 6, 11, 0, 27, 21, 21, 23, 0, 9, 28, 13, 4, 27, 4, 3};
        assertEquals(15024, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test35() {
        int[] daysAvailable = new int[]{9540, 5665, 7120, 4752, 4394, 7246, 4735, 0, 2233, 2831, 0, 1333, 828, 8340, 1777, 249, 2453, 9957, 5171, 6783, 1883, 478, 4539, 6185, 6612, 284, 323, 3901, 9962, 4210, 4397, 9885, 653, 5519, 8672, 203, 7896, 0, 3754, 349, 2925, 9691, 3689, 7552, 1031, 5448, 4904, 9197, 1084};
        int[] sales = new int[]{12, 15, 11, 18, 30, 29, 7, 0, 14, 22, 0, 17, 14, 15, 15, 9, 29, 27, 7, 7, 2, 24, 1, 8, 18, 9, 27, 20, 26, 23, 12, 5, 2, 5, 18, 27, 19, 0, 28, 14, 1, 13, 10, 26, 20, 15, 29, 21, 29};
        assertEquals(15730, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test36() {
        int[] daysAvailable = new int[]{604, 7527, 6174, 8382, 5370, 7297, 4065, 2437, 7371, 7121, 7162, 6156, 8489, 4948, 3022, 6901, 9350, 8563, 1434, 841, 7546, 2286, 9814, 1456, 9199, 2265, 0, 1959, 7123, 1003, 4809, 5808, 6666, 8719, 9131, 831, 7981, 3184, 4898, 2506, 6659, 0};
        int[] sales = new int[]{4, 19, 1, 13, 5, 20, 7, 24, 1, 13, 17, 24, 23, 13, 27, 15, 8, 21, 2, 16, 16, 11, 24, 17, 8, 9, 0, 4, 23, 14, 27, 2, 20, 10, 26, 13, 19, 12, 26, 23, 28, 0};
        assertEquals(23341, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test37() {
        int[] daysAvailable = new int[]{2070, 4810, 8050, 6949, 7218, 6017, 5047, 2563, 6402, 2752, 452, 7153, 4169, 3518, 7244, 8524, 8414, 0, 9498, 0, 7213, 7941, 8800, 1734, 8568, 2452, 1667, 4920, 9133, 7294, 851, 2912, 7910, 0, 1037, 3464, 2417};
        int[] sales = new int[]{5, 7, 27, 19, 24, 13, 14, 22, 8, 26, 14, 22, 9, 6, 18, 15, 22, 0, 28, 0, 10, 11, 13, 3, 30, 11, 4, 21, 19, 14, 26, 5, 7, 0, 29, 18, 13};
        assertEquals(12380, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test38() {
        int[] daysAvailable = new int[]{243, 5496, 5001, 3563, 9754, 4417, 6635, 695, 8695, 310, 8989, 6908, 3509, 7049, 5312, 3423, 3964, 760, 2509, 5076, 9562, 9340, 1183, 4598, 4608, 1833, 3563, 7244};
        int[] sales = new int[]{7, 25, 29, 30, 22, 14, 21, 23, 8, 15, 25, 17, 21, 24, 23, 20, 7, 2, 21, 2, 13, 28, 11, 1, 28, 16, 2, 29};
        assertEquals(17225, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test39() {
        int[] daysAvailable = new int[]{6113, 656, 4030, 4041, 8679, 2426, 7538, 6376, 471, 3144, 2205, 7735, 9956, 6136, 2968, 0, 2914, 0, 7432, 5644, 2654, 7758, 7664};
        int[] sales = new int[]{29, 16, 2, 19, 16, 2, 3, 28, 27, 27, 3, 22, 11, 4, 28, 0, 5, 0, 21, 14, 11, 5, 9};
        assertEquals(21036, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test40() {
        int[] daysAvailable = new int[]{1340, 5876, 0, 9687, 451, 5259, 3835, 5921, 9002, 2846, 8668, 6025, 2478, 2398, 2838, 8284, 1276, 9459, 161, 4852, 7382, 6380, 6213, 1154, 2586, 9092, 9928, 7880, 8863, 2096, 4567, 3985, 5650, 5503, 2702, 6089, 1678, 3542, 626, 3271, 7186, 0, 4295, 6971, 8191, 0, 7003};
        int[] sales = new int[]{16, 13, 0, 29, 25, 23, 3, 15, 29, 30, 16, 8, 13, 19, 18, 20, 7, 19, 24, 3, 12, 5, 23, 26, 6, 3, 19, 4, 23, 15, 13, 5, 26, 22, 13, 22, 2, 2, 6, 29, 9, 0, 28, 11, 26, 0, 6};
        assertEquals(16611, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test41() {
        int[] daysAvailable = new int[]{2955, 8518, 7502};
        int[] sales = new int[]{19, 23, 21};
        assertEquals(8832, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test42() {
        int[] daysAvailable = new int[]{5597, 5626, 4852, 1141, 2001, 4332, 9161, 4292, 4938, 7509, 4345, 1063, 8987, 1615, 0, 4894, 9539, 2851, 1235, 148, 6262, 9592, 8694, 4597, 7546, 6922, 8854, 0, 3444, 3112, 8427, 6967, 5148, 4384, 3017};
        int[] sales = new int[]{14, 21, 20, 18, 17, 13, 20, 30, 6, 13, 12, 4, 7, 26, 0, 26, 11, 6, 15, 28, 3, 30, 4, 30, 30, 23, 19, 0, 2, 18, 23, 8, 20, 20, 24};
        assertEquals(15005, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test43() {
        int[] daysAvailable = new int[]{7800, 5031, 802, 5497, 2889, 7255, 4322, 8152, 9093, 8167, 3151, 5094, 259, 8591, 9766, 8506, 2278, 2565, 4249, 4779, 9790, 8318, 2445, 595, 2287, 5387, 9585, 5526};
        int[] sales = new int[]{7, 13, 9, 17, 8, 30, 21, 3, 15, 8, 23, 3, 2, 30, 17, 20, 22, 28, 26, 18, 29, 1, 8, 2, 23, 21, 17, 12};
        assertEquals(23123, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test44() {
        int[] daysAvailable = new int[]{6559, 661, 1713, 2799, 8193, 885, 4779, 0, 2620, 4219, 834, 7772, 5946, 8169, 1855};
        int[] sales = new int[]{28, 24, 5, 19, 30, 28, 5, 0, 13, 3, 18, 9, 28, 18, 18};
        assertEquals(11356, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test45() {
        int[] daysAvailable = new int[]{750, 8490, 4199, 8851, 4776, 3117, 3433, 9450, 8264, 8173, 5265, 8864, 7713, 3108, 1602, 9093, 4365, 2884, 7127, 6298, 8315, 1248, 1926, 6441, 6795, 6291, 7, 2897, 1508, 2950, 5752, 9142, 5382, 962, 1583, 5763, 7035, 1283, 1744, 8792, 1696, 4157};
        int[] sales = new int[]{5, 26, 25, 12, 8, 23, 3, 26, 9, 13, 26, 21, 22, 16, 5, 12, 25, 15, 8, 2, 22, 11, 11, 17, 11, 16, 5, 25, 22, 10, 21, 27, 5, 9, 17, 2, 13, 16, 21, 14, 14, 29};
        assertEquals(14806, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test46() {
        int[] daysAvailable = new int[]{0, 3240, 945, 3393, 6839, 5238, 7376, 8263, 2724, 6323, 1635, 7571, 6665, 1025, 9036, 1657, 4816, 1264, 9585, 5856};
        int[] sales = new int[]{0, 16, 29, 11, 23, 29, 24, 9, 18, 2, 22, 17, 19, 12, 6, 29, 13, 20, 9, 6};
        assertEquals(16664, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test47() {
        int[] daysAvailable = new int[]{5933, 862, 4531, 898, 3211, 624, 1129};
        int[] sales = new int[]{27, 28, 26, 7, 19, 13, 19};
        assertEquals(3556, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test48() {
        int[] daysAvailable = new int[]{3275, 4386, 8700, 0, 0, 6015, 305, 9610, 5426, 4112, 6843, 4872, 5440, 1751, 1026, 8734, 2079, 9490, 7168, 3811, 4997, 7722, 1785, 5200, 5745, 4168, 3214, 1462, 8205, 2039, 6520, 2966, 739, 225, 5811, 6456, 1458, 2034, 4446, 5310};
        int[] sales = new int[]{29, 29, 26, 0, 0, 27, 17, 9, 13, 28, 15, 1, 30, 2, 12, 6, 14, 12, 14, 11, 20, 12, 7, 16, 23, 1, 13, 28, 29, 3, 13, 2, 23, 9, 18, 26, 11, 12, 23, 2};
        assertEquals(19826, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test49() {
        int[] daysAvailable = new int[]{4911, 7152, 2041, 8030, 8264, 5987, 9235, 5279, 6609, 4575, 9950, 3226, 0, 0, 549, 4960, 8835, 8235, 7554, 4883, 3211, 7419, 5145, 4729, 3370, 2669, 3706, 5497, 4257, 5071, 5019, 5884, 9907, 4741, 5051, 8602, 6345};
        int[] sales = new int[]{9, 19, 25, 28, 7, 15, 5, 15, 20, 1, 16, 26, 0, 0, 19, 8, 26, 19, 10, 7, 25, 21, 17, 25, 20, 15, 13, 30, 18, 2, 17, 4, 11, 4, 8, 30, 22};
        assertEquals(19899, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test50() {
        int[] daysAvailable = new int[]{8423, 1032, 9070, 3535, 2494, 8564, 3057, 2767, 3895, 8400, 887, 1832, 1431, 6210, 751, 6545, 1059, 885, 2183, 9003, 5035, 337, 1692, 3901, 1064, 1144, 9941, 3658, 5082, 8193, 2261, 340, 7164, 0, 315, 0, 827, 3686, 3060, 8325, 9295};
        int[] sales = new int[]{9, 4, 25, 14, 28, 15, 14, 19, 18, 19, 24, 20, 14, 12, 1, 1, 9, 25, 18, 10, 20, 8, 21, 4, 3, 5, 25, 20, 15, 11, 9, 26, 11, 0, 21, 0, 30, 13, 29, 2, 1};
        assertEquals(23933, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test51() {
        int[] daysAvailable = new int[]{5844, 2131, 6273, 4827, 4341, 913, 9628, 4799, 7503, 1941, 0, 7376, 1719, 5952, 8121, 0, 5601, 6329, 2754, 4857, 8085, 8876, 2780, 9369, 4831, 8063, 9701, 8590, 6064};
        int[] sales = new int[]{5, 24, 11, 13, 28, 9, 21, 16, 15, 30, 0, 5, 23, 29, 23, 0, 13, 13, 19, 16, 16, 3, 1, 14, 21, 4, 24, 10, 19};
        assertEquals(19995, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test52() {
        int[] daysAvailable = new int[]{1527, 9008, 6874, 669, 5658, 7025, 7790, 4389, 9640, 6059, 124, 4487, 7535, 7560, 6830, 3363, 9997, 9701, 3914, 1669, 3453, 0, 8093, 9728, 9322, 5076, 708};
        int[] sales = new int[]{24, 19, 2, 25, 9, 6, 2, 8, 6, 1, 29, 22, 6, 20, 24, 27, 12, 6, 25, 20, 7, 0, 30, 27, 8, 19, 10};
        assertEquals(29398, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test53() {
        int[] daysAvailable = new int[]{4034, 9882, 5046, 1736, 5538, 6597, 9308, 6067, 7314, 5993, 9545, 1003, 8237, 740, 4918, 7174, 104, 8203, 7664, 5376, 7984, 9783, 9964, 1247, 3445, 9514, 6651, 9011, 5205, 7234, 9763, 6253, 3671, 203, 1706, 3954, 7487, 9122, 1862, 7469};
        int[] sales = new int[]{21, 7, 10, 15, 24, 30, 5, 10, 16, 18, 25, 21, 15, 26, 22, 6, 5, 23, 10, 5, 26, 29, 9, 13, 24, 1, 4, 1, 28, 8, 25, 5, 14, 6, 8, 7, 5, 14, 30, 19};
        assertEquals(29376, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test54() {
        int[] daysAvailable = new int[]{7440, 9649, 7841, 658, 2330, 2989, 8428, 7641, 4927, 5648, 9021, 999, 8179, 8163, 736, 9956};
        int[] sales = new int[]{28, 2, 15, 9, 9, 26, 13, 16, 20, 15, 6, 18, 27, 27, 2, 30};
        assertEquals(20012, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test55() {
        int[] daysAvailable = new int[]{8692, 944, 2151, 7553, 9818, 6075, 9091, 9200, 153, 3168, 7773, 1094, 6547, 5427, 9731, 7704, 6469, 1731, 2601, 7431, 3432, 6434, 8984, 2006, 1761, 9421, 2246};
        int[] sales = new int[]{29, 15, 28, 27, 13, 10, 13, 25, 14, 9, 23, 30, 22, 18, 17, 25, 4, 19, 5, 11, 8, 21, 21, 20, 10, 19, 4};
        assertEquals(11964, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test56() {
        int[] daysAvailable = new int[]{7251, 1119, 0, 8451, 558, 2109, 9035, 7845, 6374, 5543, 1409, 496, 4484, 73, 8174, 871, 1547, 3387, 6364, 2316, 19};
        int[] sales = new int[]{20, 22, 0, 18, 20, 15, 22, 25, 23, 8, 14, 11, 21, 19, 19, 22, 3, 24, 29, 27, 20};
        assertEquals(6813, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test57() {
        int[] daysAvailable = new int[]{4305, 4889, 7777, 4787, 7907, 9651, 2037, 5564, 1186, 6406, 972, 5816, 0, 1072, 7766, 4100, 5432, 8584, 4561, 5171, 4327, 2510, 7438, 6434, 9452, 1754, 1606, 2866, 9801, 4758, 2748, 4993, 9957, 1799, 3218, 2166, 8090, 3602, 5236};
        int[] sales = new int[]{3, 26, 14, 10, 13, 19, 13, 30, 4, 30, 14, 2, 0, 23, 26, 2, 18, 28, 19, 9, 22, 7, 20, 6, 5, 16, 16, 9, 13, 2, 17, 17, 20, 26, 26, 29, 21, 17, 30};
        assertEquals(16552, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test58() {
        int[] daysAvailable = new int[]{1954, 2395, 5072, 3982, 3797, 5516, 1201, 6996, 6555, 9693, 4218, 605, 0, 4427, 2490, 1552, 5100, 3556, 3347, 6014, 3337, 4617, 5950, 4830, 1179, 7873, 3602, 2110, 791, 7523, 0, 6950, 1884, 3027, 4721, 7285, 158, 1095, 5201, 6778, 6492, 5695};
        int[] sales = new int[]{9, 1, 18, 30, 22, 24, 21, 5, 15, 13, 15, 29, 0, 5, 26, 21, 24, 5, 23, 17, 9, 3, 17, 15, 21, 5, 10, 20, 3, 18, 0, 12, 11, 23, 17, 1, 11, 3, 10, 25, 30, 4};
        assertEquals(19098, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test59() {
        int[] daysAvailable = new int[]{1784, 2966, 3235, 6738, 4779, 7713, 9145, 2130, 6241, 615, 5173, 8881, 2032, 7229, 3319, 7580, 8954, 8744, 8429, 2820, 5121, 250, 1963, 847, 0, 9927, 9169, 7689, 5252, 7229, 4951, 6264, 2449, 4061, 9464, 3375, 2840, 7814};
        int[] sales = new int[]{19, 4, 27, 17, 9, 6, 3, 23, 17, 25, 3, 5, 27, 3, 5, 7, 2, 19, 9, 30, 11, 17, 14, 24, 0, 25, 12, 12, 6, 6, 20, 10, 28, 22, 8, 10, 6, 22};
        assertEquals(23055, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test60() {
        int[] daysAvailable = new int[]{1139, 2560, 1677, 6420, 9085, 3006};
        int[] sales = new int[]{15, 13, 4, 30, 27, 3};
        assertEquals(11223, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test61() {
        int[] daysAvailable = new int[]{9332, 3545, 3296, 1928, 7564, 8201, 7192, 8994, 9843, 5251, 8718, 9591, 8875, 6907, 4020, 7320, 3783, 9654, 4614, 8567, 2211, 8369, 6232, 1307, 347, 263, 4652, 1484, 4879, 17, 6415, 0, 5213, 2073, 3382, 5239, 5990};
        int[] sales = new int[]{3, 11, 28, 6, 23, 20, 24, 8, 13, 10, 11, 28, 6, 14, 25, 22, 22, 10, 8, 6, 2, 13, 30, 23, 25, 21, 29, 22, 16, 27, 1, 0, 15, 13, 23, 25, 5};
        assertEquals(20926, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test62() {
        int[] daysAvailable = new int[]{7113, 4988, 8499, 4380, 7312, 6421, 2878};
        int[] sales = new int[]{7, 28, 2, 17, 5, 8, 5};
        assertEquals(36609, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test63() {
        int[] daysAvailable = new int[]{5806, 7433, 6707, 9021, 2202, 5578, 6596, 2690, 533, 5753, 2152, 7811, 3267, 2593, 4300, 348, 7593, 4115, 3741, 3834, 9693, 6431, 2933, 469, 9226, 571, 3442, 8506, 1076, 0};
        int[] sales = new int[]{22, 15, 2, 28, 27, 21, 25, 16, 27, 9, 18, 12, 5, 10, 27, 7, 17, 16, 23, 21, 18, 15, 4, 13, 1, 21, 23, 15, 28, 0};
        assertEquals(21269, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test64() {
        int[] daysAvailable = new int[]{5533, 5906, 3941, 8776, 2797, 6502, 8654, 7075, 6422, 2367, 9180, 2812, 1995, 9524, 0, 9890, 3080, 6070, 6417, 9122, 3924, 5326, 728, 9144, 3546, 8316, 1481, 3951, 981, 3198, 8523, 6541, 6998, 7729, 4263, 5819, 7764, 6532, 3241, 396, 5227};
        int[] sales = new int[]{14, 2, 2, 13, 8, 16, 26, 2, 3, 1, 29, 22, 6, 30, 0, 24, 3, 20, 19, 2, 11, 2, 15, 22, 22, 9, 1, 10, 6, 16, 10, 26, 5, 22, 21, 22, 21, 4, 8, 7, 17};
        assertEquals(26825, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test65() {
        int[] daysAvailable = new int[]{6374, 8535, 671, 4908, 3858, 1349, 4723, 4636, 5296, 9863};
        int[] sales = new int[]{5, 28, 21, 22, 19, 17, 24, 4, 4, 11};
        assertEquals(17081, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test66() {
        int[] daysAvailable = new int[]{1776, 1645, 7204, 137, 2427};
        int[] sales = new int[]{12, 23, 7, 30, 2};
        assertEquals(14801, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test67() {
        int[] daysAvailable = new int[]{3438, 4264, 1501, 6868, 4858, 3866, 8276, 1304, 2151, 5967, 8204, 9510, 3530, 4296, 8589, 8693, 8930, 6621, 1158, 9672, 0, 5126, 1752, 3268, 2807, 8825, 4459, 2118, 8041};
        int[] sales = new int[]{28, 16, 23, 8, 12, 1, 4, 3, 6, 16, 15, 25, 15, 16, 23, 15, 30, 25, 13, 11, 0, 18, 5, 30, 11, 8, 26, 21, 20};
        assertEquals(16619, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test68() {
        int[] daysAvailable = new int[]{2202, 5807, 5087, 538, 2403, 8583, 2114, 8262, 2068, 144, 8296, 8461, 4074, 167, 3493, 9501, 7528, 7614, 371, 8488, 9455, 9779, 2741, 8527, 4221, 3298};
        int[] sales = new int[]{20, 20, 10, 12, 30, 27, 23, 17, 24, 22, 9, 9, 7, 28, 22, 11, 16, 20, 28, 14, 3, 22, 11, 20, 6, 16};
        assertEquals(14016, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test69() {
        int[] daysAvailable = new int[]{5656, 8826, 6450, 9144, 1457, 6290, 3310, 1131, 9080, 6294, 2925, 6424, 6272, 7169};
        int[] sales = new int[]{13, 22, 10, 3, 9, 8, 20, 9, 24, 5, 5, 1, 7, 9};
        assertEquals(34516, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test70() {
        int[] daysAvailable = new int[]{7096, 9508, 3783, 7192, 2192, 5052, 3997, 2971, 5192, 0, 250, 3967, 9645, 2886, 1578, 3093, 9935, 221, 5606, 8884, 305, 2982, 5771, 5001, 9155, 6545, 9458, 9303, 1570, 7714, 7911, 4910, 4513, 5062, 8468, 8813, 3045, 2856, 322, 4837, 7141, 9776};
        int[] sales = new int[]{10, 7, 9, 8, 7, 24, 6, 14, 3, 0, 5, 28, 20, 10, 28, 10, 9, 6, 20, 20, 18, 21, 3, 26, 26, 24, 19, 18, 27, 2, 8, 11, 11, 26, 16, 20, 17, 30, 13, 12, 16, 9};
        assertEquals(16674, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test71() {
        int[] daysAvailable = new int[]{5184, 412, 776, 681, 6237};
        int[] sales = new int[]{19, 22, 12, 7, 28};
        assertEquals(4058, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test72() {
        int[] daysAvailable = new int[]{7164, 2070, 3372, 5516, 816, 1560, 4307, 1569, 711, 5353, 8484, 1388, 6402, 5071, 5360, 3607, 8499, 256, 9491, 1859, 5953, 2071, 8323, 9951, 6978, 4739, 3088, 1252, 8082, 4088, 6079, 1706, 898, 293, 5338, 1202, 1153, 9731, 3480, 5838, 1367, 1980};
        int[] sales = new int[]{19, 4, 28, 18, 14, 1, 9, 9, 19, 17, 14, 8, 11, 18, 12, 19, 10, 5, 30, 6, 19, 19, 6, 20, 16, 15, 17, 28, 3, 8, 7, 2, 3, 8, 18, 23, 17, 6, 3, 17, 29, 1};
        assertEquals(15621, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test73() {
        int[] daysAvailable = new int[]{3601, 1938, 1318, 7268, 2232, 4940, 7159, 4702, 4476, 4028, 3691, 3811, 7555, 2529, 0, 3129, 3710, 4699, 8163, 5993, 7315, 9058, 9759, 5837, 2562, 8791, 1555, 4755, 2911, 7036, 4330, 4180, 2307, 9300, 5812, 239, 8977, 6281, 4025, 4363, 4469, 909, 7715, 2997, 3672, 3054, 5057, 7461, 6072};
        int[] sales = new int[]{1, 4, 24, 9, 13, 25, 24, 26, 11, 6, 18, 28, 12, 29, 0, 4, 28, 18, 10, 20, 30, 8, 23, 3, 12, 3, 20, 26, 11, 26, 6, 2, 14, 11, 4, 14, 29, 25, 13, 8, 30, 19, 23, 2, 3, 25, 17, 23, 29};
        assertEquals(18017, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test74() {
        int[] daysAvailable = new int[]{8544, 6897, 3293, 2253, 5304, 3578, 7870, 7673, 2942, 1470, 7359, 2898, 2697, 437, 2647, 1575, 1036, 5788, 7862, 5490, 6152, 2934, 938, 1689, 2133, 4606, 1403, 4415, 6525, 5316, 914, 6824, 3651, 8320, 2723, 0, 712, 1007, 27, 4536, 4939, 8340};
        int[] sales = new int[]{4, 28, 20, 18, 10, 28, 26, 23, 1, 20, 11, 29, 21, 4, 17, 15, 18, 13, 19, 22, 8, 5, 21, 21, 2, 2, 3, 2, 8, 13, 28, 9, 1, 14, 11, 0, 5, 21, 10, 30, 26, 23};
        assertEquals(17815, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test75() {
        int[] daysAvailable = new int[]{9289, 400, 0, 223, 9175, 1565, 5799, 3053, 980, 7153, 7712, 6652, 6904, 568};
        int[] sales = new int[]{9, 18, 0, 19, 28, 4, 19, 20, 9, 15, 15, 19, 1, 24};
        assertEquals(24509, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test76() {
        int[] daysAvailable = new int[]{4089, 6807, 982, 8927, 5039, 7404, 3985, 297, 5758, 4771, 4093, 5989, 7427, 7910, 4345, 3738, 3592, 965, 0, 8023, 9022, 4333, 8017, 7533, 4383, 4802, 5776, 9331, 3636, 8492, 5891, 7308, 3719, 8132, 2455, 4633, 9284, 4166, 6213, 3241, 5845, 6774, 5095, 4848, 545, 5288};
        int[] sales = new int[]{1, 16, 4, 19, 25, 3, 11, 5, 13, 30, 6, 9, 23, 30, 24, 7, 6, 30, 0, 27, 6, 14, 29, 7, 16, 15, 27, 2, 1, 2, 26, 3, 16, 2, 6, 21, 13, 22, 2, 9, 18, 14, 19, 7, 8, 13};
        assertEquals(28818, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test77() {
        int[] daysAvailable = new int[]{0, 3132, 0, 868, 9698, 2131, 2398, 3694, 4440, 7603, 951, 6140};
        int[] sales = new int[]{0, 28, 0, 12, 4, 15, 24, 23, 21, 15, 27, 28};
        assertEquals(11953, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test78() {
        int[] daysAvailable = new int[]{6958, 8638, 9187, 5275, 1964, 3683, 9738, 7000, 8582, 7767, 5995, 6583, 7280, 5683, 8432, 9623, 9425, 1171, 7657, 4345, 5125, 4587, 8466, 3088, 9000, 9048, 8259, 5969, 3757, 668, 7075, 2922, 2014, 7423, 4186, 3154, 5186, 9617};
        int[] sales = new int[]{8, 3, 19, 17, 16, 7, 14, 28, 5, 23, 28, 22, 3, 8, 13, 6, 18, 30, 23, 25, 10, 18, 5, 5, 3, 25, 11, 12, 4, 7, 28, 30, 22, 18, 24, 24, 15, 16};
        assertEquals(20521, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test79() {
        int[] daysAvailable = new int[]{6511, 6964, 374};
        int[] sales = new int[]{26, 10, 18};
        assertEquals(9677, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test80() {
        int[] daysAvailable = new int[]{6338, 3528, 8488, 3319, 5380, 6285, 9676, 3391, 7933, 7003, 7784, 8944, 899, 0, 9904, 3959, 3986, 2460, 6530, 177, 7920, 2191, 1951, 7971, 8063, 375, 6495, 1688, 4548, 5350, 5391, 3367, 9008, 9000, 5937, 3005, 8426, 278, 4629, 4433, 3412, 7111, 0, 2187, 2329, 3092, 6219, 811};
        int[] sales = new int[]{5, 27, 18, 14, 25, 16, 25, 15, 11, 27, 30, 2, 19, 0, 29, 26, 29, 23, 30, 20, 18, 12, 30, 26, 1, 25, 4, 1, 2, 22, 5, 24, 28, 1, 22, 25, 16, 13, 10, 13, 25, 29, 0, 20, 11, 10, 23, 9};
        assertEquals(25180, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test81() {
        int[] daysAvailable = new int[]{2503, 7474, 5245, 6454, 7707, 8030, 487, 5938, 532, 8407, 9715};
        int[] sales = new int[]{14, 28, 25, 5, 19, 23, 5, 4, 21, 23, 8};
        assertEquals(16059, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test82() {
        int[] daysAvailable = new int[]{1855};
        int[] sales = new int[]{8};
        assertEquals(6957, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test83() {
        int[] daysAvailable = new int[]{5219, 2217, 8815, 9408, 8738, 5189, 1056, 5650, 9792, 1765, 1829, 6760, 2669, 9731, 1191, 3443, 6511, 9622, 9550, 6560, 9392, 1443};
        int[] sales = new int[]{30, 16, 6, 22, 28, 5, 20, 11, 12, 14, 26, 15, 24, 19, 17, 10, 23, 5, 2, 9, 18, 24};
        assertEquals(20346, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test84() {
        int[] daysAvailable = new int[]{6911, 5986, 4783, 5395, 9089, 2667, 5971, 2838, 8604, 2880, 7440, 8776, 4227, 4619, 8458, 2312, 6343, 1463, 3167, 817, 8668, 1158, 8469, 7076, 6704, 1838, 3514, 826, 1371, 4168, 5664, 1000, 2117, 3394, 5765, 9534, 0, 5004, 9302, 6365, 2805, 7228, 7565, 8038, 0, 6930};
        int[] sales = new int[]{9, 9, 17, 23, 29, 6, 12, 25, 12, 29, 16, 29, 27, 24, 27, 10, 29, 4, 12, 11, 13, 27, 16, 10, 22, 16, 14, 25, 16, 29, 27, 28, 19, 25, 29, 2, 0, 30, 28, 20, 17, 12, 26, 18, 0, 2};
        assertEquals(14212, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test85() {
        int[] daysAvailable = new int[]{2048, 6519, 6229, 2027, 4756, 5249, 9788, 1147, 86, 1629, 0, 7822, 2373, 0};
        int[] sales = new int[]{6, 4, 15, 5, 26, 3, 21, 6, 9, 3, 0, 8, 4, 0};
        assertEquals(18763, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test86() {
        int[] daysAvailable = new int[]{5649, 7970, 631, 4875, 8785, 1222, 8170, 4931, 7875, 0, 9889, 2797, 1254, 5123, 4988, 7624, 1674, 3846};
        int[] sales = new int[]{11, 28, 21, 23, 19, 22, 16, 22, 22, 0, 14, 3, 1, 7, 13, 22, 2, 28};
        assertEquals(14083, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test87() {
        int[] daysAvailable = new int[]{9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999, 9999};
        int[] sales = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        assertEquals(99990, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test88() {
        int[] daysAvailable = new int[]{8843, 5373, 6946, 1975};
        int[] sales = new int[]{26, 29, 22, 27};
        assertEquals(6858, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test89() {
        int[] daysAvailable = new int[]{1, 1, 3};
        int[] sales = new int[]{28, 29, 27};
        assertEquals(2, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test90() {
        int[] daysAvailable = new int[]{75, 120, 0, 93};
        int[] sales = new int[]{24, 30, 0, 30};
        assertEquals(103, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test91() {
        int[] daysAvailable = new int[]{0, 0};
        int[] sales = new int[]{10, 10};
        assertEquals(0, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test92() {
        int[] daysAvailable = new int[]{5, 0};
        int[] sales = new int[]{2, 0};
        assertEquals(75, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test93() {
        int[] daysAvailable = new int[]{5};
        int[] sales = new int[]{15};
        assertEquals(10, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test94() {
        int[] daysAvailable = new int[]{8773};
        int[] sales = new int[]{16};
        assertEquals(16450, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test95() {
        int[] daysAvailable = new int[]{1115, 7264, 3206, 6868, 7301};
        int[] sales = new int[]{1, 3, 9, 4, 18};
        assertEquals(36091, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test96() {
        int[] daysAvailable = new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] sales = new int[]{30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30, 30};
        assertEquals(10, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test97() {
        int[] daysAvailable = new int[]{100, 200, 121};
        int[] sales = new int[]{1, 30, 2};
        assertEquals(1672, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test98() {
        int[] daysAvailable = new int[]{75, 120, 0, 93};
        int[] sales = new int[]{24, 30, 2, 30};
        assertEquals(77, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test99() {
        int[] daysAvailable = new int[]{10, 0};
        int[] sales = new int[]{30, 30};
        assertEquals(5, new Inventory().monthlyOrder(daysAvailable, sales));
    }

    @Test
    public void test100() {
        int[] daysAvailable = new int[]{0};
        int[] sales = new int[]{1};
        assertEquals(0, new Inventory().monthlyOrder(daysAvailable, sales));
    }

}
