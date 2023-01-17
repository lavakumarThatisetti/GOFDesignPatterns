package behavioral.Iterator.withoutgeneric;

public class HeroIteratorImpl implements HeroIterator {

    Hero[] heroes;
    int cursor;
    int length;

    HeroIteratorImpl(Hero[] heroes){
        this.heroes = heroes;
        cursor = 0;
        length = heroes.length;
    }

    @Override
    public boolean hasNext() {
        return cursor < heroes.length;
    }

    @Override
    public Hero next() {
        return heroes[cursor++];
    }
}
