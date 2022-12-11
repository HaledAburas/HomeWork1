package Homework;

public class Person {
    public    String id;
    public int birth;
    public String address;

    public Person(String id, int birth, String address) {
        this.id = id;
        this.birth = birth;
        this.address = address;
    }

    public void sayHello()
    {
        System.out.println("Hello "+id);

    }

    public void HowOldAmI()
    {
        System.out.println("You are "+(2022-this.birth)+" years old");
    }
   public void printAdress()
    {
        System.out.println("your adress is  "+this.address);
    }
    @Override
    public String toString()
    {
        return "hello "+id+","+
                " you are "+(2022-this.birth)+","+
                " years old \n your address "+address;
    }

}

