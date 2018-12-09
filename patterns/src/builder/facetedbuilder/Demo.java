package builder.facetedbuilder;

public class Demo {
    public static void main(String[] args) {
        PersonBuilder pb = new PersonBuilder();
        Person person = pb
                .lives()
                .at("KDBSN")
                .in("BLR")
                .withPostcode("103")
                .works()
                .at("PYPL")
                .asA("Engineer")
                .earning(100)
                .build();
        System.out.println(person);
    }
}
