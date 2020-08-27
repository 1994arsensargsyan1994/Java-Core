package myLamdaVirajena.lambdassilkainmethod.ssilkaexeplarclass;

public class HighTemp {
    private int iTemp;

    public HighTemp(int iTemp) {
        this.iTemp = iTemp;
    }
    boolean samTemp(HighTemp temp){
        return iTemp == temp.iTemp;
    }
    boolean lassThenTemp(HighTemp temp){
        return iTemp < temp.iTemp;
    }
}
