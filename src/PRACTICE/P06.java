package PRACTICE;

public class P06 {

    public static void main(String[] args) {

        //String metodlarını kullanarak " Java ogrenmek123 Cok guzel@" Stringinin
        // "Java ogrenmek cok guzel" skline getirin

        String str1  = "Java ogrenmek123 Cok guzel@" ;
        System.out.println("Cümlenin ilk hali : "+ str1);
        str1 = str1.replace("123" , "").replace("@" , "");
        System.out.println("Cümlenin son hali : " + str1);
    }

    }

