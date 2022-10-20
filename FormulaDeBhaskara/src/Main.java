import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();

        if ((A == 0) | (B * B - 4 * A * C < 0)) {
            System.out.println("Impossivel calcular");
            return;
        }

        double bascara = Math.sqrt((B * B) - 4 * A * C);
        double R1 = (-B + bascara) / (2 * A);
        double R2 = (-B - bascara) / (2 * A);
        System.out.println(String.format("R1 = %.5f", R1));
        System.out.println(String.format("R2 = %.5f", R2));
    }
}