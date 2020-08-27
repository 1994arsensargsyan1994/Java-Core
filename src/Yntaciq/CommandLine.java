package Yntaciq;

public class CommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
            main();
        }
    }

    public static void main() {
        System.out.println("sa main medodne aranc String [] argsi");

    }
    }

