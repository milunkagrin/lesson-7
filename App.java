package les7;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
//    DataStructure <Integer> dataStructure= new TwoWayData<>();
//        dataStructure.add(5);
//        dataStructure.add(10);
//        dataStructure.add(13);
//        dataStructure.add(105);
//
        Stack lifoStack = new StackImpl<>();
        System.out.println("Стек заполяется...");
        lifoStack.push(14);
        lifoStack.push(14);
        lifoStack.push(44);
        lifoStack.push(84);

        System.out.println(lifoStack.toString());

        lifoStack.pop();
        System.out.println(lifoStack.toString());

        Queue fifoQueue = new QueueImpl();
        System.out.println("Очередь заполняется...");
        fifoQueue.push(56);
        fifoQueue.push(96);
        fifoQueue.push(75);

        System.out.println(fifoQueue.toString());

        fifoQueue.pop();
        System.out.println(fifoQueue.toString());








    }

}


