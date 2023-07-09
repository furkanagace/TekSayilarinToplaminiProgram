import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n;
        int toplam=0;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("bir sayı giriniz: ");
            n=inp.nextInt();

            if (n % 4==0){
                toplam+=n;
            }
        }while (n>0);

        System.out.println("toplam: "+toplam);





    }



}