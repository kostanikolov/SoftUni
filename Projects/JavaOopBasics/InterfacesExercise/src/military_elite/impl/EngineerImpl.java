package military_elite.impl;

import military_elite.contracts.Engineer;
import military_elite.contracts.Repair;

import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {
    private Set<Repair> repairs;

    public EngineerImpl(String id, String firstName, String lastName, double salary, String corps, Set<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = repairs;
    }

    @Override
    public String toString() {
        StringBuilder engineer = new StringBuilder(super.toString()).append(System.lineSeparator());

        engineer.append("Repairs:");

        for (Repair repair : repairs) {
            engineer
                    .append(System.lineSeparator())
                    .append("  ")
                    .append(repair);
        }

        return engineer.toString();
    }
}
