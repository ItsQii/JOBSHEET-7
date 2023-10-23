import java.util.Scanner;

public class WhileGaji03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int JumlahKaryawan, JumlahJamLembur;
        double gajilembur = 0;
        double totalgajilembur = 0;
        String Jabatan;

        System.out.println("masukkan jumlah karyawan");
        JumlahKaryawan = input.nextInt();

        int i = 0;

        while(i < JumlahKaryawan){
            System.out.println("Pilihan jabatan = Direktur, Manajer, Karyawan");
            Jabatan = input.nextLine();
            System.out.println("masukkan jabatan karyawan ke-" + (i+1) + ":");
            Jabatan = input.nextLine();
            System.out.println("Masukkan jumlah jam lembur");
            JumlahJamLembur = input.nextInt();
            i++;

            if (Jabatan.equalsIgnoreCase("Direktur")){
                continue;
            }else if (Jabatan.equalsIgnoreCase("Manajer")){
                gajilembur = JumlahJamLembur * 100000;
            }
            else if (Jabatan.equalsIgnoreCase("Karyawan")){
                gajilembur = JumlahJamLembur * 75000;
            }
            totalgajilembur += gajilembur;
        }
        System.out.println("Total gaji lembur :" + totalgajilembur);
    }
    }