package les7;

import java.lang.reflect.Array;

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
    public void add(T value) {
//        DataElement element = new DataElement(value);
//        if (head == null) {
//            head = tail = element;
//        } else {
//            DataElement current = tail;
////            while ( current.next != null)
//            tail.next = element;
//            tail.prev = current;
//            tail = element;
        DataElement element = new DataElement(value);
        if (head == null) {
            head = element;
        } else {
            DataElement current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = element;
            element.prev = current;
        }
        size++;

    }


    @Override
    public void remove(int index) {

        if (index < 0 || index >= size) {
            throw new TwoWayDataIndexOutOfBoundsException("НЕправильный индекс = " + index + ". Задайте положительный индекс или индекс меньше, чем = " + size);

        }
        DataElement prev = null;
        DataElement p = head;
        for (int i = 0; i < index; i++) {
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
        Object[] collection = new Object[size];
        for (int i = 0; i < size; i++) {
            collection[i] = head.value;
            temp = temp.next;
        }
        return collection;
    }
}




