package structural.facade;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BitrateReader {

    public static BufferedReader read(String filename, File sourceCodec) throws FileNotFoundException {
        return new BufferedReader(new FileReader(sourceCodec));
    }

    public static File convert(BufferedReader buffer, CompressionCodec destinationCodec){
        return new File("result_file."+destinationCodec.getType());
    }
}
