package behavioral.Iterator.withoutgeneric;

public class Main {
    public static void main(String[] args) {
        HeroCollection heroCollection = new HeroCollection(5);

        heroCollection.addHero(new Hero("NTR Jr"));
        heroCollection.addHero(new Hero("Prabhas"));
        heroCollection.addHero(new Hero("Yash"));
        heroCollection.addHero(new Hero("Allu Arjun"));
        heroCollection.addHero(new Hero("Rishab Shetty"));

        HeroIterator iterator = heroCollection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}
