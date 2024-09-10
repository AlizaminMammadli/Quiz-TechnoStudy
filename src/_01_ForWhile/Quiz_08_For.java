package _01_ForWhile;

public class Quiz_08_For {
    public static void main(String[] args) {
        //0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        int num ;

        for (num = 0 ; num <=100 ; num ++){
            if (num%2==1){
                System.out.println(num);
            }
        }
    }
}
