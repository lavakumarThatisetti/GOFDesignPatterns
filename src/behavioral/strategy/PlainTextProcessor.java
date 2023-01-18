package behavioral.strategy;

public class PlainTextProcessor implements Processor {
    @Override
    public boolean process(Data data) {
        System.out.println("Plain Test Data processed "+data.getMetadata());
        return true;
    }
}
