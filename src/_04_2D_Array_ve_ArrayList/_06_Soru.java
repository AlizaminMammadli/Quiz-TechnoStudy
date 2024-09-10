package _04_2D_Array_ve_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_Soru {
    public static void main(String[] args) {
        /*
        getSum() isminde bir method oluşturun.

        Parametresi ArrayList olmalı

        Return tipi int olmalı.

        ArrayList teki tüm sayıları birbiri ile toplayın.

        return olarak toplam sonucu döndürün.

        Örneğin;

        Arraylist = 1,2,3,4,5

        return 15 olmalı
         */

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        getSum(intList);

    }

    public static void getSum(ArrayList<Integer> arrIntList){
        int sum = 0 ;

        for (int item : arrIntList){
            sum += item;
        }

        System.out.println("sum = " + sum);
    }
}
