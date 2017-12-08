package les7;

public class DataElement <T> {

    DataElement prev; // ссыль на предыдущее значение
    DataElement next; // ссыль на следующее
    T value;          // значение

    DataElement ( T value ) {
        this.value = value;
//        this.next = next;
//        this.prev = prev;
    }


}
