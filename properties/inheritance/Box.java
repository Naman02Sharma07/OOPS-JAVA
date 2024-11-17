package practice.Object_oriented_programming.properties.inheritance;

public class Box {
//    private double l;
    double l;
    double h;
    double w;
//below are all the constructors and the methods
    public Box(double l, double h, double w) {
//        super();
        /**let understand the use case for the super class
         * so super class is used to call the constructor of the parent class that i right above one
         * in the above case for the Box class the parent constructor is the object class
         * so basically all the class that we have benn created are always been derived from the object class
         *
         *
         * the other use case of the super is that it is used as a this keyword but it will point to the variable or
         * i would say the properties of the parent class
         *
         *
         * now the question arise then what is the difference between the this and the super if by both we can use the preperties
         * the answer is simple lets say i have wight in the box as a property and with the same name i have a property in the child class
         * now i am going to use sout and print the super.weight then this line will give me the value that is stored in the parent not the
         * one that has been stored in the child class **/
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    public Box(){
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information(){
        System.out.println("this is the box");
    }



}

/****/
