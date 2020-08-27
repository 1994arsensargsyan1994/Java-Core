package streamAPI.student;

import java.util.Objects;

public class Student {
      String name;
    Speciality speciality;
     int curs;

    public Student(String name, Speciality speciality, int curs) {
        this.name = name;
        this.speciality = speciality;
        this.curs = curs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", speciality=" + speciality +
                ", curs=" + curs +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return curs == student.curs &&
                Objects.equals(name, student.name) &&
                speciality == student.speciality;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speciality, curs);
    }
}
