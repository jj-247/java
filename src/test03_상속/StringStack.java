package test03_상속;

public class StringStack implements Stack {

    private String[] stack;
    private int index;

    public StringStack(int capacity) {
        stack = new String[capacity];
        index = -1;
    }

    @Override
    public int length() {
        return index + 1;
    }

    @Override
    public int capacity() {
        return stack.length;
    }

    @Override
    public String pop() {
        if (index == -1) {
            return null;
        }
        String s = stack[index];
        index--;
        return s;
    }

    @Override
    public boolean push(String val) {
        if (index == stack.length - 1) {
            return false;
        } else {
            index++;
            stack[index] = val;
            return true;
        }
    }

}
