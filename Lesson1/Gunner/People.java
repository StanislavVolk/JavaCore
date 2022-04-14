package Lesson1.Gunner;

public class People implements Gunner
{


        String name;
        int shootingAtTheTeacher;
        int throwingKnives;
        int archeryShot;
        boolean onDistance;

        public boolean isOnDistance()
        {
            return onDistance;
        }

        public People(String name)
        {
            this.name = name;
            this.shootingAtTheTeacher = 1000;
            this.throwingKnives = 15;
            this.archeryShot = 200;
            this.onDistance = true;
        }

        public void fire(int distance)
        {
            if (distance <=shootingAtTheTeacher)
            {
                System.out.println(name + " " + " Стрельба из винтовки Мосина калибр 7,62х54 попал прямо в лоб!!!");
            }
            else
            {
                System.out.println(name + " " + " Промах");
                onDistance = false;
            }
        }

        public void chunk(int distance)
        {
            if (distance <= throwingKnives)
            {
                System.out.println(name + " " + " нож попадание в сердце!!!");
            }
            else
            {
                System.out.println(name + " " + "нож прошел мимо, незначительное ранение, отрезал мочку уха...");
                onDistance = false;
            }
        }

        public void shot(int distance)
        {
            if (distance <= archeryShot)
            {
                System.out.println(name + " " + " стрела угодила в глаз!!!");
            } else {
                System.out.println(name + " " + " стрела попала в пузо, результат не засчитан... (мимо)");

                onDistance = false;
            }
        }

    public void setName(String name)
    {
        this.name = name;
    }

    public void showResult()
        {
            System.out.println(name + ": " + onDistance);
        }


}
