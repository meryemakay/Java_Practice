package PRACTICE;

public class P04_StringManipulation {
    public static void main(String[] args) {

       //Equal yazdırın

        String str1="Java";
        String str2=new String("java"); //str1 ve str2 aref lerı farklı hem de degerler farklı bırı j dıgerı J
       //10.satır
//str1.tolower desek bıle atama olmadıgı ıcın kalıcı olmaz saddece po satır ıcın gecerlı olır
        //kalıcı olmasını ıstersek srt1=str1.tolower demek lzm

        //strng de == kullnmamamyı tercıh ederız  == ısretı ıkı tarafın esıt olup omamamdıgını verırı
        //str de equals kullanıırz bu sadece strnglerın ıcerıgıne bakar
        //== heme ıcerıgıe hem ref e bakar
        // içerık aynı olsa bıle ref farklı ıse false doner

        if (str2.equals(str1.toLowerCase())){ // sadece ıcerık karsılastırır o uuzden true dondurur equal yazdırır
            System.out.println("Equal");
        }

    }
}
