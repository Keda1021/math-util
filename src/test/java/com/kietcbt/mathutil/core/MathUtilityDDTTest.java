package com.kietcbt.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.kietcbt.core.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {




    // hàm trả về mảng 2 chiều - mảng 2 chiều như chung cư hình chữu nhật tầng x số phòng một tầng
    //chung cư 20 x 10 nghĩa là: 20 tầng, mỗi tầng 10 phòng
    // [20][10] nghĩa là 20 dãy biến, mỗi dãy là 10 biến
    // 20 cái mảng 1 chiều, mảng 1 chiều 10 phần tử
    // mảng của các mảng khác


// chuẩn bị data đưa vào, nhồi vào hàm test - data driven
    public static Object[][] initData(){
        Object dataSet[][] = {  {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}
                            };

        return dataSet;

    }



    @ParameterizedTest
    @MethodSource("initData")
    public void testGetFactorialGivenRightArgumentRunWell(int n, long expected) {

        assertEquals(expected, getFactorial(n));
    }

}