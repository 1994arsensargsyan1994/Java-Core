package job;

import java.io.Serializable;

public class Person  implements Serializable {
    private int age;
    private String where;
    private String name;
    private static Person[] array = new Person[10];
    private static int size = 0;

    public Person(int age, String where, String name) {
        this.age = age;
        this.where = where;
        this.name = name;
        addPerson(this);
    }

    private void addPerson(Person tmp) {
        if (size == array.length) {
            growPerson();
        }
        array[size++] = tmp;
    }

    private void growPerson() {
        Person[] temp = new Person[array.length * 3 / 2];
        System.arraycopy(array, 0, temp, 0, size);
        array = temp;
    }

    public static int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    public String getWhere() {
        return where;
    }

    public String getName() {
        return name;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public static Person[] getPersonsWhere(String where) {
        Person[] temp = new Person[size];
        int sizeTemp = 0;
        for (int j = 0; j < size; j++) {
            if (array[j].getWhere().equals(where)) {
                temp[sizeTemp++] = array[j];
            }
        }
        Person[] temp2 = new Person[sizeTemp];
        for (int i = 0; i < sizeTemp; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", where='" + where + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void printPersons(Person[] arrayTemp) {
        for (int i = 0; i < arrayTemp.length; i++) {
            System.out.println(arrayTemp[i].toString());
        }
    }

    public static Person[] getMaxAndMinAgePerson() {
        Person[] temp = new Person[size];
        int sizeOfTemp = 0;
        int max = 17;
        int min = 65;
        for (int i = 0; i < size; i++) {
            if (array[i].getAge() > max) {
                max = array[i].getAge();
            }
            if (array[i].getAge() < min) {
                min = array[i].getAge();
            }
        }
        for (int j = 0; j < size; j++) {
            if (max == array[j].getAge()) {
                temp[sizeOfTemp++] = array[j];
            }
            if (min == array[j].getAge()) {
                temp[sizeOfTemp++] = array[j];
            }
        }
        Person[] temp2 = new Person[sizeOfTemp];
        for (int i = 0; i < sizeOfTemp; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }

    public static void getArrayOfName() {
//        for (int i = 0; i < size; i++) {
//            for (int j = i + 1; j < size; j++) {
//                for (int k = 0; k < 3; k++) {
//                    if ((int) array[i].getName().charAt(k) < (int) array[j].getName().charAt(k)) {
//                        break;
//                    }
//                    if ((int) (array[i].getName().charAt(k)) > (int) (array[j].getName().charAt(k))) {
//                        Person temp = array[i];
//                        array[i] = array[j];
//                        array[j] = temp;
//                        break;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(array[i].toString());
//        }
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
           if (array[i].getName().compareToIgnoreCase(array[j].getName()) < 0){
               Person temp = array[i];
                       array[i] = array[j];
                       array[j] = temp;
                        break;
           }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].toString());
       }
    }
    public  static  void getArrayOfage(){
        for (int i = 0; i <size ; i++) {
            for (int j = i+1; j <size ; j++) {
                    if (array[i].getAge() > array[j].getAge()){
                        Person temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
            }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i].toString());
        }
        }
    public  static  Person[] getTheSamePerson(){
        Person []temp= new Person[size];
        int sizeOfTemp =0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (array[i].getName().equals(array[j].getName())) {
                    temp[sizeOfTemp++] = array[j];
                }
            }
        }
        Person[] temp2 = new Person[sizeOfTemp];
        for (int i = 0; i <sizeOfTemp ; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }

}
