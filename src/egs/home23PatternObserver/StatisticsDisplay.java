package egs.home23PatternObserver;

public class StatisticsDisplay implements Observer ,DisplayElement{
    float temp, humidity, pressure;
    Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(
                "StatisticsDisplay - temp: "  + temp + " humidity: "+
                        humidity + "pressure: "+pressure+
                        " avg = : "+ humidity/pressure
        );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
       this.temp = temp;
       this.humidity = humidity;
       this.pressure = pressure;
       display();
    }
}
