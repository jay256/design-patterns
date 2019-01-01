package prototype.serialization;

import org.apache.commons.lang.SerializationUtils;

public class Demo {

    public static void main(String[] args) {
        Foo foo = new Foo(42, "Life");
        Foo foo2 = (Foo)SerializationUtils.clone(foo);

        foo2.whatever = "xyz";

        System.out.println(foo);
        System.out.println(foo2);
    }
}
