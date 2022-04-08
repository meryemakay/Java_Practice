package PRACTICE;

import java.util.Scanner;

public class P09 {
    public static void main(String[] args) {
        //Kullanıcıdan isim ve soyisim isteyin ve hangisinin
        // daha uzun oldugunu yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen isminizi giriniz : ");
        String name = scan.next();

        System.out.print("Lütfen soyisminizi giriniz : ");
        String surname = scan.next();

        System.out.println((name.length()>surname.length() ? "isminiz daha uzun" : "Soyisminiz daha uzun"));
    }
}
