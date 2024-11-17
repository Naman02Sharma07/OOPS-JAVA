package practice.Object_oriented_programming.properties.polymorphism;

public class square extends shapes{
    @Override
    void area(){
        System.out.println("the area is side * side");
    }
}
/**all the methods that i above used here ot in other methods they all are override the reason is
 * the same method i have created in its parent class hence it is overrid
 *
 * if someone wanna know the method is override or not then in that what he has to do is to just write the @override
 * just as above if the line show any error then that means that function is not being overriden else that means the function is
 * overriden**/


/**common question that come in the form of an mcq so the question is like this
 *
 * parent obj  = new child()
 * //this above thing is called the upcasting
 * now the question that comes is which method should we call and why
 * the answer is simple
 *     the method that has gonna be call just depend on the constructor that we call that means in this case we call
 *     the constructor of the chilc
 *
 *     the other answer why basically when we call a something like i already explain in the inheritance that the method that are going
 *     to be used are completly be dependent on the type of class the object going to refers to the so if the method that we want to call then
 *     weoulf also be depends on the class **/


/**some important key points
 * static method cannot be overriden the reason is simple they are independent of object and classes
 * if we declare two static function with same name in the parent and child class
 * then that means the function that we are going to call will always be the one that we declared in the parent class
 * **/