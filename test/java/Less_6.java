import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.IOException;

public class Less_6
{

    public static void main(String[] args) throws IOException {

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/332287?apikey=0OOjKgEwzkAAFMinvVQvevQpWVBykWio&language=ru")
                .build();

        okhttp3.Response response1 = client.newCall(request).execute();

        System.out.println(response1.body().string());


    }
}
