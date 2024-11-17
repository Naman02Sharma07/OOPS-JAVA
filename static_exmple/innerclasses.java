package practice.Object_oriented_programming.static_exmple;

public class innerclasses {//outside classes can not be statis

    String name;

    public innerclasses(String name) {
        this.name = name;
    }

    class test{//here you can put the static or you can remove the static
        String name;

        public test(String name) {
            this.name = name;
        }
    }

    static class test2{
        public test2(String name) {
            this.name = name;
        }

        String name;

    }

    public static void main(String[] args) {


        /**the below one code is dependent on the outer class i mean the test is dependent on the innerclass hence
         * static would where i syour object**/

//        test a = new test("naman");
//        test b = new test("shagun");

        /**the below one code is not dependent on any outer class so here i won't get any error **/
        innerclasses a1 = new innerclasses("naman sharma");
        innerclasses b1 = new innerclasses("shagun sharma");


        /** for the below code i make the class as static that mean that class would be independent of the object so here i can easily access it **/
        test2 a11 = new test2("naman shagun");
        test2 b11 = new test2("shagun naman");
    }
}

//static class a{
//
//}