import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.logging.Logger;

public class WeatherService {
    private static final Logger logger = Logger.getLogger(WeatherService.class.getName());

    public void getWeather(String city) {
        try {
            String url = "https://wttr.in/" + city + "?format=3";
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
            
            logger.info("Fetching weather for: " + city);
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            
            if (response.statusCode() == 200) {
                System.out.println("\n--- Weather Report ---");
                System.out.println(response.body());
                logger.info("Weather fetched successfully.");
            } else {
                System.out.println("City not found or network issue.");
                logger.warning("Failed to fetch weather. Status: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("Error: Could not fetch weather. Check your internet.");
            logger.severe("Exception in WeatherService: " + e.getMessage());
        }
    }
}