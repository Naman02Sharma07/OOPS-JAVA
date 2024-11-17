import java.util.ArrayList;//this is the package that get imported in the file the moment i put array list in the code as you can see

public class oops1 {
    public static void main(String[] args) {

        ArrayList <Integer> a1 = new ArrayList<>();//the moment i put this in my code what is this a package get imported in this file

        // Create an array of Student objects
        Student[] students = new Student[5]; // This creates an array that can hold 5 Student references

        // Initialize a Student object
        Student kunal;
        kunal = new Student(); // Initialize the Student object


        //here i have already set the default values so if i even don't assign any value to the object kunal still it get the default value from the default constructor

//        kunal.rno = 1; // Assign the roll number
//        kunal.name = "Kunal"; // Assign the name
//        kunal.marks = 95.5f; // Assign the marks

        // Print details of the student
        System.out.println("Student Roll No: " + kunal.rno + ", Name: " + kunal.name + ", Marks: " + kunal.marks);
        kunal.greeting();
        kunal.changeName("Naman");
        System.out.println();
        System.out.println();
        Student random = new Student(kunal);
        System.out.println(random.name);
        System.out.println(random.marks);
        random.greeting();
    }

    // Define the Student class
    static class Student {
        int rno;//these rno name and marks we call them the properties og an object
        String name;
        float marks;

        //so the thing is if i call the constructor with 3 parameter it will call the below constructor but if i call the constructor with no
        //parameter then it will call the constructor with no parameter that is my default constructor

        //this thing basically termed as function overloading or constructor overloading


        Student(Student other){//this is basically a copy constructor where i copy the data of one constructor into the other constructor
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

        //basically the use of this is that we have the parameter and properties of the class are same to differentiate between the two we use the this keyword
        Student(int rollno,String name,float marks){//now what happen is if directly put any value in this constructor ut will automatically be assign to the properties of the object using the this keyword
            this.rno = rollno;
            this.name = name;
            this.marks = marks;
        }

        //"this" is the keyword that give us the way to initialize the properties of the object of any class
        //i comment out the below code becoz i have been using the same constructor to explain how i can create a constructor inside a constructor
//        Student(){//here this is pointing to the current object
//            this.rno = 1; // Assign the roll number
//            this.name = "Kunal"; // Assign the name
//            this.marks = 95.5f;
//        }
        void greeting(){
            System.out.println("hello hi how have you been, My name is "+this.name);//here this will be replace with the refernce variable name
        }

        void changeName(String name){
            this.name = name;//here i am saying that if i put any name inside the string then what happen is the name that earlier assign to the object now get change becoz of "this" keyword which now pointing to the new name
            System.out.println("now my name would be "+ this.name );
        }

        //here what is happening is that i am calling an another constructor inside the constructor using the "this"
        //so when inside the below constructor i put the "this" and then put the value in the brackets then what really happening is that
        //the constrcutor that we have created above with 3 parameter would be called
        Student(){
            //internally it like new student ()
            this(13,"default name",100.0f);
        }
//        }
    }
}

//class A{
//    final int num = 10;
//    String name;
//
//    public A(String name){
//        this.name = name;
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
//}

//some question we may have

/**why the new keyword is not use withe primitive datatypes and the reason is simple in java the primitive datatypes are not objet=ct the store in the stack **/


/**final is the keyword when give to any variable that time we have to initialize it's value while declaring and the thing is we cannot change the value with final just like const in other programming language
 *
 * in final you can not change the vlaue of primitive data type but you change the value of non primitive datatype
 * and the other important thing is that you cannot reassign any object again once you have declare it with the final keyword **/


/**garbage collection means if any of the space in the mmeory get free in java the garbage collection free that space **/