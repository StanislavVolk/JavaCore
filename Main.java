package Lesson2;

public class Main
{
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"0", "0", "0", "0"}, {"1", "1", "1", "1"},
                {"2", "2", "2", "2",}, {"3", "3", "k", "3"}};
        try
        {
            try
            {
                int result = method(arr);
                System.out.println(result);
            }
            catch (MyArraySizeException e)
            {
                System.out.println("Не корректный ввод в массив, превышено число символов.");

            }
        }
        catch (MyArrayDataException e)
        {
            System.out.println(" <--- Не корректное значение, должны быть цифры.");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i].length != 4)
            {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++)
            {
                try
                {
                    count = count + Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
                System.out.print(i + "\t");
            }
            System.out.println("");

        }
        return count;
    }
}
