package _03_Metods;

public class _02_Soru {
    public static void main(String[] args) {
        /*
        "OrtaKelime" isminden bir method oluşturun.

        Bu method String'i parametre olarak almalı.

        Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.

        Ortadaki kelimeyi return yapınız.

        Örnek: Ben Java'yı seviyorum.

        print : Java'yı

        Örnek2:

        Java'yı kolayca öğreniyorum.

        print: kolayca
         */

        String cumle1 = "Hatasiz kod olmaz";
        ortaKelime(cumle1);

    }

    public static void ortaKelime (String cumle){

        String[] kelimeler = cumle.split(" ");

        int kelimeSay = kelimeler.length;
        int ortaIndex = kelimeSay/2;

        System.out.println("Orta kelime  = " + kelimeler[ortaIndex]);

    }
}
