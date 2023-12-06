package src;

public interface MyList {
    Object get(int index);
    void clear();
    int size();
    void add(Object element);
    void addAt(int index,Object element);
    boolean remove(Object element);
    boolean removeAt(int index);
}
