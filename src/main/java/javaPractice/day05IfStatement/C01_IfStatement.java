package javaPractice.day05IfStatement;

import java.util.Scanner;

public class C01_IfStatement {

    /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
        double sayi1 = input.nextDouble(), sayi2 = input.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println(sayi1 + sayi2);
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println(sayi1 * sayi2);
        } else if (sayi1 * sayi2 < 0) {
            System.out.println("farkli isaretlerde sayi giremezsin");
        } else if (sayi1 * sayi2 == 0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }

    }


}
