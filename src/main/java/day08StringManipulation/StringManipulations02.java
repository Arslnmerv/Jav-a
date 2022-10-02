package day08StringManipulation;

public class StringManipulations02 {
    public static void main(String[] args) {

        //Example 1 : Bir Stringdeki space haric kac tane character kullandildigini gosteren kodu yaziniz
        //              "Ali okula gitti." --> 14

        String str = "Ali okula gitti.";
        str.replace(" " , "");
        System.out.println(str.replace(" " , "").length());
    }
}
