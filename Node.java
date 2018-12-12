package dsdoublelinkedlist;

public class Node {

    Student info;
    Node p, n;

    public Node() {
    }

    public Node(Student info) {
        this.info = info;
    }

    public Node(Student info, Node p, Node n) {
        this.info = info;
        this.p = p;
        this.n = n;
    }

    @Override
    public String toString() {
        return this.info.toString();
    }

    @Override
    public boolean equals(Object o) {
        Node in = (Node) o;
        return this.info.equals(in.info);
    }

    void swap(Node b) {
        System.out.println("not yet impl");
    }
}

class NodeWrapper extends Node {

    public NodeWrapper(int id) {
        super(new Student(id));
    }

    public NodeWrapper(String first, String last) {
        super(new Student(findID(first, last)));
    }

    private static int findID(String first, String last) {
        DoubleLinkedList list = DoubleLinkedList.getInstance();
        Node tmp = list.firstNode;
        while (!tmp.info.first.equals(first)
                && !tmp.info.last.equals(last)) {
            if (tmp.n != null) {
                return -1;
            }
            tmp = tmp.n;

        }
        return tmp.info.id;
    }

}
