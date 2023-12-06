package org.example;

public class HW051223 {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 6, 8, 7, 9, 4, 3};
        int min = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            } else if (j < min1) {
                min1 = j;
            }
            else if (j<min2){
                min2 = j;
            }
        }
        System.out.println(min);
        System.out.println(min1);
        System.out.println(min2);
    }

}