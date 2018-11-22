
//        Юрий Лещенко, [08.11.18 20:21]
//        init(int[] ini)



public interface MyInterface {

    void init(int[] init);
    int size();
    void addEnd(int value);
    void dellPos(int index);
    void print();
    int min();
    int minPos();
    int max();
    int maxPos();
    int get(int index);
    void delEnd();
    void delStart();
    void addPos(int index,int value);
    void addStart(int value);
    void sort();
    void clear();
    String myToString();
}
