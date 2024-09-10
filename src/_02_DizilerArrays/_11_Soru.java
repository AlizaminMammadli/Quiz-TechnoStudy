package _02_DizilerArrays;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        //String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //
        //Eğer aitse "true" çevirin.
        //
        //Loops (döngüler) kullanın.

        String[] fruits = {"Apple", "Orange", "Babana", "Pineapple"};

        Scanner read = new Scanner(System.in);
        String controlWord = read.nextLine();
        boolean control = false;

        for ( String fruit : fruits){
            if (fruit.equalsIgnoreCase(controlWord))
                System.out.println(true);

        }
    }
}
