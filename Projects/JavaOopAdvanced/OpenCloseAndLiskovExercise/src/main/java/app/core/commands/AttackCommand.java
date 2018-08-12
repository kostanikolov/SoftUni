package app.core.commands;

import app.annotations.Inject;
import app.interfaces.Executable;
import app.interfaces.Repository;
import app.models.Blob;

public class AttackCommand implements Executable {

    @Inject
    private String[] data;

    @Inject
    private Repository<Blob> blobRepository;

    @Override
    public void execute() {
        String attackerName = this.data[0];
        String targetName = this.data[1];

        Blob attacker = this.blobRepository.getByName(attackerName);
        Blob target = this.blobRepository.getByName(targetName);

        attacker.attack(target);
    }
}
