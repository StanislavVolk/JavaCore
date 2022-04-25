package Lesson_5;

import java.io.ByteArrayInputStream;
import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        File file = new File("src/main/java/Lesson_5/test.txt");

        byte [] outData = {10, 20, 30, 40};

        ByteArrayInputStream in = new ByteArrayInputStream(outData);

        int someValue;
        int c = 0;

        while ((someValue = in.read()) != -1)
        {
            c++;
            System.out.println(someValue +" "+ c);
        }


    }

    //File file = new File()
}
