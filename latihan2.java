import java.util.Scanner;
public class latihan2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahderet = 26 , deret, i=0;
        deret = 0;

        while (i<jumlahderet){

            deret = deret +i;

            System.out.println("hasil deret angka " + i + " = " + deret);
            i++;
        }
        sc.close();
    }
}