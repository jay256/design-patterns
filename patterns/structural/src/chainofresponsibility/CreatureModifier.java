package chainofresponsibility;

public class CreatureModifier {

    protected Game game;
    protected Creature creature;
    //protected CreatureModifier next;

    public CreatureModifier(Game game, Creature creature){
        this.game = game;
        this.creature = creature;
    }

//    public void add(CreatureModifier creatureModifier){
//        if(next != null){
//            next.add(creatureModifier);
//        }
//        else{
//            next = creatureModifier;
//        }
//    }
//
//    public void handle(){
//        if(next != null) next.handle();
//    }

}
