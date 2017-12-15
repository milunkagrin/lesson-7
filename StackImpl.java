package les7;

import java.util.EmptyStackException;

public class StackImpl <Integer> implements Stack <Integer>  {

    private Elem<Integer> top;
    private int size;

    StackImpl() {
        size = 0;
        top = null;
    }



    @Override
    public void push(Integer value) {
        top = new Elem <>(value, top);
        size++;

    }

    @Override
    public Integer pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
        Integer saved = top.value;
        top = top.next;
        size--;
        return saved;

        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
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

}




