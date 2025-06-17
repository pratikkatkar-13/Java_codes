public class MaxMinElementInArray {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89, 34};

        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) 
            {max = val;}
        }
        System.out.println("Maximum element: " + max);

        int min= Integer.MAX_VALUE;
        for (int val : arr) {
            if (val < min)
            { min = val;}
        }
        System.out.println("Maximum element: " + min);

    }
}
