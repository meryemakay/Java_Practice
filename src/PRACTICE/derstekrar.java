package PRACTICE;

import java.util.Scanner;

public class derstekrar {

    public static void main(String[] args) {

        //Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
        //kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //Girilen kelime cumlede kullanilmamis.
        //Girilen kelime cumlede 1 kere kullanilmis.
        //Girilen kelime cumlede 1’den fazla kullanilmis.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime= scan.next();
        if (cumle.indexOf(kelime)==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if (cumle.indexOf(kelime)>-1 && cumle.indexOf(kelime)<=0){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");
        }else{
            System.out.println("Girilen kelime cumlede 1'den fazla kullanilmis");
        }



//kullanıdan bır emaıl adreı alıp maıl @gmaıl.com ıceıyors "emaıl adreınız kaydedıldı"
        // içermıyorsa da "lutfen gmaıl maıl adresınız gırınız" yazdırın
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Lufen email adresinizi giriniz");
        String str1 = scanner.next();

        if (str1.indexOf("@gmail.com")==(-1)){
            System.out.println("Lutfen gmail adresi giriniz");

        } else if (str1.indexOf("@gmail.com")>=(-1)){
            System.out.println("Email adresiniz kaydedildi");

        } else {
            System.out.println("Lutfen kontrol ederek yazdirin");
        }
    }
}
