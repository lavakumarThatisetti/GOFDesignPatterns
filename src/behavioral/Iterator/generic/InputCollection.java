package behavioral.Iterator.generic;

public class InputCollection<T> {

    Object[] heroes;
    int index;

    public InputCollection(int n){
        heroes = new Object[n];
        index = 0;
    }

    public void addData(Input hero){
        heroes[index] = hero;
        index++;
    }

    public InputIterator<T> iterator(){
        return new InputIteratorImpl<T>(heroes);
    }
}
