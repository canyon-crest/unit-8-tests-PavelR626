package com.csplusplus;

public class Unit8 {

    // 1. Method to calculate the sum of all elements in a 2D array
    // Instructions: Traverse the 2D array and calculate the sum of all elements.
    public static int sumOfElements(int[][] array) {
    	int sum = 0;
        for(int i = 0;i < array.length;i++) {
        	for(int b = 0;b < array[0].length;b++) {
        		sum += array[i][b];
        	}
        }
        return sum;  // Placeholder return value
    }

    // 2. Method to count how many times a specific number appears in a 2D array
    // Instructions: Traverse the 2D array and count the number of times a specified value appears.
    public static int countOccurrences(int[][] array, int value) {
    	int times = 0;
        for(int i = 0;i < array.length;i++) {
        	for(int b = 0;b < array[0].length;b++) {
        		if(array[i][b] == value)
        			times++;
        	}
        }
        return times;  // Placeholder return value
    }

    // 3. Method to find the maximum element in a 2D array
    // Instructions: Traverse the 2D array and find the maximum element.
    public static int findMax(int[][] array) {
    	int max = Integer.MIN_VALUE;
        for(int i = 0;i < array.length;i++) {
        	for(int b = 0;b < array[0].length;b++) {
        		if(array[i][b] > max)
        			max = array[i][b];
        	}
        }
        return max;
    }

    // 4. Method to reverse the rows of the 2D array
    // Instructions: Reverse the rows of the 2D array (e.g., the first row becomes the last, etc.).
    public static void reverseRows(int[][] array) {
    	int[] temp;
        for(int i = 0;i < array.length/2;i++) {
        	temp = array[i];
        	array[i] = array[array.length-i-1];
        	array[array.length-i-1] = temp;
        }
    }

    // 5. Method to transpose a 2D array (swap rows and columns)
    // Instructions: Create and return a new 2D array that is the transpose of the input array.
    public static int[][] transpose(int[][] array) {
        int[][] newArr = new int[array[0].length][array.length];
        for(int i = 0;i < array.length;i++) {
        	for(int c = 0;c<array[0].length;c++) {
        		newArr[c][i] = array[i][c];
        	}
        }
        return newArr;
    }

    // 6. Method to fill a 2D array with random integers
    // Instructions: Create a 2D array of size numRows x numCols and fill it with random integers between min and max.
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        int[][] newArr = new int[numRows][numCols];
        for(int i = 0;i < newArr.length;i++) {
        	for(int c = 0;c<newArr[0].length;c++) {
        		newArr[i][c] = (int) Math.random() * max + min;
        	}
        }
        return newArr;  // Placeholder return value
    }
}