package behavioral.Iterator.withoutgeneric;

public class HeroCollection {

    Hero[] heroes;
    int index;

    public HeroCollection(int n){
        heroes = new Hero[n];
        index = 0;
    }

    public void addHero(Hero hero){
        heroes[index] = hero;
        index++;
    }

    public HeroIterator iterator(){
        return new HeroIteratorImpl(heroes);
    }
}
