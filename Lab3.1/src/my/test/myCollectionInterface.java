package my.test;

public interface myCollectionInterface<T>
{
    void add(T str);
    T get(int index);
    void delete(int index);
    void delete(T str);
    int size();
    void clear();
}
