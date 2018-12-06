import org.javatuples.Triplet;

import java.util.List;

public class Research {

    public Research(RelationshipBrowser relationships){
//        List<Triplet<Person, Relationship, Person>> relations = relationships.getRelationships();
//        relations.stream()
//                .filter(x -> x.getValue0().name.equals("John")
//                && x.getValue1() == Relationship.PARENT)
//                .forEach(ch -> System.out.println(
//                        "John has a child called " + ch.getValue2().name
//                ));
        List<Person> children = relationships.findAllChildrenOf("John");
        children.stream()
                .forEach(ch -> System.out.println("John has a child called " + ch.name));
    }

}
