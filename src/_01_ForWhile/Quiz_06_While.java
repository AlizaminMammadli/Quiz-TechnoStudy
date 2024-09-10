package _01_ForWhile;

import java.util.Scanner;

public class Quiz_06_While {
    public static void main(String[] args) {
        //Bir sayı bulmaca oyunu yapılmak isteniyor
        //   bilgisayar 10-20 arasında bir sayı tutsun, kullanıcı bu sayıyı bulmaya çalışssın,

        Scanner read = new Scanner(System.in);

        int randomNum = (int)(Math.random()*10);
        int randomNums = randomNum +11;

        while (randomNums>9){
            System.out.println("Sayi gir bakalim bulacak misin");
            int userNums = read.nextInt();
            if (userNums == randomNums){
                System.out.println("Buldunuz, Tebrikler");
                break;
            }
            System.out.println("Bulamazssin kiiiiii (-_+) ");
        }



    }
}
