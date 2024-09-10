package _02_DizilerArrays;

public class _08_Soru {
    public static void main(String[] args) {

        // int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //
        //Eğer sayı çiftse topla, tekse çıkar.
        //
        //**Örneğin:**
        //
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //
        //Toplamlarını yazdırın.


        int[] numbers = {5,6,8,12,14,19};

        int evenOrOdd = 0;

        for (int num : numbers){
            if (num %2 ==0){
                evenOrOdd+=num;
            }
            else {
                evenOrOdd-=num;
            }
        }

        System.out.println(" result is : " + evenOrOdd);




    }
}
