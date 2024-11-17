package practice.Object_oriented_programming.Abstraction;

abstract public class parent {
    int age;

    public parent(int age) {
        this.age = age;
    }

    abstract void careers();
    //this is an abstract method
    abstract void partner();


    //    abstract parent();
    /**you wont be able to create a abstarct constructor **/

}
//if there is anyone function in the class is abstract then that mean the class is an abstract class

/**Basically abstracting a class means that you have create some properties and now these properties have been inherited by your child class
 * to use it according ti his need that mean basically
 *
 *     I provide a template of method
 *     then the child class would use that template in his own way
 *     using the inheritance and the compile time polymorphism
 *     **/


/**Few important things you should know and these are
 * you cannot create an abstract constructor
 * you can create a normal function
 * you can create a static method
 * you cannot use final with abstract because final means no inheritance and abstract prefer inheritance so they cancel out each other**
 * super is used to call the constructor of parent class **/
