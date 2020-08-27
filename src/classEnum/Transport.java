package classEnum;

public enum Transport {
    CAR(120),TRUCK(80),AIRPLANE(600),TRAIN(60),BOTH(23);
    int sped;

    Transport(int sped)
    {
        this.sped = sped;
    }

    public int getSped()
    {
        return sped;
    }
}
