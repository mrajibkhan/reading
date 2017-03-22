package datastructure;

/**
 * Created by rajib.khan on 3/22/17.
 */
public class Stack {

    private int capacity = 0;
    private int topIndex = -1;

    private Object[] array;

    public Stack(int capacity) {
        this.capacity = capacity;
        array = new String[capacity];
    }

    public static void main(String[] args) {
        Stack s = new Stack(10);

        boolean isPushSuccessful = false;
        for (int i = 0; i <= 10; i++) {
            isPushSuccessful = s.push("str" + i);
            System.out.println(i + " push = " + isPushSuccessful);
        }

        System.out.println("Size = " + s.getTopIndex());

        Object popped = null;
        for (int j = 0; j <= 10; j++) {
            popped = s.pop();
            System.out.println(j + " popped = " + popped);
        }


    }

    public Object pop() {

        if (topIndex == -1) {
            return null;
        }

        Object popped = array[topIndex];
        array[topIndex] = null;
        topIndex--;

        return popped;

    }

    public boolean push(Object obj) {

        if (! (topIndex < capacity - 1)) {
            System.err.println("can't push .. stack is full");

            return false;
        }

        topIndex++;
        array[topIndex] = obj;

        return true;
    }

    public int getTopIndex() {

        return topIndex;
    }
}





