import java.util.ArrayList;
import java.util.List;

class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    void addEntry(String entry){
        entries.add("" + (++count) + ":" + entry);
    }

    void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

