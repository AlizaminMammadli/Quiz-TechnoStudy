package _01_ForWhile;

public class Quiz_10_For {
    public static void main(String[] args) {

        //  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

        int sum = 0 ;

        for (int i = 1 ; i <=10 ; i ++){
            sum = sum + i ;
        }

        System.out.println("Dogal sayi toplami = " + sum);
    }
}
