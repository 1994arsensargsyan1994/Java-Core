package ClassIprov;

public class Car {
    private String model;
    private int maxSped;
    private int yerr;
    private  int spead;
    public  Car(){

    }
    public  Car(String model,int maxSped,int yerr,int spead){
        this.model = model;
        this.maxSped = maxSped;
        this.yerr = yerr;
        this.spead =spead;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSped() {
        return maxSped;
    }

    public void setMaxSped(int maxSped) {
        this.maxSped = maxSped;
    }

    public int getYerr() {
        return yerr;
    }

    public void setYerr(int yerr) {
        this.yerr = yerr;
    }

    public int getSpead() {
        return spead;
    }

    public void setSpead(int spead) {
        this.spead = spead;
    }
    public  void print(){
        System.out.println("Model - "+ model);
        System.out.println("maxSped - "+ maxSped);
        System.out.println("Sped - "+ spead);
        System.out.println("yerr - "+ yerr);
    }
}
