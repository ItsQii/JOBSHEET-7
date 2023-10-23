import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {

        String nama;
        String kelamin;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i<=30; i++) {
            System.out.println("Masukkan nama siswa :");
            nama = sc.nextLine();
            System.out.println("Masukkan jenis kelamin siswa :");
            kelamin = sc.nextLine();
            if (kelamin.equalsIgnoreCase("perempuan")) {
            System.out.println("Nama anda : " + nama + " berjenis kelamin : " + kelamin);
        }
       
        }
       sc.close();
    }
}