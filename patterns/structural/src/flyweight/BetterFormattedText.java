package flyweight;

import java.util.ArrayList;
import java.util.List;

public class BetterFormattedText {

    private String plainText;
    private List<TextRange> formatting = new ArrayList<>();

    public BetterFormattedText(String plainText){
        this.plainText = plainText;
    }

    public TextRange getRange(int start, int end){
        TextRange textRange = new TextRange(start, end);
        formatting.add(textRange);
        return textRange;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<plainText.length();i++){
            char c = plainText.charAt(i);
            for(TextRange range : formatting){
                if(range.covers(i) && range.capitalize)
                    c = Character.toUpperCase(c);
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public class TextRange{
        public int start, end;
        public boolean capitalize, bold, italic;

        public TextRange(int start, int end){
            this.start = start;
            this.end = end;
        }

        public boolean covers(int position){
            return position >= start && position <= end;
        }
    }

}
