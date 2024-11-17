package practice.Object_oriented_programming.properties.polymorphism;

public class Numbers {
    void sum(int a , int b){
        System.out.println(a+b);
    }
    void sum(int a,int b , int c){
        System.out.println(a+b+c);
    }
    double sum(double a,double b){
        System.out.println(a+b);
        return a+b;
    }
}

/**all the above methods are the part of static polymorphism where the method is same but the number of arguments differ
 * and the other thing whther the argument number is same the out put that is going to be return would be different**/