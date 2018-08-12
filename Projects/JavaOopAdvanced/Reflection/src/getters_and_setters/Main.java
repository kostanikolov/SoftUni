package getters_and_setters;

import reflection.Reflection;

import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Method> getters = new TreeSet<>(Comparator.comparing(Method::getName));
        Set<Method> setters = new TreeSet<>(Comparator.comparing(Method::getName));

        Class<Reflection> aClass = Reflection.class;
        Method[] methods = aClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("get")) {
                if (method.getParameterTypes().length == 0) {
                    getters.add(method);
                }

            } else if (method.getName().startsWith("set")) {
                setters.add(method);
            }
        }

        for (Method getter : getters) {
            System.out.printf("%s will return %s%n",
                    getter.getName(),
                    getter.getReturnType().getSimpleName());
        }

        for (Method setter : setters) {
            System.out.printf("%s and will set field of %s%n",
                    setter.getName(),
                    setter.getParameterTypes()[0].getSimpleName());
        }
    }
}
