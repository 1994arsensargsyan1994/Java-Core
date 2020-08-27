package myLamdaVirajena.lambdassilkainmethod.ssilkaexeplarclass;

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[]val ,MyFunc<T>f,T v){
        int count=0;
        for (int i = 0; i <val.length ; i++) {
            if (f.func(val[i],v)){
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {
                new HighTemp(89),new HighTemp(82),
                new HighTemp(90),new HighTemp(89),
                new HighTemp(89),new HighTemp(91),
                new HighTemp(84),new HighTemp(83),
        };
        count = counter(weekDayHighs,HighTemp::samTemp,new HighTemp(89));
        System.out.println("day when max temp was 89 : "+count);
    }
}
