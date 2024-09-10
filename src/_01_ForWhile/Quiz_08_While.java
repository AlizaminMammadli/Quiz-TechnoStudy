package _01_ForWhile;

public class Quiz_08_While {
    public static void main(String[] args) {
        //0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.
        int num = 0 ;

        while (num <= 100){
            if (num%2==1){
                System.out.println(num);
            }
            num++;
        }
    }
}
