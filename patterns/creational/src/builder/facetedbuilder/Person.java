package builder.facetedbuilder;

public class Person {

    public String streetAddress, postCode, city;

    public String companyName, position;
    public int annualIncome;

    @Override
    public String toString() {
        return "Person{" +
                "streetAddress='" + streetAddress + '\''+
                ", postcode='" + postCode + '\''+
                ", city='"+city+'\''+
                ", companyName='"+companyName+'\''+
                ", position='"+position+'\''+
                ", annualIncome='"+annualIncome+'\''+
                '}';
    }
}
