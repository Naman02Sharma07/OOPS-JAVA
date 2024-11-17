package practice.Object_oriented_programming.Interfaces;

public class Car implements Brake,Engine,Media{//here we use implements instead of the extends
    int  a = 30;
//    Engine car =new Car();
    /**one important thing that i forgot and misunderstand earlier
     *    so things that i can access is depends on the datatype that is here the interface Engine
     *    and which version be used is depends on the Car() clas  thing basically overriding stuff **/
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }
}
