package les7;

public class QueueImpl implements Queue {

    private DataElement head;
    private DataElement tail;
    private int size;

    QueueImpl() {
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
        return head == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object toArray() {
        DataElement temp = head;
        Object[] queue = new Object[size];
        for (int i = 0; i < size; i++) {
            queue [i] = head.value;
            temp = temp.next;
        }
        return queue;
    }
}
