package Lesson_3;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"A", "B", "C"};
        swap(arr1, 1, 4);
        swap(arr2, 0, 2);
        String[] arrayOfStrings = {"A", "B", "C", "D"};
        asList(arrayOfStrings);
        Box<Orange> orange = new Box<>();
        Box<Apple> apple = new Box<>();
        orange.addFruit(new Orange(), 10);
        apple.addFruit(new Apple(), 8);
        System.out.println(orange.getWeight());
        System.out.println(apple.getWeight());
        System.out.println(orange.compare(apple));
    }

    public static void swap(Object[] arr, int n1, int n2)
    {
        System.out.println(Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1] = arr[n2];
        arr[n2] = sw;
        System.out.println(Arrays.toString(arr));
    }

    public static <T> void asList(T[] arr)
    {
        ArrayList<T> alt = new ArrayList<>(Arrays.asList(arr));
        System.out.println(alt);
    }
}