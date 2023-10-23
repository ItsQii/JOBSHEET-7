public class latihan3 {
    public static void main(String[] args) {
        int jumlahderet = 50;
        int deret = 0;
        int i = 1;

        do {
            deret = i;
            if (deret %3 != 0) {
                System.out.println(deret);                
            }
        } while (++i <= jumlahderet);
   
}
}