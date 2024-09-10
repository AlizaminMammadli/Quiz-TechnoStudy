package _03_Metods;

public class _09_Soru {
    public static void main(String[] args) {

        /*
        **isUnique** adında bir method oluşturun.

        Parametre olarak int array alır.

         ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).

        örneğin, list isminde bir array'imiz varsa,

        ```
        int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        ```

        Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.

        ```
        int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
        ```

        Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.
         */
        int[] list1 = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
        int[] list2 = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};

        isUnique(list1);
        isUnique(list2);

    }

    public static void isUnique (int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");

    }
}
