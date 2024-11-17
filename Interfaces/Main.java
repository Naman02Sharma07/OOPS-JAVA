package practice.Object_oriented_programming.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
        Engine car = new Car();
//        car.a = 100;//this will not work
        /**the reason is simple what things would be acess is depends on the datatype and the things that wea re going to store would
         * be depends on the car object so in engine there is nothing like a variable a so you can access a but you cannot store anything in it **/
        car.acc();
//        car.brake();
        car.start();//now there are two function with same in two different classes
        car.stop();


        System.out.println();
        System.out.println();

        Media car1 = new Car();//in this line th output that i get as print statement would be nothing but the same of above that is of engine
        /**the reason is simple is that if i want the thing to be different lets according to another interface then for that i
         * have to create a another class that implements that **/

        /*so for such thing i have create a new class that is car media you can see in the package*/
        car1.start();
    }
}
/**so if there are two interfaces in which the methoda name are common then everytime you have to run other
 * methods you have recreate a new class
 *
 * let's say i have 2-3 interfaces that have common methods
 * then i have to create new class so that you can access those different methods indidually**/