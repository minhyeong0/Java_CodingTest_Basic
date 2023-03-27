package Algorithm.MergeSort;

import java.util.ArrayList;

public class Run1 {
    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for(int i=0; i<4; i++)
            testData.add((int)(Math.random()*100));
        MergeSort mSort = new MergeSort();
        System.out.println(testData);
        System.out.println(mSort.mergeSplitFunc(testData));
    }
}
