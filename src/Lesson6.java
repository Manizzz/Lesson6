import java.util.Arrays;
import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {

        //task 7
        int[] array = createArray();
        fillArray(array);
        printArray(array);

        //task 8
        System.out.println(maxNum(array));
        System.out.println(minNum(array));
        System.out.println(average(array));
        System.out.println(median(array));

        //task 9
        System.out.println(fibonacci(10));

        //task 10
        print("Itsila byte", (byte)1,(byte)2,(byte)3,(byte)9); //byte
        print("Itsila", new byte[] {});//byte empty array
        print("Itsila char", 'a','b','c'); //char
        print("Itsila", new char[]{}); //char empty array
        print("Itsila int", 1,2,3,9); //int
        print("Itsila", new int[]{}); //int empty array
        print("Itsila long", 123L, 3897L, 78995445L); //long
        print("Itsila",new long[]{}); //long empty array
        print("Itsila float", 1.23F, 38.97F, 7899.5445F); //float
        print("Itsila", new float[]{}); //float empty array
        print("Itsila double", 123.489, 38.97, 78.995445); //double
        print("Itsila", new double[]{}); //double empty array
        print("Itsila boolean", false, true, false, true); //boolean
        print("Itsila", new boolean[]{}); //boolean empty array
    }

    //task 7
    /**
     * Создает массив размера, введенного пользователем
     *
     * @return array новый пустой массив размерностью заданной пользователем
     */
    static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int inputRow = scanner.nextInt();
        return new int[inputRow];
    }

    /**
     * Заполняет массив данными, считанными с stdin
     * @param array массив для заполнения данными
     */
    static void fillArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i < array.length; i++) {
            System.out.print("Введите 'элемент " + (i + 1) +  " массива: ");
            int num = scanner.nextInt();
            array[i] = num;
        }
    }

    /**
     * Выводит данные массива на stdout
     * @param array массив, данные которого необходимо вывести
     */
    static void printArray (int[] array) {
        System.out.print("Массив элементов: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(" ");
    }

    //task8

    /**
     * Вычисляет максимальное число в массиве
     * @param array заполненный числами массив
     * @return максимальное число в массиве
     */
    static int maxNum (int[] array) {
        int maxNum = array[0];
        for (int num : array) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        return maxNum;
    }

    /**
     * Вычисляет минимальное число в массиве
     * @param array заполненный числами массив
     * @return минимальное  число в массиве
     */
    static int minNum (int[] array) {
        int minNum = array[0];
        for (int num : array) {
            if (num < minNum) {
                minNum = num;
            }
        }
        return minNum;
    }

    /**
     * Вычисляет среднее арифметическое массива с числами
     * @param array заполненный числами массив
     * @return среднее арифметическое массива
     */
    static float average (int[] array) {
        float average = 0;
        for (int num : array) {
            average += num;
        }
        return average / array.length;
    }

    /**
     * Вычисляет медианное число массива
     * @param array заполненный числами массив
     * @return медианное число массива
     */
    static float median (int[] array) {
        Arrays.sort(array);
        int j = array.length % 2;
        if (j != 0) {
            return array[array.length / 2];
        }
        else {
            return ((float)array[(array.length - 1) / 2] + (float)array[(array.length - 1) / 2 + 1]) / 2;
        }
    }

    //task 9
    /**
     * Вычисляет число последовательности Фибоначчи в позиции N
     * @param n номер позиции числа в последовательности Фибоначчи
     * @return вычисленное число
     */
    static long fibonacci (int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n - 2);
        }
    }

    static void print(String str, byte... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }

    static void print(String str, int... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (int num : array) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }

    static void print(String str, long... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (long num : array) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }

    static void print(String str, char... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (char chr : array) {
                System.out.print(chr + " ");
            }
        }
        System.out.println(" ");
    }

    static void print(String str, float... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (float num : array) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }

    static void print(String str, double... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (double num : array) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" ");
    }

    static void print(String str, boolean... array) {
        if (array.length == 0) {
            System.out.println(str);
        }
        else {
            for (boolean bool : array) {
                System.out.print(bool + " ");
            }
        }
        System.out.println(" ");
    }
}
