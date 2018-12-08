package dsdoublelinkedlist;

public class DsDoubleLinkedList {

    public static void main(String[] args) {

        tests();
    }

    private static void tests() {

        DoubleLinkedList list = DoubleLinkedList.getInstance();

        list.insertLast(new Node(new Student(2)));
        list.insertLast(new Node(new Student(3)));
        list.insertLast(new Node(new Student(16)));
        list.insertLast(new Node(new Student(12)));
        list.insertLast(new Node(new Student(8)));
        list.insertLast(new Node(new Student(4)));
        list.insertLast(new Node(new Student(5)));
        list.insertLast(new Node(new Student(1)));

        list.print();
        System.out.print("before\n");
        //    list.firstNode.n.n.n.n.swap(list.firstNode.n.n.n.n.n.n);
        //    list.print();
        //list.sortById();
        System.out.println("done");
        list.print();
        System.out.print("after\n");
    }

}
