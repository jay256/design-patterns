package factory.abstractfactory;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Demo {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, IOException {
        HotDrinkMachine hotDrinkMachine = new HotDrinkMachine();
        HotDrink drink = hotDrinkMachine.makeDrink();
        drink.consume();
    }
}
