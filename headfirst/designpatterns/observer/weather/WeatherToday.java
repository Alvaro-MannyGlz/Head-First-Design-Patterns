package headfirst.designpatterns.observer.weather;

import java.util.*;

import headfirst.designpatterns.observer.weather.DisplayElement;
import headfirst.designpatterns.observer.weather.WeatherData;

public class WeatherToday implements Observer, DisplayElement {
  private float temperature;
  private float humidity;
  private float pressure;
  private float wind;
  private float dewPoint;
  private float uvIndex;
  private WeatherData weatherData;

  public WeatherToday(WeatherData weatherData) {
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(float temperature, float humidity, float pressure, 
                       float wind, float dewPoint, float uvIndex) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    // update wind, dewPoint, uvIndex
    this.wind = wind;
    this.dewPoint = dewPoint;
    this.uvIndex = uvIndex;
    display();
  }

  public void display() {
    System.out.println("Today's Weather:");
    System.out.println("Temperature: " + temperature + "F degrees");
    System.out.println("Humidity: " + humidity + "%");
    System.out.println("Pressure: " + pressure + " inHg");
    System.out.println("Wind: " + wind + " mph");
    System.out.println("Dew Point: " + dewPoint + "F degrees");
    System.out.println("UV Index: " + uvIndex);
  }
}