package singleton.enumbased;

import java.io.*;

public class Demo {

    static void saveToFile(EnumBasedSingleton singleton, String filename) throws IOException {
        try(FileOutputStream fileOut = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fileOut)){
            out.writeObject(singleton);
        }
    }

    static EnumBasedSingleton readFromFile(String filename) throws IOException, ClassNotFoundException {
        try(FileInputStream fileIn = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            return (EnumBasedSingleton) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "myfile.bin";

//        EnumBasedSingleton singleton = EnumBasedSingleton.INSTANCE;
//        singleton.setValue(111);
//        saveToFile(singleton, filename);

        EnumBasedSingleton singleton1 = readFromFile(filename);
        System.out.println(singleton1.getValue());
    }
}
