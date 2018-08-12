package app;

import app.core.Engine;
import app.interfaces.Reader;
import app.interfaces.Repository;
import app.interfaces.Runnable;
import app.interfaces.Writer;
import app.io.ConsoleInputReader;
import app.io.ConsoleOutputWriter;
import app.models.Blob;
import app.observers.Subject;
import app.repositories.BlobRepository;
import app.utility.MutateBoolean;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ConsoleInputReader();
        Writer writer = new ConsoleOutputWriter();
        Repository<Blob> blobRepository = new BlobRepository();
        Subject subject = new Subject();
        MutateBoolean mutateBoolean = new MutateBoolean(false);

        Runnable engine = new Engine(reader, writer, blobRepository, subject, mutateBoolean);
        engine.run();
    }
}
