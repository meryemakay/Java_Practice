package PRACTICE;

import java.util.Scanner;

public class P08 {
    public static void main(String[] args) {
        //Kullanıcıdan isim isteyin. Eger
        //-isim "a" harfi içeriyorsa "Girdiğiniz isim a harfi içeriyor"
        //-isim "Z" harfi içeriyorsa "Girdiğiniz isim Z harfi içeriyor"
        //-ikisi de yoksa "Girdiğiniz isim a veya Z harfi içermiyor" yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir isim giriniz : ");
        String str1 = scan.next();

        if (str1.contains("a")) {
            System.out.println("Girdiğiniz isim a harfi içeriyor");
        } else if (str1.contains("Z")) {
            System.out.println("Girdiğiniz isim Z harfi içeriyor");
        } else System.out.println("Girdiğiniz isim a veya Z harfi içermiyor");
    }
    }

