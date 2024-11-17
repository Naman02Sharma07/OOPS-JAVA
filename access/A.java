package practice.Object_oriented_programming.access;

public class A {
    private int num;//now using private i won't be able to access num
    /**for such scenario where we set the variable as the private that means we won't be able to access it directly but we can access
     * is through some other function that are getter and setter**/
    public String name;//this mean you can access it everywhere
    /**this means you can access it from anywhere that is whether inside this package or in some other package you can access it **/
    int[] arr;

    public int getNum() {//this method is public so this method can be access from anywhere
        System.out.println(num);
        //so i can use this to get the value
        return num;
    }

    public void setNum(int num) {//this method can be use to set the value of the variable that is private
        this.num = num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}

/**protected can be access in the same package or in different package but by the sub clss of the parent class
 *
 * the a means only the subclass can access it nothing else not even the parent class in different package canaccess it **/