package _03_Metods;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        /*
        powerOfThree isminde bir method oluşturun.

        Parametre olarak int

        Return tipi boolean

        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.

        **Örnek 1:**

        ```
        **Girdi:** 27
        **Çıktı:** true
        ```

        ```
        Açıklama: 3*3*3 =27
        ```

        ```
        Sonuç= true
        */
        Scanner read = new Scanner(System.in);

        int nums = read.nextInt();

        powerOfThree(nums);


    }

    public static void powerOfThree (int num) {
        boolean dogruMu = false;
        if (num <= 2) {
            System.out.println("dogruMu = " + dogruMu);
            return;
        }
        while (num % 3==0){
            num /=3;
        }

        if (num == 1){
            System.out.println("dogruMu = " + !dogruMu);
        }
        else
            System.out.println("dogruMu = " + dogruMu);
    }
}
