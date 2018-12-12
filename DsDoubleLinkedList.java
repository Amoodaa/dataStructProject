package dsdoublelinkedlist;

public class DsDoubleLinkedList {

    public static void main(String[] args) {

        tests();
    }

    private static void tests() {

        DoubleLinkedList list = DoubleLinkedList.getInstance();
        list.insertLast(new Node(new Student(1)));
        list.insertLast(new Node(new Student(2)));
        list.insertLast(new Node(new Student(3)));
        list.insertLast(new Node(new Student(4)));
        list.insertLast(new Node(new Student(5)));
        list.insertLast(new Node(new Student(6)));
        list.insertLast(new Node(new Student(7)));
        list.insertLast(new Node(new Student(8)));

        //    list.firstNode.n.n.n.n.swap(list.firstNode.n.n.n.n.n.n);
        //    list.print();
        //list.sortById();
        list.print();
        System.out.println("before");
        list.insertAfter(new Node(new Student(17)), new NodeWrapper(2));
        System.out.println("inserted-----------------------------");
        list.print();
        list.insertLast(new Node(new Student(17)));
        list.insertLast(new Node(new Student(17)));
//        list.print();
//        System.out.print("after\n");
    }
}
