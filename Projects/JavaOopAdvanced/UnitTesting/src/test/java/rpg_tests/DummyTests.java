package rpg_tests;

import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;
import rpg_lab.Hero;

public class DummyTests {

    @Test
    public void attackedTargetLosesHealth() {
        Dummy dummy = new Dummy(10, 10);
        dummy.takeAttack(5);

        Assert.assertEquals(5, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class) // Assert
    public void cannotAttackDeadDummy() {
        // Arrange
        Axe axe = new Axe(10, 10);
        Dummy dummy = new Dummy(10, 10);

        // Act
        axe.attack(dummy);
        axe.attack(dummy);
    }

    @Test
    public void deadDummyCanGiveXP() {
        Hero gosho = new Hero("Gosho", new Axe(10, 10));
        Dummy dummy = new Dummy(10, 10);

        gosho.attack(dummy);

        Assert.assertEquals(10, gosho.getExperience());
    }

    @Test(expected = IllegalStateException.class)
    public void aliveDummyCannotGiveXP() {

        Dummy dummy = new Dummy(20, 10);
        dummy.giveExperience();
    }
}
