package builder.htmlexample;

public class Demo {

    public static void main(String[] args) {
        HtmlBuilder builder = new HtmlBuilder("ul");
        builder.addChild("li","hello").addChild("li","world"); //fluent interface
        System.out.println(builder);
    }
}
