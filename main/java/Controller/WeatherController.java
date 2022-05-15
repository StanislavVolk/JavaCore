package Controller;

import Model.WeatherResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.IOException;

public class WeatherController
    {
        private static ObjectMapper objectMapper = new ObjectMapper();
        private static String APPID = "ee32c14230d43810018cefaf51d2433f";
        public static WeatherResponse getWeatherFromCity(String city) throws IOException
        {
            String urlAddres = "http://api.openweathermap.org/data/2.5/forecast?q="+city+"&appid="+APPID+"&units=metric";
            try {
                OkHttpClient client = new OkHttpClient();

                Request request = new Request.Builder()
                        .url(urlAddres)
                        .build();
                okhttp3.Response response = client.newCall(request).execute();
                String res = response.body().string();
                WeatherResponse result = objectMapper.readValue(res, WeatherResponse.class);
                return result;

            }
            catch(Exception e)
            {
                return new WeatherResponse();
            }
        }
    }

