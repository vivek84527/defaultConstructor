package constructer_overloading;

public class ConstructorOverloading {
    int id;
    String name,mobileNumber;

    public ConstructorOverloading(int id,String name) {
        this.id=id;
        this.name=name;
    }

    public ConstructorOverloading(int id, String name, String mobileNumber) {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
    void  display(){
        System.out.println(id+" "+name+" "+mobileNumber);
    }

    public static void main(String[] args) {
        ConstructorOverloading n1=new ConstructorOverloading(121,"vivek");
        ConstructorOverloading n2 = new ConstructorOverloading(123,"Abhishek","8126401267");
        n1.display();
        n2.display();










    }




}
