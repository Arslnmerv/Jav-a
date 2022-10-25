package day22inheritancepolymorphism;

public class Runner {

    public static void main(String[] args) {

        //Inheritance'da variablelar secilirken java objenin data type'ne bakar
        //Oncelikle istediginiz variable'i objenin data type'i olan classta arar
        //O classta bulamazsa parent classlara bakar
        //Hicbir parent class'ta bulamazsa hata verir

        Cat cat1 = new Cat();
        System.out.println(cat1.a); //14
        System.out.println(cat1.b); //34
        System.out.println(cat1.c); //45

        Mammal cat2 = new Cat();
        System.out.println(cat2.a); //13

        Animal cat3 = new Cat();
        System.out.println(cat3.a); //12

        //Object olustururken object'in data type'i child classlardan secilemez.

        //Inheritance'da methodlar secilirken java constructor'a bakar
        //Oncelikle istedigimiz methodu constructor'i kullanilan classtan alir.
        //O classta bulamazsa parent classlara bakar
        //Hicbir yerde o method'u bulamazsa hata verir
        Cat cat4 = new Cat();
        cat4.eat(); //Cat eat
        cat4.drink(); //Mammal drink

        Mammal cat5 = new Mammal();
        cat5.eat(); // Mammal eat

        Animal cat6 = new Animal();
        cat6.eat(); //Animal eat

    }

}
