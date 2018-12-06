import org.javatuples.Triplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Relationships implements RelationshipBrowser{

    private List<Triplet<Person, Relationship, Person>> relationships = new ArrayList<>();

//    public List<Triplet<Person, Relationship, Person>> getRelationships() {
//        return relationships;
//    }

    public void addParentAndChild(Person parent, Person child){
        relationships.add(new Triplet<>(parent, Relationship.PARENT, child));
        relationships.add(new Triplet<>(child, Relationship.CHILD, parent));
    }

    @Override
    public List<Person> findAllChildrenOf(String name) {
        return relationships.stream()
                .filter(x -> Objects.equals(x.getValue0().name, name)
                && x.getValue1().equals(Relationship.PARENT))
                .map(Triplet::getValue2)
                .collect(Collectors.toList());
    }
}
