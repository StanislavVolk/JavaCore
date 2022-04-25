package Lesson_5;
// Задание не доработанно, а точнее даже не начато.
// Пока просто игрался с возможными вариантами, очень интересно, но не успеваю из-за работы...
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
        File file = new File("src/main/java/Lesson_5/test.txt");


        try (BufferedReader reader = new BufferedReader(new FileReader(file)))
        {
            String str;
            while ((str = reader.readLine()) != null)
            {
                System.out.println(str);
            }

        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }

}
