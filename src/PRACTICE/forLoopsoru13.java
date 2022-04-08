package PRACTICE;

import java.util.Scanner;

public class forLoopsoru13 {
    public static void main(String[] args) {
        // Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore carpim
        //tablosu olusturun. Ornek,kullanici 3 girerse,
        //  1 2 3
        //  2 4 6
        //  3 6 9

        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }
}
