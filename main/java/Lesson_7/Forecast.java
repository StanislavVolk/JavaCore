package Lesson_7;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


public class Forecast
{
    @JsonProperty(value = "Date")
    private String date;
    @JsonProperty(value = "EpochDate")
    private String epochDate;
    @JsonProperty(value = "Temperature")
    private Temperature temperature;
    @JsonProperty(value = "Day")
    private Day day;
    @JsonProperty(value = "Night")
    private Night night;
    @JsonProperty(value = "Sources")
    private List<String> sources;
    @JsonProperty(value = "MobileLink")
    private String mobileLink;
    @JsonProperty(value = "Link")
    private String link;

    @JsonIgnore
    private String dayData;
    @JsonIgnore
    private String timeData;
}
