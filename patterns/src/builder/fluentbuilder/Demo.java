package builder.fluentbuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person dmitri = pb.withName("Dmitri").build();
    }
}
