package _05_Mapler;

import java.util.ArrayList;
import java.util.HashMap;

public class _02_Soru {
    public static void main(String[] args) {
        /*
        returnKey() isminde bir method oluşturun.

            Parametresi     String-Integer HashMap olsun.

            Return tipi Array List olsun.

            Hashmap:


            "Lion",     1

            "Tiger",    2

            "Elephant", 3

            "Cat",      4

            "Dog",      5


            Tüm **ANAHTARLARI(Keys)** for döngüsü ile döndürün.
         */

        HashMap<String,Integer> animalsHash = new HashMap<>();

        animalsHash.put("Lion",1);
        animalsHash.put("Tiger",2);
        animalsHash.put("Elephant",3);
        animalsHash.put("Cat",4);
        animalsHash.put("Dog",5);

        System.out.println(returnKey(animalsHash));



    }

    public static ArrayList<String> returnKey (HashMap<String,Integer> hashMap ){
        ArrayList<String> keys = new ArrayList<>();

        for (String key : hashMap.keySet() ){
            keys.add(key);
        }
        return keys;
    }
}
