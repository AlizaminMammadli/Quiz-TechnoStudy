package _01_ForWhile;

import java.util.Scanner;

public class Quiz_02_For {
    public static void main(String[] args) {
        // Kullanıcnın gireceği 20 sayıdan kaç tanesinin tek olduğunu bulunuz

        Scanner read = new Scanner(System.in);

        int counter;
        int counterSum = 0 ;

        for (counter=0 ; counter <20 ; counter++){
            System.out.println("Enter Numbers");
            int num = read.nextInt();
            if (num%2==1){
                counterSum++;
            }
        }

        System.out.println("Toplam tek degerler miktari = " + counterSum);
    }
}
