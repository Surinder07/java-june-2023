package aug31.optional;

import java.util.List;
import java.util.Optional;

public class Student {
    private int id;
    private String name;
    private String email;
    private List<String> subjects;

    public Student(int id, String name, String email, List<String> subjects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subjects = subjects;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}



/*

String name = null;
        if (name == null) {
            throw new IllegalArgumentException("Name not found!");
        } else
            name.toLowerCase();
 */