package defaultConstructor;

public class Bike {
    int maxspeed;
    Bike(){
        maxspeed=60;


    }

    public static void main(String[] args) {
        Bike b = new Bike();
        System.out.println(b.maxspeed);

    }




}
