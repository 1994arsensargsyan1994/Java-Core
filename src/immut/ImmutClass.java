package immut;

import leson8.dynamic.Stack;
import lesson10.LinkedList;

public class ImmutClass {
    public static void main(String[] args) {
  CV c = new CV("Loyer",5);
  People mark = new People("Mark","Delmi",25,c);
        System.out.println(mark);
        c.setExperienceYear(20);
        c.setProfession("programmer");
        System.out.println("c CV = "+ c);
        System.out.println("Mark = "+mark);

    }
}
class People {
    private final String name;
    private final String surName;
    private final int age;
    private final CV cv;

    public People(String name, String surName, int age, CV cv) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.cv = new CV(cv.getProfession(),cv.getExperienceYear());
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public CV getCv() {
        return cv;
    }
    private CV cloneCV(CV cv){
     return  new CV(cv.getProfession(),cv.getExperienceYear());
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", cv=" + cv +
                '}';
    }
}
class CV{
    private String  profession;
    private int experienceYear;

    public CV(String profession, int experienceYear) {
        this.profession = profession;
        this.experienceYear = experienceYear;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public String toString() {
        return "CV{" +
                "profession='" + profession + '\'' +
                ", experienceYear=" + experienceYear +
                '}';
    }
}

