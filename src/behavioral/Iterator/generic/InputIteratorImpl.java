package behavioral.Iterator.generic;

public class InputIteratorImpl<E> implements InputIterator<E> {

    Object[] heroes;
    int cursor;
    int length;

    InputIteratorImpl(Object[] heroes){
        this.heroes = heroes;
        cursor = 0;
        length = heroes.length;
    }

    @Override
    public boolean hasNext() {
        return cursor < heroes.length;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E next() {
        return (E) heroes[cursor++];
    }
}
