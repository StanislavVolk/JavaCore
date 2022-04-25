package Lesson_5;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class AppData
{
    public static void main(String[]args) throws FileNotFoundException
    {
        PrintWriter pw = new PrintWriter("src/main/java/Lesson_5/test.txt");
        StringBuilder sb = new StringBuilder();
        sb.append("Value 1");
        sb.append(';');
        sb.append("Value 2");
        sb.append(';');
        sb.append("Value 3");
        sb.append('\n');

        sb.append("100");
        sb.append(';');
        sb.append("200");
        sb.append(';');
        sb.append("123");
        sb.append('\n');

        sb.append("300");
        sb.append(';');
        sb.append("400");
        sb.append(';');
        sb.append("500");
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();

    }



}





