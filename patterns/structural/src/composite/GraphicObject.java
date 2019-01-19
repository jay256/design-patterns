package composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GraphicObject {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String name = "Group";

    public GraphicObject(){

    }

    public String color;
    public List<GraphicObject> children = new ArrayList<>();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        print(builder, 0);
        return builder.toString();
    }

    private void print(StringBuilder builder, int i) {
        builder.append(String.join("", Collections.nCopies(i, "*")))
                .append(i > 0 ? " " : "")
                .append((color==null || color.isEmpty()) ? "" : color + " ")
                .append(getName())
                .append(System.lineSeparator());
        for(GraphicObject child : children){
            child.print(builder, i+1);
        }
    }


}
