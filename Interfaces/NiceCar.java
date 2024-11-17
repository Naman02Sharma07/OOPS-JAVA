package practice.Object_oriented_programming.Interfaces;

public class NiceCar {
    private Engine engine;

    public NiceCar(){
        engine = new Powerengine();
    }
    public NiceCar(Engine engine){//now this is the way by which i can create my own custor engine
        this.engine = engine;
    }
}
