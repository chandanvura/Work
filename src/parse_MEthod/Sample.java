package parse_MEthod;

public class Sample {
    public static void main(String[] args) {
        String s ="123";

        int num = Integer.parseInt(s);
        int temp = num;
        int sum =0;
        while(temp!=0){
            int ld = temp %10;
            sum +=ld;
            temp /=10;

        }
        System.out.println(sum);
    }
}
