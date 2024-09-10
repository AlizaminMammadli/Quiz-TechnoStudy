package _04_2D_Array_ve_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_Soru {
    public static void main(String[] args) {
        /*
        İsmi changelnArraylist() olan bir method oluşturun.

        Parametre olarak String ArrayList, String s1, String s2

           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList



        Örneğin;

        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"

        s1 = blue

        s2 = yellow

        Tüm blue 'ları yellow'a dönüştürün.

        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
         */
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        String s1 = "blue";

        String s2 = "yellow";

        changelnArraylist(newList,s1,s2);

    }

    public static void changelnArraylist (ArrayList<String> arrList , String s1, String s2  ){

        for (int i = 0; i <arrList.size() ; i++) {
            if (arrList.get(i).equals(s1)){
                arrList.set(i,s2);
            }
        }

        System.out.println("arrList = " + arrList);
    }
}
