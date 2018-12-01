import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Persistence {

    void saveToFile(Journal j, String filename, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists()){
            try (PrintStream out = new PrintStream(filename)){
                out.println(toString());
            }
        }
    }

}
