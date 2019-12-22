package jc1;

import java.sql.Array;
import java.util.Arrays;

public class classMainTransformList {
    public static void main(String[] args) {

    /*
    * 1. Написать метод, который меняет два элемента массива местами
    * (массив может быть любого ссылочного типа);
        2. Написать метод, который преобразует массив в ArrayList;
    * */
        // Выводим массив строк
        TransformList<String> array_str = new TransformList<>("a","b", "c");
        System.out.println("array: " + Arrays.toString(array_str.getLs()));
        array_str.moveTwoElement();
        System.out.println("array: " + Arrays.toString(array_str.getLs()));
        System.out.println("array list: " + array_str.getArrayList() + " col: "+  array_str.getLengthArrayList());

        System.out.println("---------------------------------------------------");

        // Выводим массив чисел integer
        TransformList<Integer> array_int = new TransformList<>(1, 2, 3);
        System.out.println("array: " + Arrays.toString(array_int.getLs()));
        array_int.moveTwoElement();
        System.out.println("array: " + Arrays.toString(array_int.getLs()));
        System.out.println("array list: " + array_int.getArrayList() + " col: "+  array_int.getLengthArrayList());

        System.out.println("---------------------------------------------------");

        // Выводим массив чисел double
        TransformList<Double> array_double = new TransformList<>(1.0, 2.0, 3.0);
        System.out.println("array: " + Arrays.toString(array_double.getLs()));
        array_double.moveTwoElement();
        System.out.println("array: " + Arrays.toString(array_double.getLs()));
        System.out.println("array list: " + array_double.getArrayList() + " col: "+  array_double.getLengthArrayList());

    }

}
