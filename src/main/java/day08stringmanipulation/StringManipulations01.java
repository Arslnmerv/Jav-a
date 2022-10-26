package day08stringmanipulation;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        //Example 1: Kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz
        //                  Ramazan --> Rn

        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz");
//        String isim = input.next();
//
//        //1.Way
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length() - 1); // Yazdiginiz code saddece bazi durumlar icin calisirsa o code'a "Hard Coding" denir.
//                                                                                        // yazdiginiz code her durum icin calsiirsa o koda "Dynamic Coding" denir
//
//        System.out.println(  ilkHarf + "" + sonHarf  );
//        //System.out.println( "" +  ilkHarf  + sonHarf  );
//
//        //2.Way
//        System.out.println(isim.substring(0, 1) + isim.substring(isim.length()-1));
//
//        /**
//         * contains()
//         * Metin icerisinde arama yapmamizi saglar.
//         * bir stringin içerisinde karakter(ler)in var olup olmadığını kontrol eder.
//         * Sonuc boolean dir.
//         *
//         /** substring()
//         * Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
//         */
//
//        //Example 2 : Verilen String'deki tum hayvan isimlerini ekrana yazdiriniz
//        //                    "Ben kedi esim tavuk oglum inek sever."
//
//        String str = "Ben kedi, esim tavuk, oglum sever inek";
//        System.out.println(str.substring(4, 8) + str.substring(14, 20) + str.substring(str.length() - 5 ));

        /* Substring()'in iki kullanimi vardir:
         1)substring(baslangic indexi, bitis indexi) String'in ortasindan bir parca almaya yarar.
         2)substring(baslangic indexi) String'in verilen indexten sonuna kadar almaya yarar. */

        //Example 3 : Ilk isim ve soyismi iceren isimlerden ilk ve soyisimlerin bas harflerini ekrana yazdiriniz
        //    Ali Can --> AC        Tahsin Yurdakul --> TY

        System.out.println("Ilk ve soy isminizi giriniz");
        String tamIsim = input.nextLine();

        String ilkharf1 = tamIsim.substring(0, 1);
//        String sonHarf1 = tamIsim.substring(tamIsim.length()-tamIsim.length()-1);
//        System.out.println(ilkharf1 + sonHarf1);

        String sonHarf1 = tamIsim.split(" ")[1].substring(0, 1);
        System.out.println(ilkharf1 + sonHarf1);
    }
}
