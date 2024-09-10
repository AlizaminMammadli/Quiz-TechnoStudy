package _05_Mapler;

import java.util.HashMap;
import java.util.Map;

public class _01_Soru {
    public static void main(String[] args) {

        /*
        1-  map1() isminde bir method oluşturun.

        Parametresi   bir Integer -String map  ve bir int

        return tipi String

        Tamsayı değerlerini (int) döndürün.
         */

        HashMap<Integer , String> animals = new HashMap<>();

        animals.put(1,"Lion");
        animals.put(2,"Tiger");
        animals.put(3,"Elephant");
        animals.put(4,"Cat");
        animals.put(5,"Dog");

       int key = 3;

        String result = map1(animals,key);
        System.out.println(result);

    }

    public static String map1(Map<Integer,String> map, int k){
        for (Map.Entry<Integer,String> entry : map.entrySet()){
            if (entry.getKey() == k){
                return entry.getValue();
            }
        }
        return null;
    }
}
