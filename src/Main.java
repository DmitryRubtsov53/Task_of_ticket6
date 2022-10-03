import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание к экзаменационному билету № 6 1-го курса Java");

        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("\n" + "Исходный массив: " + Arrays.toString(arr));
        System.out.println("Тербуется: Все четные числа увеличить на единицу. " +
                "\n" + "Возвратить кусок списка с 3-го по 7-й элемент включительно." );

        System.out.println ("Результат: " + makeList3to7 (arr));  // Вызов метода

    } // скобка метода main

    public static String makeList3to7 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                continue;
            } else {
                arr[i] = arr[i] + 1;
            }
        }
/*      *********************************************************************************************************
        String s = Arrays.toString (oddArr);
        System.out.println(s);             на консоль выводится: [1, 1, 3, 3, 5, 5, 7, 7, 9, 9, 11, 11, 13]
        System.out.println(s.substring (2, 6));
        return s.substring (2, 7);
        Такой способ не подходит, т.к. s.substring (2, 7) считает элементами и цифры, и пробелы, и запятые !!!
        Результат :  ", 1, 3"
        *********************************************************************************************************
*/
        int k = 0;
        int[] arr3to7 = new int[5];
        for (int j = 2; j < 7; j++) {
            arr3to7[k] = arr[j];
            k++;
        }
        return Arrays.toString (arr3to7);
    }

} // скобка class Main