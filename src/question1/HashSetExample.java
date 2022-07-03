package question1;

import java.util.*;

public class HashSetExample {

    public static void main(String[] args) {

        // Создаем массив с длиной 100
        int[] myArray = new int[100];

        // Через цикл заполняем числами от 1 до 100. Проверяем на четность.
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray));

        // Выводим массив в строку с помощью класса Arrays для проверки

        System.out.println();


        //создаем второй массив с размером 50 для переноса четных чисел
        int[] evenNumArray = new int[50];

        // Создаем переменную, которая хранит текущий индекс элемента второго массива.
        // Начальное значение присваиваем равное нулю
        int index = 0;

// проходим по первому массиву с помощью цикла for. Если i-й элемент четный, то добавить его во 2й массив
        for (
                int i = 1;
                i < myArray.length; ) {
            evenNumArray[index] = myArray[i];
            index++;
            i += 2;
        }

        // выводим массив в строку с помощью класса Arrays
        System.out.println(Arrays.toString(evenNumArray));

        System.out.println();

        for (int i = 0; i < evenNumArray.length; i++) {
            for (int j = i + 1; j < evenNumArray.length; j++) {
                if (evenNumArray[i] % 5 != 0) {
                    int temp = evenNumArray[i];
                    evenNumArray[i] = evenNumArray[j];
                    evenNumArray[j] = temp;
                }
            }
        }

        for (int i = 0; i < evenNumArray.length; i++) {
            for (int j = i + 1; j < evenNumArray.length; j++) {
                if (evenNumArray[i] % 5 != 0) {
                    int temp = evenNumArray[i];
                    evenNumArray[i] = evenNumArray[j];
                    evenNumArray[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(evenNumArray));


        LinkedHashSet<Integer> evenLinkedHashSet = new LinkedHashSet<Integer>();
        for (int i = 0; i < evenNumArray.length; i++) {
            evenLinkedHashSet.add(evenNumArray[i]);
        }

        System.out.println("---------------------------------");
        System.out.print(evenLinkedHashSet);
    }
}




