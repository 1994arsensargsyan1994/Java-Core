package myCollection.Mmcomarator;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String s, String t1) {
        String aStr,bStr;
        aStr = s;
        bStr = t1;
        return bStr.compareTo(aStr); //- hakarak , aStr.compareTo(bStr) chish dasavorutyun
    }
}
