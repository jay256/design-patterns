package singleton.basicsingleton;

public class BasicSingleton {

    private BasicSingleton(){

    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance(){
        return INSTANCE;
    }

    private int value=0;

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
