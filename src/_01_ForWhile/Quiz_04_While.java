package _01_ForWhile;

import java.util.Scanner;

public class Quiz_04_While {
    public static void main(String[] args) {
        //Kullanıcının gireceği 20 sayıdan 10 ile 30 arasındakilerinin toplamını bulunuz.

        Scanner read = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter<20) {
        System.out.println("Enter Number");
        int enterNum = read.nextInt();
        counter++;
            if (enterNum>10 && enterNum <30){
                sum = sum + enterNum;
            }

        }

        System.out.println("10 ile 30 arasindaki numaralarin toplami = " + sum);
    }
}
