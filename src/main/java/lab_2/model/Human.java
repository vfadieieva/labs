package lab_2.model;

import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private String dateOfBirth;

    public void setName(String name){

        this.name = name;
    }
    public String getName(){

        return this.name;
    }

    public void setSurname(String surname) {

        this.surname = surname;
    }
    public String getSurname() {

        return this.surname;
    }

    public void setDateOfBirth(String dateOfBirth) {

        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {

        return this.dateOfBirth;
    }

    @Override
    public String toString(){
        String s;
        s = "\nName is " + this.name;
        s = s + "\tSurname is " + this.surname;
        s = s + "\tDate of birth is  " + this.dateOfBirth;
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && surname.equals(human.surname) && Objects.equals(dateOfBirth, human.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, dateOfBirth);
    }
}
