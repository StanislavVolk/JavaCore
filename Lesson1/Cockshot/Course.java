package Lesson1.Cockshot;
import Lesson1.Gunner.Gunner;
import Lesson1.Gunner.Team;

public class Course
{
    Cockshot[] cockshots;

    public Course(Cockshot[] cockshots)
    {
        this.cockshots = cockshots;
    }

    public void doIt(Team team)
    {
        Gunner[] deadShot = team.getDeadShot();
        if(deadShot.length > 0)
        {
            for (Gunner g: deadShot)
            {
                for (Cockshot c: cockshots)
                {
                    c.doIt(g);
                   // if (!g.isOnDistance()) break;
                }
                System.out.println("--------------------------------");
            }
        } else {
            System.out.println("Никто не пришел, все пытаются сделать ДЗ...");
            System.out.println();
        }
    }
}
