package structural.facade;

import java.io.File;

public class CodecFactory {

    public static File extract(VideoFile file){
        return new File("src/behavioral/facade/codec_file.ogg");
    }
}
