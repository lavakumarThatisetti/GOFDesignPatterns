package structural.facade.withfacade;

import java.io.File;
import java.io.FileNotFoundException;

public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        File mp4 = videoConverterFacade.convert("latest-move.ogg", "mp4");
        System.out.println("Converted File Stored in: "+mp4.getName());
    }
}
