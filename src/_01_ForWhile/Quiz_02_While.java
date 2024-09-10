package _01_ForWhile;

import java.util.Scanner;

public class Quiz_02_While {
    public static void main(String[] args) {
        //Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner read = new Scanner(System.in);

        int counter = 0 ;
        int counterSum = 0 ;

        while (counter<20){
            System.out.println("Enter numbers");
            int num = read.nextInt();
            counter++;
            if (num%2==1){
                counterSum++;
            }
        }

        System.out.println("Toplam tek degerler miktari = " + counterSum);
    }
}
