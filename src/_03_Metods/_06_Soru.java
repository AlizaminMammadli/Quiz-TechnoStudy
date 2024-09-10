package _03_Metods;

public class _06_Soru {

    public static void main(String[] args) {

        // Girilen bir diziyi tersten yazdıran bir metod yazınız.

        int[] dizi1 = {1,2,3,4,5,6,7,8,9};
        tersten(dizi1);

    }

    public static void tersten (int[] dizi){
        for (int i = dizi.length-1; i >=0 ; i--) {
            System.out.print(dizi[i] + " ");
        }

    }
}
