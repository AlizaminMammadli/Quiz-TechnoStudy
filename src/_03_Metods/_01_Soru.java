package _03_Metods;

public class _01_Soru {
    public static void main(String[] args) {
        /*
        Ismi **randomNum** olan bir method oluşturun.

        Parametre olarak **int max** almalı.

        Bu method, 0 ile max arasında random bir değer döndürmelidir.

        Random numarayı döndürünüz.

         */

        int max = 10;
        randomNum(max);
    }
    public static void randomNum (int max){

        max =(int) (Math.random()*max)+1 ;
        System.out.println("Random number is : " + max);
    }
}
