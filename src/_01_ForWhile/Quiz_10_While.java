package _01_ForWhile;

public class Quiz_10_While {
    public static void main(String[] args) {
        //  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.

        int sum = 0 ;
        int i = 1;

        while (i <=10) {
            sum = sum + i;
            i ++;
        }

        System.out.println("Dogal sayi toplami = " + sum);
    }
}
