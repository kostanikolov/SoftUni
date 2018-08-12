package app.models.attacks;

import app.interfaces.Attack;
import app.models.Blob;

public class PutridFart implements Attack {

    @Override
    public void execute(Blob attacker, Blob target) {
        int currentHealth = target.getHealth();
        currentHealth -= attacker.getDamage();
        target.setHealth(currentHealth);
    }
}
