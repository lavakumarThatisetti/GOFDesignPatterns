package behavioral.Iterator.generic;

public class InputCollection<T> {

    Object[] objects;
    int index;

    public InputCollection(int n){
        objects = new Object[n];
        index = 0;
    }

    public void addData(Input object){
        objects[index] = object;
        index++;
    }

    public InputIterator<T> iterator(){
        return new InputIteratorImpl<T>(objects);
    }
}
