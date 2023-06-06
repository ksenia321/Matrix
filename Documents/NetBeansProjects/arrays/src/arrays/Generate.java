/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Student
 */
public class Generate {

    public static int[][] generateArray(int[][] array, int min, int max) {
        for (int[] a : array) {
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * max + min);
            }
        }

        return array;
    }

    public static int[] generateArray(int[] array, int min, int max) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * max + min);

        }
        return array;
    }
}
