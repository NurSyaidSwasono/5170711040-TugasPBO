package tugaspbofix;

import java.util.Scanner;

public class TugasPBOfix {

    public static void main(String[] args) {
        Manusiaa sifat = new Manusiaa();
        Rajin baik = new Rajin();
        Malas tidak = new Malas();
        System.out.println("============KARAKTER MANUSIA RAJIN============");
        sifat.Kemauan();
        baik.Usaha();
        baik.Kondisi();
        baik.CiriCiri();
        System.out.println(" ");
        System.out.println("============KARAKTER MANUSIA MALAS============");
        sifat.Kemauan();
        tidak.Usaha();
        tidak.Kondisi();
        tidak.CiriCiri();

    }

}
