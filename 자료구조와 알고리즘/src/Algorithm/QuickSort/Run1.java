package Algorithm.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Run1 {
    public static void main(String[] args) {
        QuickSort sObject = new QuickSort();
        ArrayList<Integer> testData = new ArrayList<>();
        for(int i=0; i<100; i++)
            testData.add((int)(Math.random()*100));
        System.out.println(sObject.sort(testData));
    }
}
