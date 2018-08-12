package weekdays;

public enum Weekday {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
                .append(super.name().toUpperCase().charAt(0))
                .append(super.name().substring(1).toLowerCase());

        return sb.toString();
    }
}
