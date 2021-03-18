package cc.janker.designpattern.singleton;

import java.io.*;

public class InnerclassSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        InnerclassSingleton instance = InnerclassSingleton.getInstance();
//        InnerclassSingleton instance1 = InnerclassSingleton.getInstance();
//        System.out.println(instance == instance1);
        InnerclassSingleton instance = InnerclassSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSerializable"));
        oos.writeObject(instance);
        oos.close();

        ObjectInputStream ios = new ObjectInputStream(new FileInputStream("testSerializable"));
        InnerclassSingleton o = (InnerclassSingleton) ios.readObject();
        System.out.println(instance == o);


    }
}

class InnerclassSingleton implements Serializable {


    private static final long serialVersionUID = -42L;

    private static class InnerclassHolder{
        private static InnerclassSingleton innerclassSingleton = new InnerclassSingleton();
    }
    private InnerclassSingleton(){
        if (InnerclassHolder.innerclassSingleton != null){
            throw new RuntimeException("单例不允许多个存在多个实例");
        }
    }

    public static InnerclassSingleton getInstance(){
        return InnerclassHolder.innerclassSingleton;
    }

    public Object readResolve(){
        return InnerclassSingleton.getInstance();
    }
}