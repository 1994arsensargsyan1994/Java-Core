public class Dowhile1 {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch , ingo, answer = 'S';
        do {
            System.out.println("Gtek tary A - Z diapazanum ");
            System.out.println("porceq Gushakel : ");
            ch =(char) System.in.read();
            do {                                                           // bacatrel
                ingo = (char) System.in.read();
            }
            while (ingo != '\n');
            if (ch == answer)
            {
                System.out.println("Shnorhavorovenq duq GUSHAKELEQ ");
            }
            else
                System.out.print("knereq petqe gtnenq tary ");
            if (ch < answer)
            {
                System.out.println("Knereq tvyal Tary gtnum e aybubeni verjum ");
                System.out.println("Krkin Pordzeq");


            }
            if (ch > answer)
            {
                System.out.println("Knereq tvyal Tary gtnum e aybubeni skzbum");
                System.out.println("Krkin Pordzeq");
            }

        }
        while (answer != ch);

    }
}
