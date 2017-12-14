package les7;

public class StackImpl implements Stack {

    private DataElement head;
    private DataElement tail;
    private int size;

    StackImpl() {
        size = 0;
        head = null;
        tail = null;
    }


    @Override
    public Object push(Object value) {
        return null;
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object toArray() {
        DataElement temp = head;
        Object[] stack = new Object[size];
        for (int i = 0; i < size; i++) {
            stack[i] = head.value;
            temp = temp.next;
        }
        return stack;
    }
}
