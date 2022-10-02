package day09StringManipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy";
        String str1 = "Kara kara dusunme Ankara";

        //indexOf() methodu verilen karakter veya karakterlerin "ilk gorunumunun" indeexini verir.
        int idxA1 = str.indexOf("a");
        int idxA3 = str1.indexOf("kara");
        System.out.println(idxA1);  //1
        System.out.println(idxA3);  //5

        //lastIndexOf() methodu verilen karakter veya karakterkerin "son gorunumunun" indexini verir
        int idxA2 = str.lastIndexOf("a");
        int idxA4 = str1.lastIndexOf("kara");
        System.out.println(idxA2); //9
        System.out.println(idxA4); //20

        String s = "Mississippi";
        int idxI = s.indexOf('i'); //indexOf() hem String hem de char ile kullanilabilir
        System.out.println(idxI); //1

        int idxIss1 = s.indexOf("iss");// Ilk gorunumun "ilk" karakterinin indexini verir
        int idxIss2 = s.lastIndexOf("iss");//Son gorunumun "ilk" karakterinin indexini verir

        System.out.println(idxIss1);
        System.out.println(idxIss2);


        //Example 1 : Bir String'deki karakterin tekrarli veya tekrarli olup olmadigini gosteren kodu yaziniz
        //                          "Helloooo  --> H,e--> tekrarsiz l,o--> tekrarli

        String t = "Helloooo";
        char c = 'H';

        if (t.indexOf(c) == t.lastIndexOf(c)) {
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }

        //Ternary ile
        String s1 = t.indexOf(c) == t.lastIndexOf(c) ? "Tekrarsiz" : "Tekrarli";
        System.out.println(s1);

        String u = "learn java earn money";

        //indexOf() iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar karakteri gectikten sonra istenen karakterin
        //ilk gorunumunun indexini return eder.
        int sonuc = u.indexOf("a", 6);
        System.out.println(sonuc); //7

        int son = u.lastIndexOf("a", 10);
        System.out.println(son); //2

        //Buna bakilacak

        String v = " ";

        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);
        //isEmpty() methodu bir String'in bos olup olmadigini kontrol eder
        // Verilen String'de hic karakter yoksa "true" doner,
        // bir tane bile karakter olsa -bu karakter space dahi olsa- false doner.
        // lenght() ==0 demek isEmpty() true verir demektir.

        String x = " ";

        //isBlank() hem "bos String" hem de "sadece space" iceren Stringler icin true return eder.
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        //Example 2 : Kullanicidan alinan isim mutlaka spaceden farkli en az bir karakter icermelidir

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");
        }else {
            System.out.println(ilk);
        }
    }
}
