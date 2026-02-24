package com.kietcbt.core.core;


//day la thu vien toan hoc, mo phong giong thu vien chuan Math cua JDK
//cac thu vien mang tinh chat tien ich, do dung xai dung chung cho cac noi
public class MathUtility {


    //ham tinh giai thua n! =1.2.3.4.5......n
    //ko co giai thua am
    //20! vua du kieu long - 18 con so 0, 21! kieu long chua ko noi
    //0!=1
    public static long getFactorial(int n){

        long result;
       if(n < 0 || n >20) {
           throw new IllegalArgumentException("n must be between 0 and 20");
       }
        if(n == 0)
            return 1;

        result = 1; //update src
        for(int i = 1; i<= n; i++)
            result = result*i;
        return result;
    }
}
