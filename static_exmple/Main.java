package practice.Object_oriented_programming.static_exmple;

public class Main {
    public static void main(String[] args) {
        human naman = new human(22,"Naman Sharma",10000,false);
        human rahul = new human(32,"rohan raaj",10300,true);

        //the below one print the one because here population is assign to individual object instead of universal
        //bu when i write i the orignal code that +1 to the class then what happen is
        //the whole population get increase by one
        System.out.println(naman.population);
        System.out.println(rahul.population);


        /**below i get an error because "this" is used to represent an object and static is object independent so there would be no cjance of using ehis here
         * **/
//        System.out.println(this.name);

        greeting();//now here i would get an error the reason is inside the static you are not allowed to put the non static function

        //so the thing a static method can only access the static data
    }

    /** let's understand it with this a static method can not access the non-static method that mean the method that we are going to
     * access inside the static method would be static
     *
     * the other statement that prove why it is important is as we know if something is without the static
     * then it would have to be method of an object **/



    static void greeting(){//here we use static because static method can only access the static data so it become important for us to put this
        //with the static unless it would give us an error
        System.out.println("namaste dunia ");
    }

    //so the below one is dependent on the objects and the other one is not

    //ypu cannot access non static stuff without referencing their instances in a static context
    void fun(){
        System.out.println("hello world ");
        fun2();//if i access this without the object so as this is already inside the another method it would take that as a method
    }
    void fun2(){
        System.out.println("i am having a fun");
    }


}
