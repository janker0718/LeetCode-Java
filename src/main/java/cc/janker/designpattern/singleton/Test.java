package cc.janker.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Constructor<InnerclassSingleton> declaredConstructor = InnerclassSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerclassSingleton innerclassSingleton = declaredConstructor.newInstance();
        InnerclassSingleton instance = InnerclassSingleton.getInstance();
        System.out.println(innerclassSingleton == instance);
    }
}
