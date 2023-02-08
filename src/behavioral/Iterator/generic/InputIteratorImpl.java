package behavioral.Iterator.generic;

public class InputIteratorImpl<E> implements InputIterator<E> {

    Object[] objects;
    int cursor;
    int length;

    InputIteratorImpl(Object[] objects){
        this.objects = objects;
        cursor = 0;
        length = objects.length;
    }

    @Override
    public boolean hasNext() {
        return cursor < objects.length;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E next() {
        return (E) objects[cursor++];
    }
}
