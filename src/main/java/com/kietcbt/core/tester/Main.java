package com.kietcbt.core.tester;

import com.kietcbt.core.core.MathUtility;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void main() {
        testGetFactorialGivenRightArg0RunsWell();
        testGetFactorialGivenRightArg1RunsWell();
        testGetFactorialGivenRightArg5RunsWell();

    }
    //TEST CASE #3:
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, .EG. N = 5
    //STEP: N = 5
    //      CALL GETF(5)
    //EXPECTED: 120 AS THE RESULT OF 5!
    //STATUS:
    public static  void testGetFactorialGivenRightArg5RunsWell() {
        int n = 5;
        long expected = 120; //0! hy vong la 1, con thuc te thi
        long actual; //gọi hàm ms biet
        actual = MathUtility.getFactorial(n);
        System.out.println(n +"! Actual: " + actual + "; Expected: " + expected);
    }
    public static  void testGetFactorialGivenRightArg0RunsWell() {
        int n = 0;
        long expected = 1; //0! hy vong la 1, con thuc te thi
        long actual; //gọi hàm ms biet
        actual = MathUtility.getFactorial(n);
        System.out.println(n +"! Actual: " + actual + " Expected: " + expected);
    }

    //TEST CASE #2:
    //DESC: CHECK GETF() WITH VALID BOUNDARY NUMBER, .EG. N = 1
    //STEP: N = 1
    //      CALL GETF(N)
    //EXPECTED: 1 AS THE RESULT OF 1!
    //STATUS:
    public static  void testGetFactorialGivenRightArg1RunsWell() {
        int n = 1;
        long expected = 1; //0! hy vong la 1, con thuc te thi
        long actual; //gọi hàm ms biet
        actual = MathUtility.getFactorial(n);
        System.out.println(n +"! Actual: " + actual + "; Expected: " + expected);
    }

    static void main(String[] args) {

        System.out.println("5! = " + MathUtility.getFactorial(5));


    }




        //TEST CASE #1 ( CÂU 2, CÂU 3)
        //ID, TEST CASE DECRIPTION / DATA / STEPS / PROCEDURE / EXPECTED RESULT ( PASSED | FAILED) / TEST DATE / TEST BY
        //ID    / DESC                  / DATA / STEPS      / EXPECTED RESULT     / STATUS   / DATE     / BY
        //TC01 / VERIFY  getFactiorial()/ n = 0 / n = 0
        //      CHECK                           call getF(0) 1 is the result of 0! chờ chạy   25/1/26    Kiet
        //      TEST
        //       with valid n


        //CACH VIET DE DOC
        //Test ID: TC01
        //DESC   : CHECK getFactorial() with a valid n (boundary value), .eg. 0,20
        //DATA   : n = 0
        //STEPS: (CAC BUOC KIEM THU - NEU TEST CHUC NANG MAN HINH GIONG USER GUIDE
        //      STEP 1: CLICK....
        //      STEP 2: INPUT)
        //      prepare n =


}
