package Lesson_8;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import lombok.SneakyThrows;
import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
public class parseResponse
{

    private Response response;


    public parseResponse(){
        RestAssured.baseURI = "http://dataservice.accuweather.com/";
        response = given()
                .when()
                .get("forecasts/v1/daily/5day/332287?apikey=yODGgbTvYC5fkSQNmG0rOnvPB1V8vo89");


    }
    @SneakyThrows
    public List<Forecasts> getForecasts(){
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode jsonNode = objectMapper
                .readTree(response.asPrettyString())
                .at("/Forecasts");

        List<Forecasts> dailyForecasts = new ArrayList<>();

        if(jsonNode.isArray()){
            for (JsonNode arrayItem : jsonNode) {
                dailyForecasts.add(objectMapper.convertValue(arrayItem, Forecasts.class));
            }

        }

        return dailyForecasts;
    }
}
