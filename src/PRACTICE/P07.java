package PRACTICE;

public class P07 {
    public static void main(String[] args) {


        // String seklinde verilen asagidaki fiyatların toplamini bulunuz
        // String str1 ="$13.99"
        // String str2 = "$10.55"
        //ipucu :Double.parseDouble() metodunu kullanabilrsiniz.
        String str1 ="$13.99";
        String str2 = "$10.55";
        System.out.println("Fiyatların toplamı : $" + (Double.parseDouble(str1.replace("$" , "")) +
                Double.parseDouble(str2.replace("$" , ""))));
    }

}

