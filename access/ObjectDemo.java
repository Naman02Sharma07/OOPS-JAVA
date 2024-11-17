package practice.Object_oriented_programming.access;

public class ObjectDemo {

    int num;
    @Override
    public int hashCode(){//number representation of a object
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){//this means 
        return super .equals(obj);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{//for cloning
        return super.clone();
    }


    public ObjectDemo(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(23);
        System.out.println(obj.hashCode());
    }
}
