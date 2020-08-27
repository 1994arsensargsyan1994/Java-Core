package cloune;

public class Main {
     public static void main(String[] args) {
        DollySheet dollySheet = new DollySheet();
        DollySheet dollySheet2= foo(dollySheet);
        dollySheet.setName("Dolly");
        dollySheet2.setName("Sheet");
        System.out.println(dollySheet.getName());
        System.out.println(dollySheet2.getName());
         System.out.println(dollySheet == dollySheet2);
    }

    public static DollySheet foo(DollySheet dollySheet1) {
        DollySheet sheet = null;
        try {
            sheet = (DollySheet) dollySheet1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheet;
    }
}
