package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Data data = new Data(META_DATA.HTML);

        Processor processor;

        switch (data.getMetadata()){
            case HTML:
                processor = new HTMLProcessor();
                System.out.println(processor.process(data));
                return;
            case JSON:
                processor = new JSONProcessor();
                System.out.println(processor.process(data));
                return;
            case PLAIN:
                processor = new PlainTextProcessor();
                System.out.println(processor.process(data));
                return;
            default:
                System.out.println("Meta Data Not Supported "+data.getMetadata());
                break;

        }
    }
}
