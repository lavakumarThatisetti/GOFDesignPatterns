package structural.facade.withoutfacade;

import structural.facade.AudioMixer;
import structural.facade.BitrateReader;
import structural.facade.CodecFactory;
import structural.facade.CompressionCodec;
import structural.facade.MPEG4CompressionCodec;
import structural.facade.OggCompressionCodec;
import structural.facade.VideoFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;

public class Client {
    /* without Facade Client need to manage all the subs systems overhead */
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "latest-move.ogg";
        String format = "mp4";
        VideoFile file = new VideoFile(filename);
        File sourceCodec = CodecFactory.extract(file);
        CompressionCodec destinationCodec = null;
        if (format.equals("mp4"))
            destinationCodec = new MPEG4CompressionCodec();
        else
            destinationCodec = new OggCompressionCodec();

        BufferedReader buffer = BitrateReader.read(filename, sourceCodec);
        File desFile = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer()).fix(desFile);
        System.out.println(result);
    }
}
