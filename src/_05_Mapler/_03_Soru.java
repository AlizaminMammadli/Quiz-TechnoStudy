package _05_Mapler;

import java.util.ArrayList;
import java.util.HashMap;

public class _03_Soru {
    public static void main(String[] args) {

        /*
        ismi **returnValue()** olan bir method oluşturun.

        Parametresi    **String-Integer HashMap**

        Return tipi ArrayList

        Bir Hashmap oluşturun ve değerleri Integer ve String'lerden oluşmalı.

          Map

        "Lion",         1

        "Tiger",        2

        "Elephant",  3

        "Cat",          4

        "Dog",         5

        Tüm **_DEĞERLERİ_** (values) **for döngüsü** ile döndürün.
         */
        HashMap<String,Integer> animals = new HashMap<>();

        animals.put("Lion",1);
        animals.put("Tiger",2);
        animals.put("Elephant",3);
        animals.put("Cat",4);
        animals.put("Dog",5);

        System.out.println(returnValue(animals));



    }

    public static ArrayList<Integer> returnValue (HashMap<String,Integer> hashValue){
        ArrayList<Integer> arrayValue = new ArrayList<>();

        for (Integer value : hashValue.values()){
            arrayValue.add(value);
        }
        return arrayValue;
    }
}
