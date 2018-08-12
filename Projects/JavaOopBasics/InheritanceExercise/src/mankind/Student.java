package mankind;

public class Student extends Human {
    private static final String INVALID_FACULTY_NUMBER_EXCEPTION = "Invalid faculty number!";

    private String facultyNumber;

    protected Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException(INVALID_FACULTY_NUMBER_EXCEPTION);
        }

        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder student = new StringBuilder();

        student
                .append(super.toString()).append(System.lineSeparator())
                .append("Faculty number: ").append(this.facultyNumber).append(System.lineSeparator());

        return student.toString();
    }
}
