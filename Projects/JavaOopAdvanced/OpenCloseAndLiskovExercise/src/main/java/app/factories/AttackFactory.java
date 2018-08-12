package app.factories;

import app.interfaces.Attack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class AttackFactory {

    private static final String ATTACK_PATH = "app.models.attacks.";

    private AttackFactory() {
    }

    public static Attack create(String attackType) {
        Attack attack = null;

        try {
            Class<?> attackClass = Class.forName(ATTACK_PATH + attackType);
            Constructor<?> declaredConstructor = attackClass.getDeclaredConstructor();

            return (Attack) declaredConstructor.newInstance();

        } catch (ClassNotFoundException
                | NoSuchMethodException
                | IllegalAccessException
                | InstantiationException
                | InvocationTargetException e) {

            return attack;
        }
    }
}
