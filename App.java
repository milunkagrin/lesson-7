package les7;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
    DataStructure <Integer> dataStructure= new TwoWayData<>();
        dataStructure.add(5);
        dataStructure.add(10);
        dataStructure.add(13);
        dataStructure.add(105);
        Object arr = dataStructure.toArray();
        System.out.println(arr);


    }

}


