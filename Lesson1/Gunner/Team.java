package Lesson1.Gunner;

public class Team
{
    String nameTeam;
    String nameTeam1;
    Gunner[] deadShot = new Gunner[4];


    public Team(String nameTeam, String nameTeam1, Gunner[] deadShot)
    {
        this.nameTeam1 = nameTeam1;
        this.nameTeam = nameTeam;
        this.deadShot = deadShot;
    }


    public String getNameTeame()
    {
        return "Название команды: " + nameTeam;
    }
    public String getNameTeame1()
    {
        return "Название команды: " + nameTeam1;
    }

    public Gunner[] getDeadShot()
    {
        return deadShot;
    }

    public void showResults()
    {
        for(Gunner g: deadShot)
        {
            g.showResult();

        }
    }

    public void showMembersFinishedCourse()
    {
        for(Gunner g: deadShot)
        {
            if(g.isOnDistance())
            {
                g.showResult();

            }
            else System.out.println("Главное не победа, главное участие!!!");
        }
        System.out.println();

    }
}
