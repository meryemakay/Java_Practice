package PRACTICE;

import java.util.Scanner;

public class forLoop4 {
    public static void main(String[] args) {
        // Soru 4)
        // Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un
        //  kati olan sayilari yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("100 den kucuk bır sayı gırınız");
        int sayı = scan.nextInt();

        for (int i=0; i<sayı; i+=3) {
            System.out.println(i +"");
        }
    }
}