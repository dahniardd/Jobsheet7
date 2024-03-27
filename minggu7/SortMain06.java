package MergeSortTest;
import java.util.Scanner;

public class SortMain06 {
    public static void main(String[]args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting dengan merge sort");
        MergeSorting06 msort = new MergeSorting06();
        System.out.println("Data awal");
        msort.printArray(data);
        msort.mergeSort(data);
        System.out.println("setelah diurutkan");
        msort.printArray(data);
    }
}
