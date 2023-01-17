package behavioral.Iterator.generic;

import behavioral.Iterator.withoutgeneric.Hero;
import behavioral.Iterator.withoutgeneric.HeroCollection;
import behavioral.Iterator.withoutgeneric.HeroIterator;

public class Main {
    public static void main(String[] args) {
        InputCollection<Input> inputCollection = new InputCollection<>(5);

        inputCollection.addData(new Input("NTR Jr"));
        inputCollection.addData(new Input("Prabhas"));
        inputCollection.addData(new Input("Yash"));
        inputCollection.addData(new Input("Allu Arjun"));
        inputCollection.addData(new Input("Rishab Shetty"));

        InputIterator<Input> iterator = inputCollection.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getData());
        }
    }
}
