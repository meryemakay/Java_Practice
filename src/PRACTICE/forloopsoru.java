package PRACTICE;

public class forloopsoru {

    public static void main(String[] args) {
        //Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        int sayi = 5;
        int toplam = 1;
        for (int i = 5; i >= 1; i--) {
            toplam *= i;
        }
        System.out.println(toplam);


    }
}
