package singleton.lazinessthreadsafety;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("initializing a lazy singleton");
    }

//    public static LazySingleton getInstance(){ // add synchronized for thread safety. has performance issues
//        if(instance == null){
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    //double-checked locking better method for thread safety
    public static LazySingleton getInstance(){
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
