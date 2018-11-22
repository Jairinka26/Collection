import java.util.Arrays;

import static com.sun.deploy.util.ArrayUtil.*;

public class MyCollection implements MyInterface {
    private int arraySize;
    private int[] myArray;

    MyCollection(){
        myArray = new int[0];
        arraySize = 0;
    }

    @Override
    public void init(int[] init) {
        myArray = init;
    }

    @Override
    public int size(){
        return arraySize;
    }

    @Override
    public int get (int index){
        return myArray[index];
    }

    @Override
    public void addEnd(int value) {
        arraySize++;
        myArray = Arrays.copyOf(myArray,arraySize);
        myArray[arraySize-1] = value;
    }

    @Override
    public void dellPos(int index) {
        arraySize--;
        int[] myArrayNew = new int[arraySize];

        for (int i = 0; i < index ; i++) {
            myArrayNew[i] = myArray[i];
        }

        for (int i = index+1; i < arraySize+1 ; i++) {
            myArrayNew[i-1] = myArray[i];
        }

        myArray = myArrayNew;
    }

    @Override
    public void print() {
        for (int i = 0; i < arraySize; i++) {
            System.out.print(myArray[i]+" ");
        }
        System.out.println();
    }

    @Override
    public int min() {
        int min = myArray[0];
        for (int i = 1; i < arraySize ; i++) {
            if (min>myArray[i])
                min = myArray[i];
        }
        return min;
    }

    @Override
    public int minPos() {
        int min = myArray[0];
        int min_i = 0;
        for (int i = 1; i < arraySize ; i++) {
            if (min>myArray[i]) {
                min = myArray[i];
                min_i = i;
            }
        }
        return min_i;
    }

    @Override
    public int max() {
        int max = myArray[0];
        for (int i = 1; i < arraySize ; i++) {
            if (max<myArray[i])
                max = myArray[i];
        }
        return max;
    }

    @Override
    public int maxPos() {
        int max = myArray[0];
        int max_i = 0;
        for (int i = 1; i < arraySize ; i++) {
            if (max<myArray[i]) {
                max = myArray[i];
                max_i = i;
            }
        }
        return max_i;
    }

    @Override
    public void delEnd() {
        arraySize--;
        myArray = Arrays.copyOf(myArray,arraySize);

    }

    @Override
    public void delStart() {
        myArray = Arrays.copyOfRange(myArray,1,arraySize);
        arraySize--;
    }

    @Override
    public void addPos(int index, int value) {
        arraySize++;
        myArray = Arrays.copyOf(myArray,arraySize);

        for (int i = arraySize - 1; i > index ; i--) {
            myArray[i]= myArray[i-1];
        }

        myArray[index] = value;
    }

    @Override
    public void addStart(int value) {
        addPos(0,value);
    }

    @Override
    public void sort() {
        Arrays.sort(myArray);
    }

    @Override
    public void clear() {
        Arrays.fill(myArray,0);
    }

    @Override
    public String myToString() {
        return  Arrays.toString(myArray);
    }
}
