package decorator;

import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
        MagicString magicString = new MagicString("hello");
        System.out.println(magicString + " has " + magicString.getNumberOfVowels() + " vowels.");

        Circle circle = new Circle(10);
        System.out.println(circle.info());

//        ColoredShape blueSquare = new ColoredShape(new Square(20), "blue");
        ColoredShape<Square> blueSquare = new ColoredShape<>(() -> new Square(20), "blue");
        System.out.println(blueSquare.info());

//        TransparentShape green = new TransparentShape(new ColoredShape(new Circle(5), "green"), 5);
        TransparentShape<ColoredShape<Circle>> green =
                new TransparentShape<>(() ->
                new ColoredShape<>(() -> new Circle(5), "green"), 50);
        System.out.println(green.info());


        MyStringBuilder myStringBuilder = new MyStringBuilder();
        myStringBuilder.append("hello").appendLine(" world");
        System.out.println(myStringBuilder.concat("and this too"));
    }
}
