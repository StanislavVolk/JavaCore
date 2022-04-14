package Lesson1.Gunner;

public interface Gunner
{
    void fire(int distance);
    void shot(int distance);
    void chunk(int distance);
    boolean isOnDistance();
    void showResult();
}
