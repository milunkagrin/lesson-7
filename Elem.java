package les7;

public class Elem <T> {

    public T value;
    public Elem<T> next;

        public Elem(T value, Elem<T> next) {
            this.value = value;
            this.next = next;
        }
    }


