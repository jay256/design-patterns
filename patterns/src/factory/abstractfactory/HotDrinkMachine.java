package factory.abstractfactory;

import javafx.util.Pair;
import org.reflections.Reflections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HotDrinkMachine {
    private List<Pair<String, HotDrinkFactory>> namedFactories = new ArrayList<>();

    public HotDrinkMachine() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Set<Class<? extends HotDrinkFactory>> types = new Reflections("").getSubTypesOf(HotDrinkFactory.class);

        for (Class<? extends HotDrinkFactory> type : types) {
            namedFactories.add(new Pair<>(
                    type.getSimpleName().replace("Factory", ""),
                    type.getDeclaredConstructor().newInstance()
            ));
        }

    }

    public HotDrink makeDrink() throws IOException {
        System.out.println("Available drinks: ");
        for (int i = 0; i < namedFactories.size(); i++) {
            Pair<String, HotDrinkFactory> item = namedFactories.get(i);
            System.out.println("" + i + ": " + item.getKey());
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s;
            int i, amount;
            if ((s = reader.readLine()) != null
                    && (i = Integer.parseInt(s)) >= 0
                    && i < namedFactories.size()
                    ) {
                System.out.println("Specify amount:");
                s = reader.readLine();
                if(s!=null && (amount=Integer.parseInt(s))>0){
                    return namedFactories.get(i).getValue().prepare(amount);
                }
            }
        }
    }
}
