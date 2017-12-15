package les7;

import java.util.EmptyStackException;

public class QueueImpl <E> implements Queue <E> {

    private Elem<E> top;
    private Elem <E> tail;
    private int size;

    QueueImpl() {
        size = 0;
        top = null;
        tail = null;
    }


    @Override
    public void push( E value) {
        top = new Elem <>(value, top);
        size++;

    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new EmptyQueueException();
        } else {
            E saved = top.value;
            top= top.next;
            size--;
            return saved;
        }

    }

    @Override
    public boolean isEmpty() {
        return top == null& tail== null;

    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Object toArray() {
        Object[] collection = new Object[size];
        for (int i = 0; i < size; i++) {
            collection[i] = pop();
        }
        return collection;
    }

    public String toString() {
        if (isEmpty()) return "[]";
        // [ el, el, ... , el]
        StringBuilder sb = new StringBuilder("[");

        Elem saved = top;
        while (saved != null){
            sb.append(String.valueOf(saved.value));
            sb.append(", ");
            saved = saved.next;
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    private class EmptyQueueException extends Throwable {
    }
}
