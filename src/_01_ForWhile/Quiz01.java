package _01_ForWhile;

import java.util.Scanner;

public class Quiz01 {
    public static void main(String[] args) {

        // Kullanıcının gireceği 20 sayıdan tek olanlarının toplamını bulunuz

        /*
        1. Kullanici girecegi deger
        2. nece defe giris edeceyini saymaq
        3. girilen deyer tek mi cut mu
        4. tek olanlarin cemini hesablamaq
        5. ekrana bu deyeri yazdir

         */

        Scanner read = new Scanner(System.in);

        int counter = 0 ;
        int sum = 0 ;

        while (counter<20){
            System.out.println("Enter numbers");
            int num = read.nextInt();
            counter++;
            if (num%2==1){
                sum = sum +num;
            }
        }

        System.out.println("Toplam deger " + sum);






    }
}
