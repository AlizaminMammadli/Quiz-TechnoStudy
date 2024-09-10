package _02_DizilerArrays;

public class _01_Soru {
    public static void main(String[] args) {
        // Bu String'i oluşturun. "Removes white space from both ends of a string"
        //
        //String'deki kelime sayısını yazdırınız.
        //
        //

        String text = "Removes white space from both ends of a string";

        String[] words = text.split(" ");

        System.out.println("words = " + words.length);

        for (int i = 0; i < words.length; i++) {
            System.out.println("words = " + words[i]);
        }
    }
}
