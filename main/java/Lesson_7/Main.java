package Lesson_7;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;


public class Main
{
    @SneakyThrows
    public static void main(String[] args)
    {
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        Response response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89");

        System.out.println(response.asPrettyString());

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/Forecast");

        List<Forecast> forecasts = new ArrayList<>();

        if(jsonNode.isArray()){
            for (JsonNode arrayItem : jsonNode) {
                forecasts.add(objectMapper.convertValue(arrayItem,Forecast.class));
            }

        }

        for (Forecast forecast : forecasts)
        {
            System.out.println(forecast.getDate() + " максимальная темпиратура " +
                    forecast.getTemperature().getMaximum().getValue() + " минимальная темпиратура " +
                    forecast.getTemperature().getMinimum().getValue() + " " + forecast.getDay());
        }


    }
}
