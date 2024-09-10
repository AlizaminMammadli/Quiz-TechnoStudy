package _04_2D_Array_ve_ArrayList;

public class _03_Soru {
    public static void main(String[] args) {
        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.

        [{"new jersey","atlanta","ohio"} ,

        {"Pittsburgh" ,"ohio","new york","ohio"} ,

        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.

        Array'i yazdırınız.
         */

        String[][] arr2D = {
                {"new jersey","atlanta","ohio"},
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}
        };

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length ; j++) {
                if (arr2D[i][j].toLowerCase().equals("ohio")){
                    arr2D[i][j] = "Florida";
                }
            }
        }

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length ; j++) {
                System.out.print(arr2D[i][j] + " , ");
            }
            System.out.println();
        }


    }
}
