package PRACTICE;

import java.util.Scanner;

public class foorLoopsoru10 {

    public static void main(String[] args) {

        //Soru 10 )
        //Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
        //toplayip, sonucu yazdiran bir program yaziniz

        int sayi1=1;
        int sayi2=10;

        for (int i = sayi1; i <=(sayi2) ; i=1) {
            if (i>=sayi1 && i<(sayi2)){
                System.out.print(i+" + ");
            }else if (i==sayi2) {
                System.out.print(sayi2 + " = "+(((sayi2*(sayi2+1))/2)));
            }
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        int sayi3 = scanner.nextInt();
        int sayi4 = scanner.nextInt();
        int toplam = 0;
        if (sayi1 < sayi2) {
            for (int i = sayi1; i <= sayi2; i++) {
                toplam += i;
            }
            System.out.println(toplam);
        }else if(sayi1>sayi2){
            for (int i = sayi2; i <=sayi1; i++) {
                toplam +=i;
            }
            System.out.println(toplam);
        }else{
            System.out.println( "sayi1 + "+" sayi2 : "+ (sayi1+sayi2)+ " girilen sayılar esittir");
        }




    }
}
