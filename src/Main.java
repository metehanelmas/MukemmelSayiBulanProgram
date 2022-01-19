import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /** Metehan Elmas **/

        Scanner input = new Scanner(System.in);
        int nSayi=1;
        int reset = 0;
        int bolenler=1;
        int total = 0;
        int i = 1;

        while (i <= nSayi) {
            System.out.print("Bir sayı giriniz : ");
            nSayi = input.nextInt();
            i++;

            for (int j = 1; j < nSayi; j++) {
                if (nSayi % j == 0) {
                    bolenler = j;
                    total += bolenler;
                }
            }
            if (bolenler == 0) {
                System.out.println("Pozitif değer giriniz !");

            } else if (total == nSayi) {
                System.out.println(nSayi + " Mükemmel Sayıdır .");

            } else {
                System.out.println(nSayi + " Mükemmel Sayı Değildir .");
            }
            total=reset;
        }
    }
}
