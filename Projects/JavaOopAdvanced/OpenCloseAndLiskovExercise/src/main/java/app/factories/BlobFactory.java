package app.factories;

import app.interfaces.Attack;
import app.interfaces.Behavior;
import app.models.Blob;
import app.observers.Subject;

public final class BlobFactory {

    private BlobFactory() {
    }

    public static Blob create(String name, int health, int damage, Behavior behavior, Attack attack, Subject subject, boolean flag) {
        return new Blob(name, health, damage, behavior, attack, subject, flag);
    }
}
