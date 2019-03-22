package chainofresponsibility;

public class Creature {

    private Game game;
    public String name;
    public int baseAttack, baseDefense;

    public Creature(Game game, String name, int attack, int defense){
        this.game = game;
        this.name = name;
        this.baseAttack = attack;
        this.baseDefense = defense;
    }

    public int getAttack(){
        Query query = new Query(name, Query.Argument.ATTACK, baseAttack);
        game.queries.fire(query);
        return query.result;
    }

    public int getDefense(){
        Query query = new Query(name, Query.Argument.DEFENSE, baseDefense);
        game.queries.fire(query);
        return query.result;
    }

    @Override
    public String toString() {
        return "Creature{" + "name='" + name + '\'' + ", attack=" + getAttack() + ", defense=" + getDefense() + '}';
    }
}
