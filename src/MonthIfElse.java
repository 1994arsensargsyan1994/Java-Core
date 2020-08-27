public class MonthIfElse {

    public static void main(String[] args) {
        int month = 4;
        String seson;
        if (month == 12 || month == 1 || month == 2)
        {
            seson = "Dmer";
        }
        else if  (month == 3 || month == 4 || month == 5)
        {
            seson = "Garun";
        }
       else if (month == 6 || month == 7 || month == 8)
        {
            seson = "Amar";
        }
        else if (month == 9 || month == 10 || month == 11)
        {
            seson = "Ashun";
        }
        else
            seson = "anhayt amis";
        System.out.println("April da "+ seson+ " e");
        System.out.println();
        System.out.println("----------------------------------------------------");
        int a ;

        boolean isTrue = false;
        for (a = 1;!isTrue; a++ ){
            System.out.printf("a = " + a );
            if (a == 11 )
            {
                isTrue = true;
            }
            System.out.println(isTrue);


        }
        System.out.println();
        System.out.println();
        System.out.println("_________________________________________________________________");
        int e,result = 1;
        for (int i = 0;i < 10;i++)
        {
            result = 1;
            e = i;
            while (e > 0)
            {
                result *= 2;
                e--;
            }
            System.out.println("2 astchan " + i +" havasar e "+ result);
        }
        System.out.println();
        System.out.println();
        System.out.println("_________________________________________________________________");



    }
}

