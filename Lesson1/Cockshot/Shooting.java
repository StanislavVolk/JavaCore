package Lesson1.Cockshot;
import Lesson1.Gunner.Gunner;

public class Shooting implements Cockshot
{
    private int distance;

    public Shooting(int distance)
    {
        this.distance = distance;
    }

    @Override
    public void doIt(Gunner gunner)
    {
        gunner.fire(distance);
        System.out.println();
    }

}
