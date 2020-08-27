package classEnum;

public class TestCompany {
    public static void main(String[] args) {
        Company myCompany = Company.ITVDN;
        System.out.println(myCompany);
        int sal = myCompany.getVal();
        String curr = myCompany.getCurrency();
        System.out.println(sal + " "+curr);
        for (Company c:Company.values()) {
            System.out.println(c.name()+ ": "+c.toString());
        }
    }
}
