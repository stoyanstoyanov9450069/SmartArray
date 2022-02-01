import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        smartArray.add(1);
        smartArray.add(2);
        smartArray.add(3);
        smartArray.add(4);
        smartArray.add(5);

        smartArray.addFirst(46);
        smartArray.addFirst(99);
        smartArray.addFirst(50);
        smartArray.addFirst(9);
        smartArray.addFirst(7);
        smartArray.addFirst(8);

        smartArray.addLast(777);
        smartArray.addLast(888);

        smartArray.removeFirst();
        smartArray.removeFirst();
        smartArray.removeLast();
        smartArray.removeLast();

        smartArray.forEach(e -> System.out.printf("%d ", e));
        System.out.println();
        System.out.println(smartArray.getIndex(0));
        System.out.println(smartArray.getIndex(5));




    }
}
