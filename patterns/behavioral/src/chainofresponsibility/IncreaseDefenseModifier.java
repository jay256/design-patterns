package chainofresponsibility;

public class IncreaseDefenseModifier extends CreatureModifier {

    public IncreaseDefenseModifier(Game game, Creature creature){
        super(game, creature);
        game.queries.subscribe(q-> {
            if(q.creatureName.equals(creature.name) && q.argument == Query.Argument.DEFENSE){
                q.result += 3;
            }
        });
    }
//
//    @Override
//    public void handle() {
//        System.out.println("Increasing " + creature.name + "'s defense");
//        creature.defense += 3;
//        super.handle();
//    }
}
