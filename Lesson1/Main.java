package Lesson1;
import Lesson1.Gunner.*;
import Lesson1.Cockshot.*;

public class Main
{
    public static void main(String[] args)
    {

        Gunner[] gunners = {new People("Станислав"), new People("Валентин"), new People("Николай")};
        Cockshot[] cockshots = {new Shooting(900), new Knife(15), new Archery(200)};

        Team team = new Team("СТУДЕНТЫ", "Другая группа",gunners);


        System.out.println("Команда стрелков под названием: ");
        System.out.println(team.getNameTeame());
        System.out.println(team.getNameTeame1());

        System.out.println("*************************************");

        System.out.println("В команде присутствуют участники:");
        team.showResults();

        System.out.println("*************************************");

        Course course = new Course(cockshots);

        System.out.println("Стрелок целится и ...?");
        course.doIt(team);

        System.out.println("*************************************");

        System.out.println("Все попадания в преподавателя были точными???");
        team.showResults();

        System.out.println("*************************************");
        team.showMembersFinishedCourse();
        System.out.println("КОНЕЦ!!!");
    }
}
