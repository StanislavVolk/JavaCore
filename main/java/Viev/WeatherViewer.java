package Viev;

import Controller.WeatherController;
import Model.WeatherResponse;
import java.io.IOException;
import java.util.Scanner;

public class WeatherViewer
{
    public static void consoleView(WeatherResponse data){
        System.out.println(data);
    }

    public static void processCity() throws IOException
    {

        while (true)
        {
            System.out.println("Введите город (для выхода из программы наберите 'exit')");
            Scanner sc = new Scanner(System.in);
            String city = sc.nextLine();
            if (city.equals("exit"))
            {
                break;
            } else {
                WeatherResponse weather = WeatherController.getWeatherFromCity(city);
                if (weather.isEmpty()) {
                    System.out.println("Такого города нет или данные по нему не могут быть предоставлены");
                } else {
                    consoleView(WeatherController.getWeatherFromCity(city));
                }
            }
        }
    }

}
