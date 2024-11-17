package practice.Object_oriented_programming.static_exmple;

public class human {
    int age;
    String name;
    int salary;
    boolean married;

//    long population;//write not this is the property of an instance

    static long population;//now as i add static here that mean this property is not independ of any object that's why now i am able to increment
    //it and the value for the both the object get increase because by using the static the variable become independent of the object system

    public human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        human.population += 1;//this will always give me the one becoz here it is different for each one\

        /** so what really happening is here is that here it check is the population is the property of the class and it check and say yes
         * now what happen is this as this is something that is the property of the class so it would be common for all the
         * objects so if i increase it by one then that means this change then gonna be show to all the objects so first the
         * change would take place then the sout would be print **/

    }
}

/**Static is used when we have something that does not depend on the class like population that would remain universal for all
 * if there would anu new object we create then population should increase by one**/


/**when a static member is created it can be accessed before any of the object of the class be created and without referencing to that object**/

/**why main is defined as static?
 *
 * so see that the first thing that runs in the java program is the main so now see if main is not there then you
 * have to create an object of the top most class but without having the main function your java object won't able to run
 *
 * the first thing inside the java code that would run is the main function if main won't be ther then nothing would happen**/