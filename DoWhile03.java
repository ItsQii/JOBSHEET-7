import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int JatahCuti, JumlahHari;
         String konfirmasi;
         System.out.printf("Jatah cuti :");
         JatahCuti = sc.nextInt();

         do{
            System.out.println("apakah anda mau mengambil cuti (Yes/No):");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("Yes")){
                 System.out.print("jumlah hari : ");
                 JumlahHari = sc.nextInt();

                 if (konfirmasi.equalsIgnoreCase("No")) {
                     break;
                 }
                 if (JumlahHari <= JatahCuti){
                    JatahCuti -= JumlahHari;
                    System.out.print("sisa jatah cuti : ");

                 }else{
                    System.out.println("sisa jatah cuti anda tidak mencukupi ");
                    break;
                 }
            }
         }while (JatahCuti > 0);
    }
}