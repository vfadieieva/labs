package lab_2.model;
import java.util.List;
import java.util.Objects;
public class Chair extends EducationalUnit {
    private List<Group> groups;
    public List<Group> getGroups()
    {
        return groups;
    }
    public void setGroups(List<Group> groups) {

        this.groups = groups;
    }
    @Override
    public String toString() {
        return "Chair name is " + title +
                ", Manager`s name is " + manager +
                ", Groups names are " + groups;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Objects.equals(groups, chair.groups);
    }
    @Override
    public int hashCode() {

        return Objects.hash(groups);
    } }
