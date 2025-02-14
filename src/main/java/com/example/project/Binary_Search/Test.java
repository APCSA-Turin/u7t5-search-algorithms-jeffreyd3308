package com.example.project.Binary_Search;

public class Test {
    public static void main(String[] args) {
        int[] elements = {1, 3, 5, 7, 9, 11, 13};
        int target = 1;
        int expectedIndex = 0; 
        int actualIndex = BinarySearch.binarySearch(elements, target);
        System.out.println(actualIndex);
    }
}