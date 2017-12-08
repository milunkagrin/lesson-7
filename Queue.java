package les7;

public interface Queue <R> extends Collection {
    R push (R value);
    R pop();

}
