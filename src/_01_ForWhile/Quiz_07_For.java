package _01_ForWhile;

public class Quiz_07_For {
    public static void main(String[] args) {

        // 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir.

        int num ;

        for (num = 0 ; num <=100 ; num ++){
            if (num%2==0){
                System.out.println(num);
            }
        }

    }
}
