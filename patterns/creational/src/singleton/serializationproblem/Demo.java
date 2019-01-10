package singleton.serializationproblem;

import java.io.*;

public class Demo {

    static void saveToFile(BasicSingleton singleton, String filename) throws IOException {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(singleton);
        }
    }

    static BasicSingleton readFromFile(String filename) throws IOException, ClassNotFoundException {
        try(FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (BasicSingleton)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(123);
//        System.out.println(singleton.getValue());
//        BasicSingleton singleton1 = BasicSingleton.getInstance();
//        System.out.println(singleton1.getValue());
//
        String filename = "singleton.bin";
        saveToFile(singleton,filename);

        singleton.setValue(222);
        BasicSingleton singleton2 = readFromFile(filename);

        System.out.println(singleton == singleton2);
        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}
