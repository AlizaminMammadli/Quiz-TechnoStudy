package _01_ForWhile;

import java.util.Scanner;

public class Quiz_04_For {
    public static void main(String[] args) {

        //Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.
        Scanner read = new Scanner(System.in);

        int counter ;
        int sum = 0;

        for (counter=0 ; counter <5; counter ++){
            System.out.println("Enter Number");
            int enterNum = read.nextInt();
            if (enterNum>10 && enterNum <30){
                sum = sum + enterNum;
            }
        }

        System.out.println("10 ile 30 arasindaki numaralarin toplami = " + sum);
    }
}
