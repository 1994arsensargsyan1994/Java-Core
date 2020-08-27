package dynamicGeneric;

public class Main {
    public static void main(String[] args) {
        GenDynamic<Integer> gen = new GenDynamic<>();
        for (int i = 0; i <19 ; i++) {
            gen.add(i);
        }
        System.out.println(gen.get(18));
    }
}
