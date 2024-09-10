package _02_DizilerArrays;

import java.util.Arrays;

public class _09_Soru {
    public static void main(String[] args) {
        // int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int[] numbers = {15 , 25, 22, 18, 30};
        Arrays.sort(numbers);
        System.out.println(" second max number is : " + numbers[numbers.length - 2]);
    }
}
