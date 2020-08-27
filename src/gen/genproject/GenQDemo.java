package gen.genproject;

public class GenQDemo {
    public static void main(String[] args) {
        int iNum;
        Integer[] i = new Integer[10];
        GenQueue<Integer> intGen = new GenQueue<>(i);
        try {
            for (int j = 0; j <5 ; j++) {
                System.out.println("Put " + j +" in queue ");
                intGen.put(j);
            }
        }catch (QueueFullException1 ex){
            System.out.println(ex);
        }
        System.out.println();
        try {
            for (int j = 0; j <6 ; j++) {
                System.out.print("get next number(Integer) in queue ");
                iNum = intGen.get();
                System.out.println(iNum);
            }
        }catch (QueueEmptyException1 ex){
            System.out.println(ex);
        }
        System.out.println();
        double dNum;
       Double[] d = new Double[10];
       GenQueue<Double> doubleGen = new GenQueue<>(d);
        try {
            for (int j = 0; j <5 ; j++) {
                System.out.println("Put " + (double) j/2 +" in queue ");
                doubleGen.put((double)j / 2);
            }
        }catch (QueueFullException1 ex){
            System.out.println(ex);
        }
        System.out.println();
        try {
            for (int j = 0; j <5 ; j++) {
                System.out.print("get next number(Double) in queue ");
                dNum = doubleGen.get();
                System.out.println(dNum);
            }
        }catch (QueueEmptyException1 ex){
            System.out.println(ex);
        }
    }
}
