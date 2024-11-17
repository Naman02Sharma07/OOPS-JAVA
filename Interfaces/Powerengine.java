package practice.Object_oriented_programming.Interfaces;

public class Powerengine implements Engine{

    @Override
    public void start() {
        System.out.println("this is an power engine");
    }

    @Override
    public void stop() {
        System.out.println("this is the brake of power engine");
    }

    @Override
    public void acc() {
        System.out.println("this is the acceleration of power engine ");
    }
}
