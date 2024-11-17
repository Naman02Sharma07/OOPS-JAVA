package practice.Object_oriented_programming.properties.inheritance;

public class Box_weight extends Box{//here extends keyword means that this class is the child class box class
    double weight;

    public Box_weight(){
        this.weight = -1;
    }

    public Box_weight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public Box_weight(Box_weight other){
        super(other);//here this other is refers to the box type
        this.weight = -1;
    }

    public Box_weight(double l, double h, double w, double w1) {//so here it take the arguments from the parent class
        super(l, h, w);



        //it set the value from the parent class and these value get initialise at the parent class
        //"super" is basically used o initialise the value from the parent class i.e. calling the parent class constructor
        this.weight = w1;
    }
}
