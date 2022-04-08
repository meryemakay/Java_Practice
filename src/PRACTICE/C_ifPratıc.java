package PRACTICE;

import java.util.Scanner;

public class C_ifPratıc {
    public static void main(String[] args) {
        //kullanıcı adı gırısı

        String sys_kul_adı="tecproedu";
        String parola="12345";

        Scanner scan=new Scanner(System.in);
        System.out.println("kullanıcı adı gırınız");
        String kullanıcı_adı=scan.nextLine();

        System.out.println("parola gıtınız");
        String kullanıcı_parola=scan.nextLine();

        if (!(sys_kul_adı.equals(kullanıcı_adı))  && !(parola.equals(kullanıcı_parola))) {

            System.out.println("kullanıcı adı ve parola yanlıs");
      }else if ((sys_kul_adı.equals(kullanıcı_adı)) && !(parola.equals(kullanıcı_parola))) {

            System.out.println("kullanıcı adı dogru parola yanlıs");

        }else if (!(sys_kul_adı.equals(kullanıcı_adı))  && (parola.equals(kullanıcı_parola))){

            System.out.println("kullanıcı adı yanlıs parola dogru");

        }else {
            System.out.println("gırıs basarılı");
        }
    }
}