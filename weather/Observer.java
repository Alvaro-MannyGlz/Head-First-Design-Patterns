package headfirst.designpatterns.observer.weather;

public interface Observer {
	public void update(float temperature, float humidity, float pressure, 
                       float wind, float dewPoint, float uvIndex);
}
