package practice.Object_oriented_programming.Interfaces.nested;

public interface A {
    public interface NestedInterface{//this is the nested interface that i have just created
        boolean siOdd(int num);
    }
}

class B implements A.NestedInterface{//this is the way by which i inherit B as the child interface of the nestedInterface

    @Override
    public boolean siOdd(int num) {
        return ((num&1) ==1);
    }
}