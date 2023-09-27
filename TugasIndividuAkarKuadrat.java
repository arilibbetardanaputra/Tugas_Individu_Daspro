import java.util.Scanner;

public class TugasIndividuAkarKuadrat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai a:");
        double a = input.nextDouble();

        System.out.println("Masukkan nilai b:");
        double b = input.nextDouble();

        System.out.println("Masukkan nilai c:");
        double c = input.nextDouble();

        double diskriminan = b * b - 4 * a * c;

        if (diskriminan > 0) {
            double akar1 = (-b + Math.sqrt(diskriminan)) / (2 * a);
            double akar2 = (-b - Math.sqrt(diskriminan)) / (2 * a);
            System.out.println("Akar real pertama: " + akar1);
            System.out.println("Akar real kedua: " + akar2);
        } else if (diskriminan == 0) {
            double akar = -b / (2 * a);
            System.out.println("Akar tunggal: " + akar);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-diskriminan) / (2 * a);
            System.out.println("X1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("X2: " + realPart + " - " + imaginaryPart + "i");
        }   
    }
}
