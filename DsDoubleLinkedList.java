package dsdoublelinkedlist;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JTable;

public class DsDoubleLinkedList {

    public static void main(String[] args) {

        tests();
    }

    private static void tests() {

        DoubleLinkedList list = DoubleLinkedList.getInstance();
        list.insertLast(new Node(new Student(1)));
        list.insertLast(new Node(new Student(2)));
        list.insertLast(new Node(new Student(6)));
        list.insertLast(new Node(new Student(4)));
        list.insertLast(new Node(new Student(7)));
        list.insertLast(new Node(new Student(8)));
        list.insertLast(new Node(new Student(3)));
        list.insertLast(new Node(new Student(5)));
        System.out.println("before");
        list.print();
        
        System.out.print("after\n");
        list.print();
    }
}
