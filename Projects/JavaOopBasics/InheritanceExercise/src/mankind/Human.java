package mankind;

public class Human {
    private static final String INVALID_FIRST_NAME_EXCEPTION = "Expected upper case letter!Argument: firstName";
    private static final String INVALID_FIRST_NAME_LENGTH_EXCEPTION = "Expected length at least 4 symbols!Argument: firstName";
    private static final String INVALID_LAST_NAME_EXCEPTION = "Expected upper case letter!Argument: lastName";
    private static final String INVALID_LAST_NAME_LENGTH_EXCEPTION = "Expected length at least 3 symbols!Argument: lastName";

    private String firstName;
    private String lastName;

    protected Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private void setFirstName(String firstName) {
        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException(INVALID_FIRST_NAME_EXCEPTION);
        }

        if (firstName.length() < 4) {
            throw new IllegalArgumentException(INVALID_FIRST_NAME_LENGTH_EXCEPTION);
        }

        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(INVALID_LAST_NAME_EXCEPTION);
        }

        if (lastName.length() < 3) {
            throw new IllegalArgumentException(INVALID_LAST_NAME_LENGTH_EXCEPTION);
        }

        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder human = new StringBuilder();

        human
                .append("First Name: ").append(this.firstName).append(System.lineSeparator())
                .append("Last Name: ").append(this.lastName);

        return human.toString();
    }
}
