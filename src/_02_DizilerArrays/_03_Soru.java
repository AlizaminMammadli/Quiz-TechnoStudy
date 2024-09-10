package _02_DizilerArrays;

public class _03_Soru {
    public static void main(String[] args) {
        //İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //
        //Array in elemanlarının toplamını yazdır.
        //
        //Cevap 220 olmalı.

        int[] numbers = {25,30,30,35,100};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Toplam " + sum);


    }
}
