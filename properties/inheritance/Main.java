package practice.Object_oriented_programming.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();//here i am creating a new object
//        System.out.println(box.l+"-> length, "+box.h+"->height, "+box.w+"->wdth ");

//        Box_weight b1 = new Box_weight(1,2,3,4);
//        System.out.println(b1.l+"-> length, "+b1.h+"->height, "+b1.w+"->wdth "+b1.weight+" ->weight ");


//        Box b2 = new Box_weight(1,2,3,4);
//        System.out.println("box-weight "+b2.weight);
        /**for this you must understand that it is basically the type of refernce variable not the object that determined what are the
         * properties to be accessed **/

//        Box_weight b3 = new Box(1,2,3,4);
//        System.out.println(b3);
        /** here it giveing me an error because
         * there are variable in bothe parent and the child class
         * you are given access to  th variables that are in the ref i.e boxweight
         * hence you can access to the weight variable
         * that means the one we are trying to access should be initialised
         * but here when the object it itself of parent class then how will you call the varibale that you have
         * defined in the parent class because the parent class don't have an idea
         * about that there is any weight variable or not **/


        BoxPrice box = new BoxPrice(2,3,4);

    }
}


/**is my "l" is private double then what would happen is i wont able to access it be the chils class because it is private it can
 * be access only in the class where it has been declared **/