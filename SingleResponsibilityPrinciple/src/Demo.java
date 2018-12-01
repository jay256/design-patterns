import java.io.IOException;

public class Demo {

    public static void main(String[] args) throws IOException {

        Journal j = new Journal();
        j.addEntry("I am up");
        j.addEntry("Singing maeri");
        System.out.println(j);

        Persistence p = new Persistence();

        String filename = "test.log";

        p.saveToFile(j, filename, true);

        Runtime.getRuntime().exec("gedit " + filename);
    }

}
