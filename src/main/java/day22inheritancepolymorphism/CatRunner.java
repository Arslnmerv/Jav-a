package day22inheritancepolymorphism;

public class CatRunner {

    /*
    1)java'da object olustururken constructorlar  parenttan childa dogru calistirilir.
    2)java en ust parent constructora cikabilmek icin "super()" kodunu kullanir
    3)"super()" kodu her constructorun ilk satirinda gizli olarak bulunur
    4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, java kizmaz
    5)"super()" kodunu gorunur sekilde yazarsaniz sakin haa ilk satir disinda bir satira koymayiniz, hata verir
    6)"super()" kodu parent classta constructor cagirmaya yarar.

     */

    public static void main(String[] args) {

        Cat cat1 = new Cat(); //Animal
                                             //Mammal
                                             //Cat

    }
}
