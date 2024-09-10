package _02_DizilerArrays;

public class _02_Soru {
    public static void main(String[] args) {

        // Bir String oluşturun : "Hello World"
        //
        //Stringi tersten yazdırın ve print edin.
        //
        //_Cevap böyle olmalı :  "dlroW olleH"_

        String expample = "Hello World";

        for (int i =expample.length()-1 ; i >=0 ; i--) {
            System.out.print(expample.charAt(i));

        }
    }
}
