package src;

public interface MyList {
    Object get(int index);
    void clear();
    int size();
    void add(Object element);
    void addAt(int index,Object element);
    void remove(Object element);
    void removeAt(int index);
}
