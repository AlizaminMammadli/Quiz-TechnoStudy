package _03_Metods;

public class _04_Soru {
    public static void main(String[] args) {

        /*
         adı  reverseWord olan bir method oluşturun

        Bu methodun String olarak bir parametresi olmalıdır




        Ve bu cümledeki kelimelerle tersine çevirmeli

        Ters halini yazdırın.

        Örnek 1 :

        Dize: Java yazın

        dönüş şöyle olmalıdır:  yazın Java
         */

        String cumle = "Javayi sevenler klubu";
        reverseWord(cumle);

    }

    public static void reverseWord(String word){
        String[] words = word.split(" ");
        String reverse = "";

        for (int i = words.length-1; i >=0 ; i--) {
            reverse += " " + words[i];
        }
        System.out.println("reverse Cumle = " + reverse.trim());
    }
}
