package chainofresponsibility;

public class Demo {

    public static void main(String[] args) throws Exception {
//        Creature goblin = new Creature("Goblin", 2, 2);
//        System.out.println(goblin);
//
//        CreatureModifier root = new CreatureModifier(goblin);
//
//        System.out.println("Let's double goblin's attack");
//        root.add(new DoubleAttackModifier(goblin));
//
//        root.add(new NoBonusesModifier(goblin));
//
//        System.out.println("Let's increase goblin's defense");
//        root.add(new IncreaseDefenseModifier(goblin));
//
//        root.handle();
//        System.out.println(goblin);
//
        Game game = new Game();
        Creature goblin = new Creature(game, "Goblin", 2, 2);

        System.out.println(goblin);

        // modifiers can be piled up
        IncreaseDefenseModifier icm = new IncreaseDefenseModifier(game, goblin);
        System.out.println(goblin);

        try (DoubleAttackModifier dam
                     = new DoubleAttackModifier(game, goblin))
        {
            System.out.println(goblin);
        }

    }

}
