package structural.facade;

public class OggCompressionCodec implements CompressionCodec{

    @Override
    public String getType() {
        return "ogg";
    }
}
