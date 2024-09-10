package _02_DizilerArrays;

public class _06_Soru {
    public static void main(String[] args) {

        // String Array (Dizi) oluşturunuz.
        //
        // elemanları : Apple, Orange , Babana, Kiwi
        //
        //Array'leri tüm elemanları yazdırınız.


        String[] fruits = {"Apple", "Orange", "Babana", "Kiwi"};

        int ordNum = 1;

        for (String fruit : fruits)
            System.out.println("fruit "+ ordNum++ + " = " + fruit);
    }
}
