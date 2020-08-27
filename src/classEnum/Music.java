package classEnum;

import animal.Cat;
import delety.IA;
import leson8.Figure;

public enum Music {
    CLASIC(5,"Clasic"),ROC(8,"Roc"),POP;
    private int i;
    private String namee;

    Music() {
    }

    public int getI() {
        return i;
    }

    public String getNamee() {
        return namee;
    }

    Music(int i, String namee) {
        this.i = i;
        this.namee = namee;
    }
    public  void foo(){
        System.out.println(Music.CLASIC.getI());
    }
}
