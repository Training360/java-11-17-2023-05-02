package training.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {
    public static void main(String[] args) {
        var url = "https://index.hu";
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            var count = client.send(request, HttpResponse.BodyHandlers.ofLines())
                    .body().filter(HttpClientDemo::containsIgnoreCaseMagyar).count();
            System.out.println("Count: %d".formatted(count));
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error download index main page", e);
        }
    }

    private static boolean containsIgnoreCaseMagyar(String line) {
        return line.toLowerCase().contains("magyar");
    }
}
