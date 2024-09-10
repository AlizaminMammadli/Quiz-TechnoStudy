package _01_ForWhile;

import java.util.Scanner;

public class Quiz_03_For {
    public static void main(String[] args) {

        //  Kullanıcnın gireceği bir sayıya kadar olan sayıların toplamını bulunuz.
        Scanner read = new Scanner(System.in);

        int numForSum ;
        int sum = 0;
        System.out.println("Enter Number");
        int enterNum = read.nextInt();

        for (numForSum=0 ; numForSum<=enterNum; numForSum++){
            sum = sum + numForSum;
            numForSum++;
        }

        System.out.println("Girilen rakama kadar olan toplam = " + sum);
    }
}
