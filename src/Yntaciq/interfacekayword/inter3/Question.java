package Yntaciq.interfacekayword.inter3;

import java.util.Random;

public class Question implements SharedConstans {
    Random random = new Random();
    int ask() {
        int rob = (int) (100 * random.nextDouble());
        if (rob < 30){
            return  NO;
        }else if (rob< 60){
            return YES;
        }else if (rob < 75){
            return LATER;

        }else if (rob < 98){
            return SOON;
        }else
            return NEVER;
    }
}
