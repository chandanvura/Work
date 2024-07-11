package Explict_unboxing;

public class Demo {
    public static void main(String[] args) {

        char c = 'a';
        Character  c1 = new Character(c);
        char c2 = c1.charValue();
        System.out.println(c2);
    }
}
