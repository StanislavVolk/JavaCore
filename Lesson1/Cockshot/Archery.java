package Lesson1.Cockshot;
import Lesson1.Gunner.Gunner;

public class Archery implements Cockshot
{

    private int distance;

    public Archery(int distance)
    {
        this.distance = distance;
    }

    @Override
    public void doIt(Gunner gunner)
    {
        gunner.shot(distance);
        System.out.println();
    }

}
