package _01_ForWhile;

public class Quiz_05_For {
    public static void main(String[] args) {

        //100 kadar olan sayılardan kaç tanesinin birler basamağının 5 olduğunu bulunuz.
        int num;
        int counter = 0 ;

        for (num =1 ; num <100 ; num ++){

            if (num % 10 == 5){
                counter ++ ;
            }
            num ++ ;
        }

        System.out.println("counter = " + counter);
    }
}
