package _02_DizilerArrays;

import java.util.Arrays;

public class _12_Soru {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //
        //En küçük (minimum) sayıyı yazdırınız.

        int[] numbers = { 14 , 19 , 5 , 21};
        Arrays.sort(numbers);
        System.out.println(" Min number is : " + numbers[0]);

    }
}
