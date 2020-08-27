package Test.testtree;

public class R implements P,Q {
    @Override
    public String methodP() {
        return q + p;
    }

    @Override
    public String methodQ() {
        return p+q;
    }
}
