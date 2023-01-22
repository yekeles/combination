import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //C(n,r) = n! / (r! * (n-r)!) n eleman sayılı r elemanlı altküme kombinasyon formülü
        // ( n - r ) = t'dir.
        int n = 1, r = 1, t, totaln = 1, totalr = 1, totalt = 1, conbination;
        Scanner input1 = new Scanner(System.in);
        System.out.print("Kümenin eleman sayısını giriniz : ");
        n = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Kaç elemanlı altküme sayısı olacak : ");
        r = input2.nextInt();
        t = (n - r);
        if (t >= 0) {
            //n! hesaplayalım.
            for (int i = 1; i <= n; i++) {
                totaln *= i;
            }
            //r! hesaplayalım.
            for (int k = 1; k <= r; k++) {
                totalr *= k;
            }
            //( n - r ) = t! hesaplayalım.
            for (int l = 1; l <= t; l++) {
                totalt *= l;
            }
            conbination = ((totaln) / ((totalr) * (totalt)));
            System.out.println("n elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.");
            System.out.println("n’in r’li kombinasyonu C(n,r) şeklinde gösterilir.");
            System.out.print("C" + "(" + n + "," + r + ") : " + conbination);

        } else {
            System.out.print(n + " elamanlı kümenin " + r + " elemanlı alt kümesi olamaz!...");
        }
    }
}