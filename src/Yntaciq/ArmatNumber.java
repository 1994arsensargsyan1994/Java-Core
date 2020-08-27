package Yntaciq;

public class ArmatNumber {
    public  static  int armat (int number){
        if (number < 10){
            return  number;
        } else if (number % 9 == 0)
            return  9;
         else
              return  number % 9;
    }

    public static void main(String[] args) {
        System.out.println(armat(487 ));
    }
}
