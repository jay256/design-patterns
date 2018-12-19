package factory.abstractfactory;

public class CoffeeFactory implements HotDrinkFactory {
    @Override
    public HotDrink prepare(int amount) {
        System.out.println(
          "grind some beans, boil water, pour "
          + amount + " ml, add cream and sugar, enjoy!"
        );
        return new Coffee();
    }
}
