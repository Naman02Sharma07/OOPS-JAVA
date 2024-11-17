package practice.Object_oriented_programming.static_exmple;

public class static_block {
    static int a=4;
    static int b;

    static {
        System.out.println("i am doing my best");
        b = a*5;
    }


    /** basically the flow of the below code is that first the static variable are initialised then an object is created
     * so first a get the value as 4 and b would get the value as 20 then
     *
     * then b is incremented by the 5 and then an object is created with the name obj and the other object would ve created with the name obj2 **/
    public static void main(String[] args) {
        static_block obj=new static_block();
        System.out.println(static_block.a +" "+ static_block.b);

        static_block.b +=5;

        System.out.println(static_block.a +" "+static_block.b);
        static_block obj2 = new static_block();

        System.out.println(static_block.a +" "+static_block.b);
    }
}
