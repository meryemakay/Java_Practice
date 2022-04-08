package PRACTICE;

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        // Kullanıcıdan 4 harfli bir kelime isteyin ve girilen kelimeyi tersden yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 4 harfli bir kelime girin");
        String str1 = scan.next();

        if(!(str1.length()==4)) System.out.println("Giriş hatalı");

        else System.out.println(""+str1.charAt(3)+ str1.charAt(2)+ str1.charAt(1)+ str1.charAt(0));

    }
}
