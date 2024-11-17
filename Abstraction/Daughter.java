package practice.Object_oriented_programming.Abstraction;

public class Daughter extends parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void careers() {
        System.out.println("I am going to be a princess");
    }

    @Override
    void partner() {
        System.out.println("I love shinchan");
    }

//    parent mom = new parent();//this line will give me an error that meansyou can create an abject of an abstract class
}
