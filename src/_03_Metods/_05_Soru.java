package _03_Metods;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {

        /*
        EvenOddNums isminde bir method oluşturun.

        Bu yöntem String olan bir parametreyi kabul etsin.

        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.

        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.

        toplam sonucu yazdırın.

        **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**

        For example Örnek:

        String =  "6678421312"

        6+6-7+8+4+2-1-3-1+2

        sonuç 16 olmalı
         */
        Scanner read = new Scanner(System.in);

        String sayilar = read.next();

        EvenOddNums(sayilar);
    }

    public static void EvenOddNums (String nums){
        int toplam = 0 ;

        for (int i = 0; i < nums.length(); i++) {
            char charNum = nums.charAt(i);
            int numbers = charNum - '0';

            if (numbers%2==0){
                toplam +=numbers;
            }
            else {
                toplam-=numbers;
            }

        }

        System.out.println("toplam = " + toplam);

    }
}
