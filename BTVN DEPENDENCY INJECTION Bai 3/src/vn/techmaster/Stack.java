package vn.techmaster;

public class Stack extends Construct {

    @Override
    public void add(int data) {
        System.out.println("Stack add");
    }

    @Override
    public int get() {
        System.out.println("Stack get");
        return 0;
    }
}
