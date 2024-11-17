package practice.Object_oriented_programming.properties.polymorphism;

public class shapes {
    void area(){
        System.out.println("I am in shapes");
    }

    final void vol(){//as i write the final then this means this method cannot be overriden
        //this is basically called the late binding if it called after the compile time
        //if it called during the runtime then it is called then early binding
        System.out.println("this is for the volume of the shape");
    }
}


