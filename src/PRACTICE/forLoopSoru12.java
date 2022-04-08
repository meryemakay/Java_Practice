package PRACTICE;

import java.util.Scanner;

public class forLoopSoru12 {


    public static void main(String[] args) {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
        //asagidaki sekli cizdirin
        // *
        // **
        // ***
        // ****

        Scanner scan = new Scanner(System.in);
        System.out.println("bir rakam giriniz");
        int sayi = scan.nextInt();

        for (int i = 0; i<=sayi;i++){
            for (int j = 0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
