package _03_Metods;

public class _03_Soru {
    public static void main(String[] args) {
        /*
    reverseString isminde bir method oluşturun.

    Bu method bir String'i parametre olarak alsın.

    Ve bu method, girilen String'i tersten yazsın.

    Terste yazılmış halini yazdırınız.

    Örn: String = "Java'yı Seviyorum."

    Print: .muroyiveS ıy'avaJ
    */

        String ornekCumle = "Javayi sevenler klubu";
        reverseString(ornekCumle);


    }
    public static void reverseString (String cumle){
        String tersten = "";
        for (int i = cumle.length()-1; i >=0 ; i--) {
            tersten += cumle.charAt(i);
        }
        System.out.println("tersten = " + tersten);
    }
}
