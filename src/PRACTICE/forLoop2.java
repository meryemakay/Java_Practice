package PRACTICE;

public class forLoop2 {
    public static void main(String[] args) {
        //10 ile 30arasındakı sayıları aralarında vırgul olark aynı satırda yazdırın

        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ",");

            } else System.out.print(i);
        }
    }
}