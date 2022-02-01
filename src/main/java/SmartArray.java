import java.util.function.Consumer;

public class SmartArray {
    public static final int INITIAL_CAPACITY = 4;
    public static final int INITIAL_SIZE = 0;

    private int size;
    private int capacity;
    private int[] data;


    public SmartArray() {
        this.size = INITIAL_SIZE;
        this.capacity = INITIAL_CAPACITY;
        this.data = new int[capacity];
    }


    public void add(int element) {
        resizeIfNeeded();
        this.data[size] = element;
        size++;
    }

    private void resizeIfNeeded() {
        if (size == data.length) {
            this.capacity += 4;
            int[] temp = new int[this.capacity];
            for (int currentIntex = 0; currentIntex < data.length; currentIntex++) {
                temp[currentIntex] = data[currentIntex];
            }
            this.data = temp;
        }

    }

    private void shiftToRight() {
        for (int currentIndex = size - 1; currentIndex > 0; currentIndex--) {
            resizeIfNeeded();
            int tempNum = data[currentIndex];
            data[currentIndex] = data[currentIndex - 1];
            data[currentIndex + 1] = tempNum;
        }
    }

    private void shiftToLeft() {
        for (int currentIndex = 0; currentIndex < size; currentIndex++) {
            resizeIfNeeded();
            int tempNum = data[currentIndex];
            data[currentIndex] = data[currentIndex + 1];

        }
    }

    public void addFirst(int element) {
        resizeIfNeeded();
        shiftToRight();
        data[0] = element;
        size++;
    }

    public void addLast(int element) {
        resizeIfNeeded();
        data[size] = element;
        size++;
    }

    public void removeFirst() {
        data[0] = 0;
        shiftToLeft();
        size--;
    }

    public void removeLast(){
        data[size - 1] = 0;
        size--;
    }

    public int getIndex(int index){
        return data[index];
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int currentNum = 0; currentNum < size; currentNum++) {
            consumer.accept(data[currentNum]);
        }
    }
}
