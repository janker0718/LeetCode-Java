package cc.janker.designpattern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSingletonTest {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
//        EnumSingleton instance = EnumSingleton.INSTANCE;
//        EnumSingleton instance1 = EnumSingleton.INSTANCE;
//        System.out.println(instance == instance1 );
//        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
//        declaredConstructor.setAccessible(true);
//        EnumSingleton enumSingleton = declaredConstructor.newInstance("haha", 0);
//        System.out.println(enumSingleton);

        EnumSingleton instance = EnumSingleton.INSTANCE;
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enumSerializable"));
        oos.writeObject(instance);
        oos.close();


        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("enumSerializable"));
        EnumSingleton o = (EnumSingleton) ios.readObject();
        System.out.println( instance == o);


    }

}
enum  EnumSingleton{
    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }


}