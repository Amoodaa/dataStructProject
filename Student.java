package dsdoublelinkedlist;

public class Student {

    static int ids = 1;
    int id;
    String first, last;
    int mid, fin, total;
    char grade;

    protected Student(int id) {
        this.id = id;
    }

    public Student() {
        this.id = ids++;
    }

    public Student(String first, String last, int mid, int fin) throws marksNotInRangeException {
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
        this.total = mid + fin;
        this.grade = getRating(this.total);
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
        return this.id == st.id || ((this.first == null ? st.first == null : this.first.equals(st.first)) &&(this.last == null ? st.last == null : this.last.equals(st.last)));
    }
}

class marksNotInRangeException extends Exception {

    marksNotInRangeException(String string) {
        super(string);
    }
}
