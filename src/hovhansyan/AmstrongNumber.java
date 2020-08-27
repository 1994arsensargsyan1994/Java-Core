package hovhansyan;

public class AmstrongNumber {
    public static void main(String[] args) {
        for (int i = 0; i <10000 ; i++) {
            amstrong(i);
        }

    }
    public static  void    amstrong(int number) {
        int array[];
        int size = 0;
        int tmp = number;
        int temp2 = number;
        while (tmp != 0){
            tmp = tmp / 10;
            size ++;
        }
        array = new int[size];
        for (int i = 0; i <size ; i++) {
            array[i] = temp2 % 10;
            temp2 = temp2 / 10;
        }
        int newArray[] = new int[size];
        for (int i = 0; i <size ; i++) {
            newArray[i] = 1;
        }
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                newArray[i] = newArray[i] * array[i];
            }
        }
        int sum = 0;
        for (int a:newArray) {
            sum += a;
        }
        if (sum==number)
        {
            System.out.println("Amstrong number is : "+number);
        }
    }


}
