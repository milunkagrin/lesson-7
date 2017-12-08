package les7;

public class TwoWayData <T> implements DataStructure <T> {

    private DataElement head;
    private DataElement tail;
    private int size;

    TwoWayData() {
        size = 0;
        head = null;
        tail = null;
    }

    @Override
    public boolean add(int value) {                    // добавление в конец
        DataElement element = new DataElement<>(value);
        if (head == null) {
            head = tail = element;
        } else {
            DataElement current = tail;
            tail.next = element;
            tail.prev = current;
            tail = element;

        }

        return true;
    }


    @Override
    public boolean remove(int index) {

            if (index < 0 || index > size) {
            return false;
    }  DataElement prev = null; DataElement p = head;
                for (int i= 0; i< index; i++) {
                    prev = p;
                    p = p.next;
                }
        if (index == 0) {
            head = head.next;

        } else {
            p.next.prev = prev;
            prev.next = p.next;
        }

        if (p == tail) {
            tail = prev;
        }
        size--;
        return true;
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
        if (isEmpty()) return "[]";

        return null;
    }
}
