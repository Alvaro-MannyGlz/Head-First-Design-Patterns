package headfirst.designpatterns.observer.weather;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f, 10.0f, 62.0f, 5.0f);
		weatherData.setMeasurements(82, 70, 29.2f, 25.5f, 75.2f, 8.5f);
		weatherData.setMeasurements(78, 90, 29.2f, 4.5f, 70.0f, 2.0f);
	}
}
