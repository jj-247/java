package test05_제네릭과컬렉션;

import java.util.Vector;

public class MyStack<T> implements IStack<T> {

    private Vector<T> v;

    public MyStack() {
        v = new Vector<>();
    }

    @Override
    public T pop() {
        if (v.size() == 0)
            return null;
        else {
            return v.remove(0);
        }
    }

    @Override
    public boolean push(T ob) {
        v.add(0, ob);
        return true;
    }

}
