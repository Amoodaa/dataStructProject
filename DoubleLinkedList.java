/*
 * Studento change this license header, choose License Headers in Project Properties.
 * Studento change this template file, choose Studentools | Studentemplates
 * and open the template in the editor.
 */
package dsdoublelinkedlist;

/**
 *
 * @author amood
 */
public class DoubleLinkedList {

    Node firstNode, lastNode;
    //<editor-fold defaultstate="collapsed" desc="singleton and constructors">
    private static DoubleLinkedList instance;

    private DoubleLinkedList() {
    }

    private DoubleLinkedList(Node firstNode, Node lastNode) {
        this.firstNode = firstNode;
        this.lastNode = lastNode;
    }

    static DoubleLinkedList getInstance() {
        if (instance == null) {
            instance = new DoubleLinkedList();
        }
        return instance;
    }
//</editor-fold>

    boolean isEmpty() {
        return firstNode == null;
    }

    boolean isOnlyOneItem() {
        return firstNode.n == null;
    }
//<editor-fold defaultstate="collapsed" desc="inserts">

    void insertFirst(Node newNode) {
        if (isEmpty()) {
            firstNode = newNode;
        } else {
            firstNode.p = newNode;
            newNode.n = firstNode;
            newNode.p = null;
            firstNode = newNode;
        }
    }

    void insertAfter(Node newNode) {

        if (isEmpty()) {
            insertFirst(newNode);
            return;
        }

        if (isOnlyOneItem()) {
            insertLast(newNode);
            return;
        }
        Node cur = this.firstNode;
        while (cur != null && !cur.equals(newNode)) {
            cur = cur.n;
        }
        cur.n.p = newNode;
        cur.n = newNode;
    }

    void insertLast(Node newNode) {
        if (isEmpty()) {
            insertFirst(newNode);
        } else if (isOnlyOneItem()) {
            firstNode.n = newNode;
            newNode.p = firstNode;
            lastNode = newNode;
        } else {
            lastNode.n = newNode;
            newNode.p = lastNode;
            lastNode = newNode;
        }
    }

//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="delete">
    void deleteFirst() {
        firstNode = firstNode.n;
        firstNode.p = null;
    }

    void delete(String first, String last) {
        Node deleteNode = new NodeWrapper(first, last);
        delete(deleteNode);

    }

    void delete(int DeleteId) {
        Node deleteNode = new NodeWrapper(DeleteId);
        delete(deleteNode);
    }

    void delete(Node deleteNode) {

        if (isEmpty()) {
            return;
        }

        if (firstNode.equals(deleteNode)) {
            deleteFirst();
            return;
        }
        Node cur = this.firstNode;
        // 1 2 3 (4) 5 6
        // cur 1 2 3 4
        //prev n 1 2 3 cur.p
        while (cur != null && !cur.equals(deleteNode)) {
            cur = cur.n;
        }
        cur.p.n = cur.n;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="sorting to be implmented">

    /*
    void sortByName() {
    // if (firstNode.info.first.compareTo(firstNode.n.info.first) > 0) {
    
    }
    
    void sortById() {
    boolean isSorted = false;
    Node tmp = lastNode;
    Node tmp2 = tmp.p;
    
    while (!isSorted) {
    isSorted = true;
    while (tmp.p.p != null) {
    if (tmp.info.id < tmp.p.info.id) {
    tmp.swap(tmp.p);
    //                    System.out.println("swapped " + tmp.info.id +" "+ tmp.p.info.id);
    this.print();
    isSorted = false;
    }
    }
    if (isSorted) {
    firstNode = getFirst(tmp);
    lastNode = getlast(tmp);
    }
    tmp = tmp.p;
    
    }
    }*/
//</editor-fold>
    Node getFirst(Node node) {
        if (node.p == null) {
            return node;
        }
        return getFirst(node.p);
    }

    Node getlast(Node node) {
        if (node.n == null) {
            return node;
        }
        return getFirst(node.n);
    }

    void print() {
        System.out.print("null" + " <=> ");
        Node tmp = this.firstNode;
        while (tmp != null) {
            System.out.print(tmp + " <=> ");
            tmp = tmp.n;
        }
        System.out.println("null");
        System.out.println("firstNode:" + firstNode);
        System.out.println("lastNode:" + lastNode);
    }
}
