package app.models.attacks;

import app.interfaces.Attack;
import app.models.Blob;

public class Blobplode implements Attack {

    @Override
    public void execute(Blob attacker, Blob target) {
        int sourceHealthAfterAttack = attacker.getHealth() - (attacker.getHealth() / 2);

        if (sourceHealthAfterAttack >= 1) {
            attacker.setHealth(sourceHealthAfterAttack);
        }

        target.setHealth(target.getHealth() - (attacker.getDamage() * 2));
    }
}
