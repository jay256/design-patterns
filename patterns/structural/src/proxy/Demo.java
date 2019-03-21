package proxy;

import java.lang.reflect.Proxy;

public class Demo {

    @SuppressWarnings("unchecked")
    public static <T>  T withLogging(T target, Class<T> itf){
        return (T) Proxy.newProxyInstance(
                itf.getClassLoader(),
                new Class<?>[] {itf},
                new LoggingHandler(target)
        );
    }

    public static void main(String[] args) {
        Car car = new CarProxy(new Driver(19));
        car.drive();

        Creature creature = new Creature();
        creature.setAgility(12);

        Person person = new Person();
        Human human = withLogging(person, Human.class);
        human.talk();
        human.walk();
        human.walk();
        human.talk();
        System.out.println(human);
    }
}
