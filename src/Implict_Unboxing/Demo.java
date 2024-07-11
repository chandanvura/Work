package Implict_Unboxing;

public class Demo {
    public static void main(String[] args) {

//        int x =90;
//        Integer x1 = x;
//        int x2 = x1;
//        System.out.println(x2);

//        long l =10;
//        Long l1 = new Long(l);
//        long l2 = l1;
//        System.out.println(l2);

        double d =10.0;
        Double d1 = d;
        double d2 = d1.doubleValue();
        System.out.println(d2);

    }
}
