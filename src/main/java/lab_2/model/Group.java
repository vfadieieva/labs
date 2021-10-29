package lab_2.model;

import java.util.List;
import java.util.Objects;

public class Group extends EducationalUnit {
    private List<Human> students;

    public List<Human> getStudents() {
        return students;
    }

    public void setStudents(List<Human> students) {
        this.students = students;
    }
    @Override
    public String toString(){
        return "Group name is " + title +
                ", Group leader`s name is " + manager +
                ", Students names are " + students;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return students.equals(group.students);
    }

    @Override
    public int hashCode() {

        return Objects.hash(students);
    }
}
