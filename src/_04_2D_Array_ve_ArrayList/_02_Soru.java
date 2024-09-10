package _04_2D_Array_ve_ArrayList;

public class _02_Soru {
    public static void main(String[] args) {
        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]

        2D array'de olan elemanları toplayınız.

        toplamı yazdırınız.

        Sonuç 32 olmalıdır.
         */

        int [][] arr2D = {
                {5,2,1},
                {10,2,3,6},
                {1,2}
        };

        int sum = 0 ;
        for (int i = 0; i <arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                sum += arr2D[i][j];
            }

        }
        System.out.println("sum = " + sum);
    }
}
