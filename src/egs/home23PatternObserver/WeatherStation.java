package egs.home23PatternObserver;


public class WeatherStation {
    public static void main(String[] args) {
  WeatherData weatherData = new WeatherData();
   CurrentConditionsDisplay curr = new CurrentConditionsDisplay(weatherData);
  StatisticsDisplay stat = new StatisticsDisplay(weatherData);
   weatherData.setMeasurements(12F,15.87F,12.1F);

   weatherData.removeObserver(stat);
        System.out.println("________________________");
   weatherData.notifyObservers();

    }
}
