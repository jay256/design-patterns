package singleton.basicsingleton;

public class Demo {

    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
        System.out.println(singleton.getValue());
        BasicSingleton singleton1 = BasicSingleton.getInstance();
        System.out.println(singleton.getValue());
    }
}
