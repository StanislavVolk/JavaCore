package Lesson1.Cockshot;
import Lesson1.Gunner.Gunner;

public class Knife implements Cockshot
{
    private int distance;

    public Knife(int distance)
    {
        this.distance = distance;
    }

    @Override
    public void doIt(Gunner gunner)
    {
        gunner.chunk(distance);
        System.out.println();
    }
}
