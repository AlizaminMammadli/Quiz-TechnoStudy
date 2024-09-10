package _02_DizilerArrays;

import java.util.Arrays;

public class _10_Soru {
    public static void main(String[] args) {

        // int Array oluşturun ve elemanları : 12,2,5,15,8
        //
        //En büyük değeri yazdırınız.

        int[] numbers = { 12,2,5,15,8};
        Arrays.sort(numbers);
        System.out.println(" Max number is : " + numbers[numbers.length - 1]);
    }
}
