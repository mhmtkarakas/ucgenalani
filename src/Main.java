import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     // Degiskenleri olusturalim
        int  a,b ,c;
        double u,Alan;

        //Kullanicidan verilerimizi alalim
        Scanner veri = new Scanner(System.in);
        System.out.print("1. kenari giriniz : ");
        a = veri.nextInt();
        System.out.print("2.. kenari giriniz : ");
        b = veri.nextInt();
        System.out.print("3. kenari giriniz : ");
        c = veri.nextInt();

        u = (a+b+c)/2;
        Alan = u*(u-a)*(u-b)*(u-c);
        System.out.print("Ucgenin Alani : " + Alan*Alan);

    }
}