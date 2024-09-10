package _01_ForWhile;

public class Quiz_05_While {
    public static void main(String[] args) {
        //100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.

        int num = 1 ;
        int counter = 0 ;

        while (num <100){
            if (num % 10 == 5){
                counter ++ ;
            }
            num ++ ;
        }
        System.out.println("counter = " + counter);
    }
}
