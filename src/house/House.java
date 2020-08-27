package house;

public class House {
    private String id;
    private  int countRooms;
    private  int flor;
    private double area;
    private static int size = 0 ;
    private static House [] array = new House[10];

    public House(String id, int countRooms, int flor, double area) {
        this.id = id;
        this.countRooms = countRooms;
        this.flor = flor;
        this.area = area;
        add();
    }
    private void add(){
        if (size == array.length){
            grow();
        }
        array[size++] = this;
    }

    public String getId() {
        return id;
    }

    public int getCountRooms() {
        return countRooms;
    }

    public int getFlor() {
        return flor;
    }

    public double getArea() {
        return area;
    }
    private  void grow(){
       House []temp = new House[array.length * 3 / 2];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }
    public  static House[] getRooms(int count){
        int sizeOfTemp = 0;
        House[] temp  = new House[size];
        for (int i = 0; i < size; i++) {
            if (array[i].getCountRooms() ==count){
                temp[sizeOfTemp++] = array[i];
            }
        }
        House [] temp2 = new House[sizeOfTemp];
        for (int i = 0; i <sizeOfTemp ; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }
    public  static House[] getRoomsAndFlor(int count,int firstFlor,int secondFlor){
        int sizeOfTemp = 0;
        House[] temp  = new House[size];
        for (int i = 0; i < size; i++) {
            if (array[i].getCountRooms() ==count && array[i].getFlor() <= secondFlor && array[i].getFlor()>= firstFlor){
                temp[sizeOfTemp++] = array[i];
            }
        }
        House [] temp2 = new House[sizeOfTemp];
        for (int i = 0; i <sizeOfTemp ; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }
    public  static House[] getAreaa(int countOfArea){
        int sizeOfTemp = 0;
        House[] temp  = new House[size];
        for (int i = 0; i < size; i++) {
            if (array[i].getArea() >=countOfArea){
                temp[sizeOfTemp++] = array[i];
            }
        }
        House [] temp2 = new House[sizeOfTemp];
        for (int i = 0; i <sizeOfTemp ; i++) {
            temp2[i] = temp[i];
        }
        return temp2;
    }
    public  static void getIdAlphabet(){
        for (int i = 0; i <size ; i++) {
            for (int j = i + 1; j < size; j++) {
                for(int k =0; k< 3; k++) {
                    if ((int) (array[i].getId().charAt(k)) < (int) (array[j].getId().charAt(k))) {

                        break;
                    }
                    if ((int) (array[i].getId().charAt(k)) > (int) (array[j].getId().charAt(k))) {
                        House temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;
                    }
                }
                }

            }
        for (int i = 0; i <size; i++) {
            System.out.println(array[i].getId());
        }
        }


    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", countRooms=" + countRooms +
                ", flor=" + flor +
                ", area=" + area +
                '}';
    }

}
