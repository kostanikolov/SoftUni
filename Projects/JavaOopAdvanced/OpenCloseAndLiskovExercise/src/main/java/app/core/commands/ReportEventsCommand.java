package app.core.commands;

import app.annotations.Inject;
import app.interfaces.Executable;
import app.utility.MutateBoolean;

public class ReportEventsCommand implements Executable {

    @Inject
    private MutateBoolean mutateBoolean;

    @Override
    public void execute() {
        this.mutateBoolean.setFlag(true);
    }
}
