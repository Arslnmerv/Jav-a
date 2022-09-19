package day01variables;

public class Variables01 {

    // Variable nasil olusturulur?

/*
    1.) Access Modifier
    2.)Data Type
    3.)Variable ismi
    4.) =
    5.)Deger
    6.);
 */

    // Java'da ";" ingilizcedeki "." gibidir. Ingilizcede "cumle" deriz, javada "statement" deriz.
    // "=" --> Assigment (Atama) Operaror sagdaki degeri alir soldaki variable'in icine koyar.

    public int age = 13;

    public int height = 183;

    // Java'da Data Type'lar
        /*
          1.) int: Integer'in kisaltmasi. Integer tam sayi demektir. 32 bit kullanir.
               Matematik'te tam sayilarin basi ve sonu yoktur fakat Java'da tam sayilarin basi ve sonu vardir.
               En kucuk int = -2,147,483,648
               En buyuk int = 2,147,483,647

        2.) byte: Tam sayilar icin kullanilir. 8 bit kullanir.
              En kucuk byte = -128
              En buyuk byte = 127

         3.) short : Tam sayilar icin.. 16 bit kullanir.
              En kucuk short = -32768
              En buyuk short = 32767

         4.) long : Tam sayilar icin.. 64 bit kullanir.
             En kucuk long = -9,223,372,036,854,755,808
             En buyuk long = 9,223,372,036,854,755,807

        5.) float : Ondalikli sayilar icindir. 32 bit kullanir.
             "float" virgulden sonra 7 karakter icerebilir.
             "float" degerlerinde sona "f" veya "F" koymak gerekir.

        6.) double : Ondalikli sayilar icindir. 64 bit kullanir.
              "double" virgulden sonra 16 basamak icerebilir.

         7.) boolean : true veya false degerleri icin kullanilir. 1 bit kullanir.

         8.) char = Tek karakterler icin kullanilir.
            A, c, 2, ?, _, =
            Note: "char" lara deger verirken degeri " ' "arasina konulmalidir.

            Note : java buyuk ve kucuk harflere duyarlidir. java icin true ile TRUE  farklidir.

              Note: Numeric Data Types: byte < short < int < long < float < double
                        Numeric Olmayan Data Types: boolean - char

                                            Non-Primitive Data Types
      String: Isim, adres, kimlik numarasi gibi bir veya birden fazla karakter iceren degerlerde kullanilir.
              String degerleri mutlaka cift tirnak arasina konulmalidir.
              String non-primitive dir. Yani bir String olusturdugunuzda Java size bir suru method verir.

              Primitive ile Non-Primitive lerin farki nedir?
  */

    public byte price = 12;

    public short populationOfVillage = 23000;

    public float priceOfShirt = 13.99f;

    public double weightOfCell = 0.0000012045;

    // "Long" denilmesine ragmen Java verilen sayiyi int kabul eder.
    // Bu yuzden "long" variable'a int araliginin disinda bir sayi verilirse "l "ya da "L" konulmalidir.
    public long populationOfWorld = 7000000000L;

    //Burada "L" konulmadigi halde problem yok cunku 1234 "int" araligina dahildir.
    public long x = 1234;

    public boolean isOld = true;

    public char initial = 'M';

    public String name = "Tom hanks";

    //Note: Main method arabanin motoru gibidir.
    public static void main(String[] args) {

    }

}
