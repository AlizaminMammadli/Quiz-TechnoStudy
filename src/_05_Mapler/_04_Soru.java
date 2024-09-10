package _05_Mapler;

import java.util.HashMap;

public class _04_Soru {
    public static void main(String[] args) {
        /*
        smi update() olan bir method oluşturun.

        Parametreleri , Integer -String HashMap,  int ve String olmalı. (3ayrı parametre)

        return tipi  Integer - String HashMap

        Eğer HashMap, int olan parametreyi içeriyorsa,

        int değerinde var olan String'i güncelleyin.

        **Örnek :**

         Hash map:

        1, "New jersey"

        2, "New York"

        **3, "London"**

        4, "Paris"

        i**nt = 3**

        **String = Miami**

        **cevap aşağıdaki gibi olmalı:**

        1, "New jersey"

        2, "New York"

        **3, "Miami"**

        4, "Paris"
         */

        HashMap<Integer,String> mapC = new HashMap<>();
        mapC.put(1, "New Jersey");
        mapC.put(2, "New York");
        mapC.put(3, "London");
        mapC.put(4, "Paris");

        int newKey = 3;
        String newValue = "Miami";

        System.out.println(smiUpdate(mapC,newKey,newValue));


    }

    public static HashMap<Integer,String> smiUpdate (HashMap<Integer,String> hashMap, int k, String v){
        if (hashMap.containsKey(k)){
            hashMap.put(k,v);
        }
        return hashMap;
    }
}
