package practice.Object_oriented_programming.Interfaces;

public class CarMedia implements Media{
    @Override
    public void start() {
        System.out.println("this is for the media starting purpose");
    }

    @Override
    public void stop() {
        System.out.println("this is for the stoping the media ");
    }
}
