package _01_ForWhile;

public class Quiz_09_For {
    public static void main(String[] args) {

        //100'den 0'a kadar bütün tek sayıları yazdırınız.
        int num ;

        for (num = 100 ; num >=0 ; num --){
            if (num%2==1){
                System.out.println(num);
            }
        }
    }
}
