package egs.home22Gitar;

public class GuitarSpec {
    private Builder builder;
    private  String model;
    private  int numStrings;
    private Type type;
    private Wood backWood;
    private Wood topWood;


    public GuitarSpec(Builder builder, String model,int  numStrings,Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.numStrings = numStrings;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "GuitarSpec{" +
                "builder=" + builder +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", backWood=" + backWood +
                ", topWood=" + topWood +
                '}';
    }
    public  boolean match(GuitarSpec otherSpec){
        if (builder != otherSpec.builder){
            return  false;
        }
        if (model != null && !model.equals("") && !model.equals(otherSpec.model)) {
            return false;
        }
        if (type != otherSpec.type){
            return  false;
        }
        if (backWood != otherSpec.backWood){
            return  false;
        }
        if (topWood != otherSpec.topWood){
            return  false;
        }
        return  true;
    }
}
