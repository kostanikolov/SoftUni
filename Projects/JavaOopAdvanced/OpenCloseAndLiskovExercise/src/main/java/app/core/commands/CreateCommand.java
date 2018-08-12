package app.core.commands;

import app.annotations.Inject;
import app.factories.AttackFactory;
import app.factories.BehaviorFactory;
import app.factories.BlobFactory;
import app.interfaces.Attack;
import app.interfaces.Behavior;
import app.interfaces.Executable;
import app.interfaces.Repository;
import app.models.Blob;
import app.observers.Subject;
import app.utility.MutateBoolean;

public class CreateCommand implements Executable {

    @Inject
    private String[] data;

    @Inject
    private Repository<Blob> blobRepository;

    @Inject
    private Subject subject;

    @Inject
    private Boolean hasReportEvent;

    @Inject
    private MutateBoolean mutateBoolean;

    @Override
    public void execute() {
        String name = this.data[0];
        int health = Integer.parseInt(this.data[1]);
        int damage = Integer.parseInt(this.data[2]);
        String behaviorType = this.data[3];
        String attackType = this.data[4];

        Behavior behavior = BehaviorFactory.create(behaviorType);
        Attack attack = AttackFactory.create(attackType);

        Blob blob = BlobFactory.create(name, health, damage, behavior, attack, this.subject, this.mutateBoolean.getFlag());

        this.blobRepository.add(blob);
    }
}
