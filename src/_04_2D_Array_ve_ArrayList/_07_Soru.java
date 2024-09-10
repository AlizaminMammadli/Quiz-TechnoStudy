package _04_2D_Array_ve_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_Soru {
    public static void main(String[] args) {
        /*
        getLength() isminde bir method oluşturun.

        Parametre olarak String ArrayList

        Return tipi Integer ArrayList

        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;

        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"

        Tüm Stringlerin uzunluklarını yazdırın;

        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
         */
        ArrayList<String> listStr = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston" ));

        getLength(listStr);

    }

    public static void getLength (ArrayList<String> arrayList ){
        ArrayList<Integer> arrIntList = new ArrayList<>();

        for (String element : arrayList){
            arrIntList.add(element.length());
        }
        System.out.println("Length List  = " + arrIntList);
    }
}
