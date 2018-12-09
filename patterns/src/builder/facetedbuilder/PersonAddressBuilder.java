package builder.facetedbuilder;

public class PersonAddressBuilder extends PersonBuilder {

    public PersonAddressBuilder(Person person){
        this.person = person;
    }

    public PersonAddressBuilder at(String streetAddress){
        person.streetAddress = streetAddress;
        return this;
    }

    public PersonAddressBuilder withPostcode(String postCode){
        person.postCode = postCode;
        return this;
    }

    public PersonAddressBuilder in(String city){
        person.city = city;
        return this;
    }
}