package country;

public abstract class Country {
    private String name;
    private long population;
    private double area;
    private double gdp;
    private String capital;

    abstract void government();

    public Country(String name, long population, double area, double gdp, String capital) {
        this.setName(name);
        this.setPopulation(population);
        this.setArea(area);
        this.setGdp(gdp);
        this.setCapital(capital);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            int a = name.charAt(i) + 0;
            if (a < 65 || (a > 90 && a < 97) || a > 122) {
                System.out.println("name cannot contain characters!!! ");
                return;
            }
        }
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        if (population < 25) {
            System.out.println("something is wrong");
            return;
        }
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        if (area < 0.44) {
            System.out.println("Have not country of that area size");
            return;
        }
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        if (gdp < 0) {
            System.out.println(")) are you  Armenia?");
            return;
        }
        this.gdp = gdp;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        for (int i = 0; i < capital.length(); i++) {
            int a = capital.charAt(i) + 0;
            if (a < 65 || (a > 90 && a < 97) || a > 122) {
                System.out.println("capital cannot contain characters!!! ");
                return;
            }
        }
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ", capital='" + capital + '\'' +
                '}';
    }
}
