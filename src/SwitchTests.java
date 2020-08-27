public class SwitchTests {
    public static void main(String[] args) {

        int manth = 4;
        int target = 0;
        String seson;
        switch (manth) {
            case 12:
            case 1:
            case 2:
                seson = "Dmer";
                break;
            case 3:
            case 4:
                switch (target) {
                    case 1:
                        System.out.println("Target =  1");
                        break;
                    case 0:
                        System.out.println("Target =  0 / ");
                        break;
                }
            case 5:
                seson = "Garun";
                break;
            case 6:
            case 7:
            case 8:
                seson = "Amar";
                break;
            case 9:
            case 10:
            case 11:
                seson = "Dmer";
                break;


            default:
                seson = "anhaskanali amis";
        }
        //  System.out.println("April da "+ seson);
        boolean t = true;
        frst:
        {

            second:
            {

                tree:
                {

                    System.out.println("Mijev break aperatry");
                    if (t) {
                        break second;
                    }
                    System.out.printf(" sa chi tpi 1");
                }
                System.out.printf(" sa chi tpi");
            }
            System.out.printf(" sa kttpi");
        }
        System.out.println();
        System.out.println();
        System.out.println("_________________________________________________________________");
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.printf("itarecia " + i + ": ");
            for (int j = 1; j < 100; j++) {
                if (j == 10) {
                    break outer;
                }
                System.out.print(j + " ");

            }
            System.out.println(" sa chi tpi");

        }
        System.out.println(" Verj ciklin");
        System.out.println();
        System.out.println();
        System.out.println("_________________________________________________________________");
        oan:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue oan;
                }
                System.out.printf(" " + (j * i));

            }
        }
        System.out.println();


        System.out.println();
        System.out.println();
        System.out.println("_________________________________________________________________");
        boolean tmp = true;
        System.out.printf("Mijev rtun aperatry");

        if (tmp)     //ete paymany chdnenq kberi sxal qani vor retunic heto ka kod
            return;
        System.out.println("");
    }
}