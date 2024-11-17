package practice.Object_oriented_programming.properties.inheritance;

public class BoxPrice extends Box_weight{
    double cost;

    BoxPrice(){
        super();
        this.cost =-1;
    }
    BoxPrice(BoxPrice other){
        super(other);//here this other refers to the copy class that is right now the parent
        this.cost = other.cost;
    }

    public BoxPrice(double l, double h, double w, double w1, double cost) {
        super(l, h, w, w1);
        this.cost = cost;
    }

    public BoxPrice(double side, double weight, double cost) {
        super(side, weight);
        this.cost = cost;
    }
}
