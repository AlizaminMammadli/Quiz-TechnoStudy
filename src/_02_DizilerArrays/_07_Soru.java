package _02_DizilerArrays;

public class _07_Soru {
    public static void main(String[] args) {

        //int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        //
        //Array'in ortalamasını alınız.

        int[] numbers = {12, 14 , 21 ,23 , 10 ,4};
        int sum = 0;
        for (int num : numbers){
            sum += num;
        }

        double aveNumbers = sum / numbers.length;

        System.out.println("aveNumbers = " + aveNumbers);
    }
}
