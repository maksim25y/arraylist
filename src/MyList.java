package src;

public interface MyList<T> {
    void clear();
    int size();
    void add(T element);
    void addAt(int index,T element);
    void remove(T element);
    void removeAt(int index);
}
