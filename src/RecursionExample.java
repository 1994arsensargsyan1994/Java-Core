public class RecursionExample {
    int values[];

    RecursionExample(int i) {
        values = new int[i];
    }

    //
    void printArray(int i) {

        if(i == 0) {
            return;
        } else {
            System.out.println("[" + (i - 1) + "] " + values[i - 1]);
            printArray(i - 1);
//            System.out.println("[" + (i - 1) + "] " + values[i - 1]);
        }

    }
}

class RecursionMain {

    private static final int num = 23;

    public static void main(String[] args) {

        RecursionExample rec = new RecursionExample(num);

        int j;

        for(j = 0; j <num; j++) {
            rec.values[j] = j;
        }

        rec.printArray(num);
    }

}
