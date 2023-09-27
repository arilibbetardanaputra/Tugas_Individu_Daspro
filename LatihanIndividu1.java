import java.util.Scanner;

public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jarak pertarungan (meter): ");
        double jarak = input.nextDouble();

        if (jarak < 5) {
            System.out.println("Gunakan Melee Weapon untuk pertarungan jarak dekat.");
        } else {
            System.out.println("Gunakan Ranged Weapon untuk pertarungan jarak jauh.");
        }

        input.close();
    }
}
