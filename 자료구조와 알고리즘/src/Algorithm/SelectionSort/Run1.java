package Algorithm.SelectionSort;

import java.util.ArrayList;

public class Run1 {
    public static void main(String[] args) {
        ArrayList<Integer> testData = new ArrayList<>();
        for(int i=0; i<100; i++)
            testData.add((int)(Math.random()*100+1));
        SelectionSort sSort = new SelectionSort();
        System.out.println(sSort.sort(testData));
    }
}
