package auditorium.lesson13;

@FunctionalInterface
public interface PersonFactory<P> {

    P create(String name, String surname);

}
