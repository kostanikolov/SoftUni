package reflection;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)

            throws
            NoSuchMethodException,
            IllegalAccessException,
            InvocationTargetException,
            InstantiationException {

        Class<Reflection> aClass = Reflection.class;

        System.out.println(aClass);
        System.out.println(aClass.getSuperclass());

        Class[] interfaces = aClass.getInterfaces();

        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        //@Deprecated(Since="Java 9")
        //Reflection ref = aClass.newInstance();
        Reflection ref = aClass.getDeclaredConstructor().newInstance();
        System.out.println(ref);
    }
}
