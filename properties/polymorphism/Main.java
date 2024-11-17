package practice.Object_oriented_programming.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle c1 = new circle();
        square s1 = new square();
        triangle t1 = new triangle();

        shape.area();

    }
}

/**here we see that there is area method is same for all tha class then this termed as the polymorphism where the definition is same but the
 * defination of the method is different for other classes **/

//polymorphism is basically of 2 type
//static -> this is what we just do that is method or i would say the constructor overloading

//dynamic -> mehod overiiding that is same method but different result for each base class

