package class2;

public class Box<T> implements Comparable<T>{
    T t;
    public Box(T t) {
        this.t = t;
    }
    public T getO() {
        return t;
    }
    public void setO(T t) {
        this.t = t;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
