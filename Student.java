/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsdoublelinkedlist;

/**
 *
 * @author amood
 */
public class Student {

    static int ids = 0;
    int id;
    String first, last;
    double mid, fin, average;
    char grade;

    protected Student(int id) {
        this.id = id;
    }

    public Student() {
        this.id = ids++;
    }

    public Student(String first, String last, double mid, double fin) throws marksNotInRangeException {
        this.id = ids++;
        this.first = first;
        this.last = last;
        if (mid < 40 && mid > 0) {
            this.mid = mid;
        } else {
            ids--;
            this.id = -1;
            throw new marksNotInRangeException(mid + "not in acceptable range");
        }
        if (fin < 60 && fin > 0) {
            this.fin = fin;
        } else {
            throw new marksNotInRangeException(fin + "not in acceptable range");
        }
        this.average = (mid + fin) / 100;
        this.grade = getRating(this.average);
    }

    static char getRating(double average) {
        int i = (int) average;
        if (i >= 90) {
            return 'A';
        } else if (i >= 80) {
            return 'B';
        } else if (i >= 70) {
            return 'C';
        } else if (i >= 60) {
            return 'D';
        } else {
            return 'F';
        }

    }

    @Override
    public String toString() {
        return this.id + "";
    }

    @Override
    public boolean equals(Object o) {
        Student st = (Student) o;
        return this.id == st.id;
    }
}

class marksNotInRangeException extends Exception {

    marksNotInRangeException(String string) {
        super(string);
    }
}
