package org.example.bubblesortonarray;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1,5,30,15,50,6};
        BubbleSortOnArray bsa=new BubbleSortOnArray();
        bsa.bubbleSortAcending(arr);
        bsa.printBubbleSort(arr);

        bsa.bubbleSortDescending(arr);
        bsa.printBubbleSort(arr);
    }
}