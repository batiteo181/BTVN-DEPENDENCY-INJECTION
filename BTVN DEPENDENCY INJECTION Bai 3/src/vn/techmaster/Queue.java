package vn.techmaster;

public class Queue extends Construct {

    @Override
    public void add(int data) {
        System.out.println("Queue add");
    }

    @Override
    public int get() {
        System.out.println("Queue get");
        return 0;
    }
}

