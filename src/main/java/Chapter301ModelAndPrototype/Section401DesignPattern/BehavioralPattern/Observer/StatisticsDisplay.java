package Chapter301ModelAndPrototype.Section401DesignPattern.BehavioralPattern.Observer;

public class StatisticsDisplay implements Observer {
    
    public StatisticsDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }
}