import java.util.Scanner;

public class SimulasiATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final String PIN_BENAR = "123456";
        int sisaPercobaan = 3;
        boolean berhasilLogin = false;

        while (sisaPercobaan > 0 && berhasilLogin == false) {
            System.out.print("Masukkan 6 Digit PIN: ");
            String pinInput = input.nextLine();

            if (pinInput.equals(PIN_BENAR)) {
                berhasilLogin = true;
                System.out.println("Login Berhasil!");
            } else {
                sisaPercobaan--;
                if (sisaPercobaan > 0) {
                    System.out.println("PIN Salah! Sisa percobaan : " + sisaPercobaan);
                } else {
                    System.out.println("Akun telah terblokir!");
                }
            }
        }

        input.close();
    }
}