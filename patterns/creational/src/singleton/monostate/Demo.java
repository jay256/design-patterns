package singleton.monostate;

public class Demo {
    public static void main(String[] args) {
        ChiefExecutiveOfficer ceo = new ChiefExecutiveOfficer();
        ceo.setAge(55);
        ceo.setName("Adam Smith");

        ChiefExecutiveOfficer ceo1 = new ChiefExecutiveOfficer();
        System.out.println(ceo1);
    }
}
