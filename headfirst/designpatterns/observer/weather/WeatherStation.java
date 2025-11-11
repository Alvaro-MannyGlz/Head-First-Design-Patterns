package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		WeatherToday weatherToday = new WeatherToday(weatherData);

		// Parameters: (Temp, Humidity, Pressure, Wind, DewPoint, UVIndex)

		// Update 1: Warm, Mild Wind, Moderate UV
		weatherData.setMeasurements(80, 65, 30.4f,  10.0f, 62.0f, 5.0f); 

		// Update 2: Hotter, Humid, Strong Wind, High UV (Summer Day)
		weatherData.setMeasurements(82, 70, 29.2f,  25.5f, 75.2f, 8.5f);

		// Update 3: Cooler, Foggy/Humid, Low Wind, Low UV
		weatherData.setMeasurements(78, 90, 29.2f,   4.5f, 70.0f, 2.0f);
 
		weatherData.removeObserver(weatherToday);

		// Update 4: Cold Front, High Wind, No UV
		weatherData.setMeasurements(62, 90, 28.1f,  35.0f, 55.5f, 0.0f);
	}
}
