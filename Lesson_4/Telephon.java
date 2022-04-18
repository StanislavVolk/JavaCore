package Lesson_4;
import java.util.*;

public class Telephon
{
    private static void Zadacha1()
    {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Ann Wade", "George Chambers", "Alpha",
                "Don Elliott", "Doris Roberts", "Alan Harper",
                "Eddie Marsh", "Clarence Collins", "Barbara Jones",
                "George James", "Maria Webb", "Alan Harper",
                "Doris Roberts", "Ann Wade", "Carolyn Carterr",
                "Eddie Marsh", "Christine Powell", "Patricia Woods", "Carolyn Carter"
        };

        for (int i = 0; i < words.length; i++)
        {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void Zadacha2()
    {
        Directory directory = new Directory();

        directory.add("Василиса Федотова", "8999123321");
        directory.add("Юрий Коновалов", "8912155326");
        directory.add("Софья Иванова", "8917155552");
        directory.add("Фёдор Митрофанов", "8913455672");
        directory.add("Александра Климова", "899999999");
        directory.add("Александра Климова", "899111111");
        directory.add("Максим Васильев", "89923231999");
        directory.add("Анастасия Алексеева", "8888123113");
        directory.add("Фёдор Емельянов", "8324325234");
        System.out.println(directory.get("Фёдор Емельянов"));
        System.out.println(directory.get("Юрий Коновалов"));
        System.out.println(directory.get("Александра Климова"));
        System.out.println(directory.get("Александра Климова"));
    }


    public static void main(String[] args)
    {
        Zadacha1();
        Zadacha2();
    }
}

class Directory
{
    private Map<String, List<String>> directoryHm = new HashMap<>();
    private List<String> phoneNumber;

    public void add(String surname, String phone_number)
    {
        if (directoryHm.containsKey(surname))
        {
            phoneNumber = directoryHm.get(surname);
            phoneNumber.add(phone_number);
            directoryHm.put(surname, phoneNumber);
        }
        else
        {
            phoneNumber = new ArrayList<>();
            phoneNumber.add(phone_number);
            directoryHm.put(surname, phoneNumber);
        }
    }

    public List<String> get(String surname) {
        return directoryHm.get(surname);
    }


}
