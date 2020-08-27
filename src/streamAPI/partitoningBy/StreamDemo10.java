package streamAPI.partitoningBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        // partitioningBy (Predicate predicate)
        // partitioningBy (Predicate predicate,Collector downstream)
        // broke sequence elements any criteria a oan part set all element which satisfy condition  predicate(return true)
        // and tow part all which are not satisfy condition  predicate(return false)
        Map<Boolean, List<String>> map1 = Stream.of("ab","c","def","gh","ijk","i","mnop").
                collect(Collectors.partitioningBy(s->s.length()<=2));
        map1.entrySet().forEach(System.out::println);
        Map<Boolean,String>map2 = Stream.of("ab","c","def","gh","ijk","i","mnop").
                collect(Collectors.partitioningBy(s->s.length()<=2,Collectors.mapping(String::toUpperCase,Collectors.joining())));
        map2.entrySet().forEach(System.out::println);
    }
}
