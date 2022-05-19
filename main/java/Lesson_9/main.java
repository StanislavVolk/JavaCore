package Lesson_9;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

interface Student {
    String getName();
    List<Course> getAllCourses();
}
interface Course {}

class CourseClass implements Course {
    String title;

    public CourseClass(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}

class StudentClass implements Student {
    private String name;
    private List<Course> courses;

    public StudentClass(String name, String courses) {
        this.name = name;
        this.courses = new ArrayList<Course>();
        for (String i: courses.split(", ")) {
            this.courses.add(new CourseClass(i));
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Course> getAllCourses() {
        return this.courses;
    }

    @Override
    public String toString() {
        return "Студент \'" + name + '\'' + ", записан на курсы = " + courses ;
    }
}
public class main
{
    static Set<String> task1(List<StudentClass> students) {
        return students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .collect(Collectors.toSet());
    }

    static List<Student> task2 (List<StudentClass> students) {

        List<Student> res = students.stream()
                .sorted((x,y) -> (int) (y.getAllCourses().size() - x.getAllCourses().size()) )
                .limit(3)
                .collect(Collectors.toList());
        return res;
    }

    static List<Student> task3 (List<StudentClass> students, String toFind) {

        List<Student> res = students.stream()
                .filter(x -> x.getAllCourses().toString().contains(toFind))
                .collect(Collectors.toList());
        return res;

    }

    public static void main(String[] args) {
        List<StudentClass> students = new ArrayList<>();
        students.add(new StudentClass("Student1", "cours1, cours2, cours3, cours4, cours5, cours6"));
        students.add(new StudentClass("Student2", "cours1, cours2, cours3, cours4, cours5"));
        students.add(new StudentClass("Student3", "cours1, cours2, cours3, cours4, cours5, cours6, cours7"));
        students.add(new StudentClass("Student4", "cours1, cours2, cours3, cours5, cours6"));
        students.add(new StudentClass("Student5", "cours1, cours2, cours3, cours5"));
        students.add(new StudentClass("Student6", "cours2, cours3, cours5"));
        students.add(new StudentClass("Student7", "cours2, cours3, cours5, cours8, cours9, cours10, cours11"));
        System.out.println("Students");
        students.stream().forEach(System.out::println);


        System.out.println("Task №1");
        System.out.println(task1(students));
        System.out.println(students.stream()
                .map(x -> x.getAllCourses())
                .flatMap(x->x.stream())
                .map(x-> x.toString())
                .distinct()
                .collect(Collectors.toList())
        );

        System.out.println("Task №2 ");
        task2(students).stream().forEach(System.out::println);

        System.out.println("Task №3");
        String COURSE_NAME = "cours6";
        task3(students,COURSE_NAME).stream().forEach(System.out::println);
    }
}
