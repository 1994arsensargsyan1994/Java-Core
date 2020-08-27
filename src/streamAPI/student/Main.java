package streamAPI.student;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", Speciality.PSYCHOLOGY, 1),
                new Student("Rika", Speciality.BIOLOGY, 4),
                new Student("Julia", Speciality.BIOLOGY, 2),
                new Student("Steve", Speciality.HISTORY, 4),
                new Student("Mike", Speciality.FINANCE, 1),
                new Student("Hinata", Speciality.BIOLOGY, 2),
                new Student("Richard", Speciality.HISTORY, 1),
                new Student("Kate", Speciality.PSYCHOLOGY, 2),
                new Student("Sergey", Speciality.COMPUTERSCIENCE, 4),
                new Student("Maximilian", Speciality.COMPUTERSCIENCE, 3),
                new Student("Tim", Speciality.COMPUTERSCIENCE, 5),
                new Student("Ann", Speciality.PSYCHOLOGY, 1)
        );
        students.stream().collect(Collectors.groupingBy(Student::getCurs))
                .entrySet().forEach(System.out::println);
        System.out.println();
        System.out.println("output alphabetical list speciality ");
        students.stream().map(Student::getSpeciality).distinct()
                .sorted(Comparator.comparing(Enum::name)).forEach(System.out::println);
        System.out.println();
        System.out.println("output count learning students each Speciality");
        students.stream().collect(Collectors.groupingBy(Student::getSpeciality,Collectors.counting())).forEach((s,count)->
                System.out.println(s+ ": "+count));
        System.out.println();
        System.out.println("Group students by speciality,keeping the alphabetical order ,and the group by course ");
        Map<Speciality,Map<Integer,List<Student>>> result = students.stream()
                .sorted(Comparator.comparing(Student::getSpeciality,Comparator.comparing(Enum::name))
                .thenComparing(Student::getCurs)).collect(Collectors.groupingBy(Student::getSpeciality, LinkedHashMap::new,
                        Collectors.groupingBy(Student::getCurs)));
        // now nice output the result
        result.forEach((s,map)->{
            System.out.println("-= "+s+" =-");
            map.forEach((year,list)-> System.out.format("%d: %s%n",year,list.stream()
            .map(Student::getName)
            .sorted()
            .collect(Collectors.joining(",")))
            );
            System.out.println();
        });
    }
}
