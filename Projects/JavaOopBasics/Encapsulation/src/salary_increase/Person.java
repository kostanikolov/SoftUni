package salary_increase;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private DecimalFormat format;

    public Person() {
        this.format = new DecimalFormat("#.0##################");
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this();
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(int bonus) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200.0));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100.0));
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                getFirstName(),
                getLastName(),
                this.format.format(this.getSalary()));
    }
}
