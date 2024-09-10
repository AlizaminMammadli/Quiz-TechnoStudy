package _03_Metods;

import java.util.Arrays;

public class _08_Soru {
    public static void main(String[] args) {
        /*
            append adında bir method oluşturun.`

            `Parametre olarak iki int array  oluşturun.`

             ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.

             Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,

            Bunu döndürmelidir:

             {2, 4, 6, 1, 2, 3, 4, 5}.
         */

        int[] dizi1 = {2,4,6};
        int[] dizi2 = {1,2,3};

        append(dizi1,dizi2);
    }

    public static void append (int[] num1 , int[] num2){

        int[] numbers = new int[num1.length+num2.length];
        for (int i = 0; i < num1.length ; i++) {
            numbers[i]=num1[i];
        }
        for (int i = 0; i < num2.length ; i++) {
            numbers[num1.length + i] = num2[i];
        }

        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}
