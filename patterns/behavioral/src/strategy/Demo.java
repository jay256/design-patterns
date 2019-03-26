package strategy;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
//        TextProcessor tp = new TextProcessor(OutputFormat.MARKDOWN);
//        tp.appenList(Arrays.asList("liberte", "egalite", "fraternite"));
//        System.out.println(tp);
//
//        tp.clear();
//        tp.setOutputFormat(OutputFormat.HTML);
//        tp.appenList(Arrays.asList("inheritance", "encapsulation", "polymorphism"));
//        System.out.println(tp);

        TextProcessor<MarkdownListStrategy> tp = new TextProcessor<>(MarkdownListStrategy::new);
        tp.appenList(Arrays.asList("alpha", "beta", "gamma"));
        System.out.println(tp);

        TextProcessor<HtmlListStrategy> tp1 = new TextProcessor<>(HtmlListStrategy::new);
        tp1.appenList(Arrays.asList("alpha", "beta", "gamma"));
        System.out.println(tp1);

    }

}
