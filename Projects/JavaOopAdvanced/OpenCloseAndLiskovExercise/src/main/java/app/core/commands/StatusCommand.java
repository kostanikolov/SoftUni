package app.core.commands;

import app.annotations.Inject;
import app.interfaces.Executable;
import app.interfaces.Repository;
import app.interfaces.Writer;
import app.models.Blob;

public class StatusCommand implements Executable {

    @Inject
    private Repository<Blob> blobRepository;

    @Inject
    private Writer writer;

    @Override
    public void execute() {
        this.blobRepository
                .findAll()
                .forEach(blob -> this.writer.writeLine(blob.toString()));
    }
}
