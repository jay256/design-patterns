package singleton.serializationproblem;

import java.io.Serializable;

public class BasicSingleton implements Serializable {

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

    //fix for serialization problem
    protected Object readResolve(){
        return INSTANCE;
    }
}
