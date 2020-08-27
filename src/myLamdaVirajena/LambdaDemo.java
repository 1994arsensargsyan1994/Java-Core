package myLamdaVirajena;

import java.util.Random;

public class LambdaDemo {
    public static void main(String[] args) {
   MyNumber myNumber;
   myNumber = ()->123.5;
        System.out.println(myNumber.getValue());
        myNumber=()-> Math.random()*10;
        System.out.println(myNumber.getValue());
        System.out.println(myNumber.getValue());
    }
}
