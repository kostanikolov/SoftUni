package coding_tracker;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tracker {

    @Author(name = "Kosta")
    public static void main(String[] args) {
        Tracker.printMethodsByAuthor(Tracker.class);
    }

    @Author(name = "Kosta")
    public static void printMethodsByAuthor(Class<?> cl) {
        Map<String, List<String>> methodsByAuthor = new HashMap<>();

        Method[] methods = cl.getDeclaredMethods();

        for (var method : methods) {
            Author annotation = method.getAnnotation(Author.class);

            if (annotation != null) {
                methodsByAuthor.putIfAbsent(annotation.name(), new ArrayList<>());
                methodsByAuthor.get(annotation.name()).add(method.getName() + "()");
            }
        }

        for (Map.Entry<String, List<String>> entry : methodsByAuthor.entrySet()) {
            System.out.printf("%s: %s%n",
                            entry.getKey(),
                            String.join(", ", entry.getValue()));

//            System.out.print(entry.getKey() + ": ");
//            System.out.println(String.join(", ", entry.getValue()));
        }
    }
}
