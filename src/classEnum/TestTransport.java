package classEnum;

public class TestTransport {
    public static void main(String[] args) {
  //    Transport tp;
        for (Transport t: Transport.values()) {
            System.out.println(t+": "+t.getSped()+" max Sped");
        }

    }

}
