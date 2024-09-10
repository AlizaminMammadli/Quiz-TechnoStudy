package _02_DizilerArrays;

public class _13_Soru {
    public static void main(String[] args) {

        // Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        //
        //$ işaretlerini kaldırın ve sayıları toplayın.
        //
        //Sayıların toplamını yazdırın.

        String charNum = "$12 $23 $10 $2 $5 $2";

        String[] numbers = charNum.split(" ");
        int sum = 0;

        for (String num : numbers){
            num = num.replace("$","");
            sum += Integer.parseInt(num);
        }

        System.out.println("Toplam = " + sum);

    }
}
