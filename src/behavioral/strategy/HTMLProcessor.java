package behavioral.strategy;

public class HTMLProcessor implements Processor {
    @Override
    public boolean process(Data data) {
        System.out.println("HTML Data processed: "+data.getMetadata());
        return true;
    }
}
