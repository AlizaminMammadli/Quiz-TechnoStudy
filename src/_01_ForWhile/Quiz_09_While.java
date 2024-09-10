package _01_ForWhile;

public class Quiz_09_While {
    public static void main(String[] args) {
        //100'den 0'a kadar bütün tek sayıları yazdırınız.

        int num = 100 ;

        while (num >= 0){
            if (num%2==1){
                System.out.println(num);
            }
            num--;
        }
    }
}
