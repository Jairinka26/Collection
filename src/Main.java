public class Main {
    public static void main(String[] args) {
        init();
    }

    static void init(){

        MyCollection mylist = new MyCollection();
    //    mylist.init(int[5] newArray);
        mylist.addEnd(12);
        mylist.addEnd(5);
        mylist.addEnd(27);
        mylist.addEnd(3);
        mylist.addEnd(-8);

        mylist.print();
        System.out.println("min :"+mylist.min());
        System.out.println("max :"+mylist.max());
        System.out.println("index of min :"+mylist.minPos());
        System.out.println("index of max :"+mylist.maxPos());

        mylist.dellPos(2);
        mylist.print();

        System.out.println("Index 1:" + mylist.get(1));
        System.out.println("Size :"+mylist.size());

        mylist.delEnd();
        mylist.print();

        mylist.delStart();
        mylist.print();

        mylist.addPos(1,30);
        mylist.print();

        mylist.addPos(2,-9);
        mylist.print();

        mylist.addStart(16);
        mylist.print();

        mylist.sort();
        mylist.print();

        mylist.clear();
        mylist.print();

        System.out.println(mylist.myToString());

    }
}
