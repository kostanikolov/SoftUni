package military_elite.impl;

import military_elite.contracts.Spy;

public class SpyImpl extends BaseSoldier implements Spy {
    private String codeNumber;

    public SpyImpl(String id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public String toString() {
        StringBuilder spy = new StringBuilder(super.toString()).append(System.lineSeparator());

        spy.append(String.format("Code Number: %s", this.codeNumber));

        return spy.toString();
    }
}
