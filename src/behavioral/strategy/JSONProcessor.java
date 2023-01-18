package behavioral.strategy;

public class JSONProcessor implements Processor {
    @Override
    public boolean process(Data data) {
        System.out.println("JSON Data processed: "+data.getMetadata());
        return true;
    }
}
