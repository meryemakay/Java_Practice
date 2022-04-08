package PRACTICE;

import java.util.Scanner;

public class methodCreationsoru1 {
    public static void main(String[] args) {

     /*   Soru 1 )
        Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
        kucuk mu oldugunu, ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki
        rakamlarin toplamini,100’den kucukse sadece 1’ler basamagini yazdiran 3 method
        olusturun.
                */

        // 1.method tek mi cift mi methodu

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir sayi girin : ");
        int sayi1=scan.nextInt();

        tekMiCiftmi(sayi1);

        sifirdanBuyukMu(sayi1);

        yuzdenBuyukKucuk(sayi1);


    }

    private static void yuzdenBuyukKucuk(int sayi1) {
        int birlerBasamagi = 0;
        if (sayi1 > 100) {
            birlerBasamagi = sayi1 % 10;
            int onlarBasamagi = (sayi1 / 10) % 10;
            int yuzlerBasamagi = (sayi1 / 100) % 10;
            System.out.println("Sayi 100den fazla oldugu icin onlar basamagi, yuzler basamagi " +
                    "ve yuzler basamagi toplami: " + (birlerBasamagi + onlarBasamagi + yuzlerBasamagi));
        } else
            System.out.println("Sayi 100'den kucuk oldugu icin onlar basamagi degeri : " + birlerBasamagi);
    }

    private static void sifirdanBuyukMu(int sayi1) {
        if (sayi1>0){
            System.out.println("Bu bir pozitif sayi");
        }else if(sayi1<0){
            System.out.println("Bu bir negatif sayidir.");
        }else
            System.out.println("Girdiginiz sayi ne negatif ne pozitiftir.");
    }

    private static void tekMiCiftmi(int sayi1) {
        if (sayi1%2==0){
            System.out.println("Bu bir cift sayidir");
        }else
            System.out.println("Bu bir tek sayidir.");
    }

    }

