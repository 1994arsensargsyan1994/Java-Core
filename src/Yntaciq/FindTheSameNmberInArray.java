package Yntaciq;

public class FindTheSameNmberInArray {
    public  static void findnumber(int[] array ,int []array1) {
        String  thesamnumber= "";
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j <array1.length; j++) {
                if (array[i] == array1[j]) {
                    thesamnumber += array[i];
                    thesamnumber += ",";
                }
                }
            }
        System.out.print(thesamnumber);
    }
        public  static  void printArray(int [] array){
            for (int i = 0; i <array.length ; i++) {
                System.out.print(array[i]+ " ");


        }
            System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[] {5,8,11,56,58,78,};
        int []array1 = new int[] {5,98,25,-56,98,54,56};
        printArray(array);
        printArray(array1);
       findnumber(array,array1);
    }
}
