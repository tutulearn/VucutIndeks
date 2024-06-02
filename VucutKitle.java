import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy , kilo, kitleIndeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Kilonuzu(kg cinsinde) giriniz: ");
        kilo=input.nextDouble();

        kitleIndeks=kilo/boy*boy;
        System.out.print("Vücut Kitle Endeksiniz: "+kitleIndeks);
    }
}
