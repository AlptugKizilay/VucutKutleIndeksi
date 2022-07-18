import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m, kg;
        double vki;

        Scanner inp = new Scanner(System.in);

        System.out.print("Boy(m): ");
        m = inp.nextDouble();
        System.out.print("Kilo(kg): ");
        kg  = inp.nextDouble();
        vki = (kg) / (m * m);

        System.out.println("Vucut Kitle Endeksi: "+ vki);
    }
}