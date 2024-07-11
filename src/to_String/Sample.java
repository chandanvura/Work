package to_String;

public class Sample {

    int id ;
    String name;
    int sal;
    String loc;

    public  Sample(int id, String name , int sal , String loc){
        this.id=id;
        this.loc=loc;
        this.sal=sal;
        this.name=name;
    }
    public void Display(){
        System.out.println("Employeee id" +id);
        System.out.println("Employeee name " + name);
        System.out.println("Employeee sal" + sal);
        System.out.println("Employeee loc" +loc);


    }

   // @Override
    public String tostring(){

        return  name ;
    }

    public static void main(String[] args) {
        Sample s = new Sample(1,"Rocket", 10000,"Banglore");
        String res = s.tostring();
        System.out.println(res);
    }

}
