package se.iths.groupspring.model;

public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private String program;

    public Student() {
    }

    public Student(Long id, String firstName, String lastName, String program) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.program = program;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}

