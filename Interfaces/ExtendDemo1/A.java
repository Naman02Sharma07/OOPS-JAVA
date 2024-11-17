package practice.Object_oriented_programming.Interfaces.ExtendDemo1;

public interface A {
    //static methof should always have a bodu the reason is they can be inhert=ited so they always have the bodu
    static void greet(){
        System.out.println("Hey ia m greet");
    }
    default void fun(){
        System.out.println("I am in A");
    }
    /**the primary reason why we use default is that when we have to pass something new method accross all out classes we use default
     * with breaking the code **/

}
