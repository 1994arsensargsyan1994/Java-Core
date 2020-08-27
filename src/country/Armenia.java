package country;

public class Armenia extends Country {
    @Override
    void government() {
        String firstFace = "Nikol Pashinyan";
        System.out.println("Unitary parliamentary \nPrime Minister is " + firstFace);
    }

    public Armenia(String name, long population, double area, double gdp, String capital) {
        super(name, population, area, gdp, capital);
    }
}
