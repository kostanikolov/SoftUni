package black_box_integer;

import black_box_integer.com.BlackBoxInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    private static final String CLASS_PATH = "black_box_integer.com.";
    private static final String CLASS_NAME = "BlackBoxInt";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BlackBoxInt blackBoxInt;

        try {
            Class<?> blackBoxIntClass = Class.forName(CLASS_PATH + CLASS_NAME);

            Constructor<?> declaredConstructor = blackBoxIntClass.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            blackBoxInt = (BlackBoxInt) declaredConstructor.newInstance();

            String line;
            while (!"END".equals(line = reader.readLine())) {
                String[] tokens = line.split("_");

                String method = tokens[0];
                int operand = Integer.parseInt(tokens[1]);

                Method declaredMethod = blackBoxInt.getClass().getDeclaredMethod(method, int.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(blackBoxInt, operand);

                Field field = blackBoxInt.getClass().getDeclaredField("innerValue");
                field.setAccessible(true);

                System.out.println(field.get(blackBoxInt));
            }

        } catch (IOException
                | ClassNotFoundException
                | NoSuchMethodException
                | IllegalAccessException
                | InvocationTargetException
                | InstantiationException
                | NoSuchFieldException e) {

            e.printStackTrace();
        }
    }
}
