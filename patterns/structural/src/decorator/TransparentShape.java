package decorator;

import java.util.function.Supplier;

public class TransparentShape<T extends Shape> implements Shape {

    private Shape shape;

    private int transparency;

//    public TransparentShape(Shape shape, int transparency){
//        this.shape = shape;
//        this.transparency = transparency;
//    }

    public TransparentShape(Supplier<? extends T> ctor, int transparency){
        shape = ctor.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return shape.info() + " has " + transparency + "% transparency.";
    }
}
