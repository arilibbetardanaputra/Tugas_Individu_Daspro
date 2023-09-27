import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        String usernameSistem = "pengguna";
        String passwordSistem = "12345";

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String usernameInput = input.nextLine();

        System.out.print("Masukkan Password: ");
        String passwordInput = input.nextLine();

        if (usernameInput.equals(usernameSistem) && passwordInput.equals(passwordSistem)) {
            System.out.println("Login berhasil. Selamat datang, " + usernameInput + "!");
        } else {
            System.out.println("Username dan/atau password salah. Silakan coba lagi.");
        }

        input.close();
    }
}
