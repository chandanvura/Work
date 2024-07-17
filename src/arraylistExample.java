import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylistExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(67);
//        list.add(7);
//        list.add(6);
//        list.add(670);
//        list.add(607);
//        list.add(067);
//
//        System.out.println( list.contains(607));
//        list.set(0,99);
//        list.remove(2);
//
//        System.out.println(list);

            //input

        for(int i =0;i< 5;i++){
            list.add(sc.nextInt());

        }
        //get iteam at any index
        for(int i =0;i< 5;i++) {
            System.out.println(list.get(i)); //pass index here ,lis[index} syntax will not work here
        }
        System.out.println(list);
    }
}
