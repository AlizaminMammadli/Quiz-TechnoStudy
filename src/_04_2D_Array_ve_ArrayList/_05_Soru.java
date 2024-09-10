package _04_2D_Array_ve_ArrayList;

import java.util.ArrayList;

public class _05_Soru {
    public static void main(String[] args) {
        /*
        ismi getCount() olan bir method oluşturun.

        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.



        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.


        Örneğin;

        ArrayList = Orange , Kiwi , Peach , Banana , Orange

        String Orange:

        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */
        ArrayList<String> list = new ArrayList<>();
        list.add("Orange");
        list.add("Kiwi");
        list.add("Peach");
        list.add("Banana");
        list.add("Orange");

        String searchStr = "Orange";

        getCount(list,searchStr);


    }

    public static void getCount(ArrayList<String> ArrayList, String str) {
        int count = 0 ;
        for (String element : ArrayList) {
            if (element.equals(str)){
                count++;
            }
        }
        System.out.println("count = " + count);
    }

}
