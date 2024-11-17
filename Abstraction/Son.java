package practice.Object_oriented_programming.Abstraction;

public class Son extends parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void careers() {
        System.out.println("I love to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love iron man");
    }
}
