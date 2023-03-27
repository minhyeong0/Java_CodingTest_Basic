package Algorithm.QuickSort;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        if(dataList.size() <= 1)
            return dataList;
        else{
            int pivot = dataList.get(0);
            ArrayList<Integer> leftArr = new ArrayList<>();
            ArrayList<Integer> rightArr = new ArrayList<>();

            for(int index=1; index<dataList.size(); index++){
                if(dataList.get(index) > pivot)
                    rightArr.add(dataList.get(index));
                else
                    leftArr.add(dataList.get(index));
            }

            ArrayList<Integer> mergedArr = new ArrayList<>();

            mergedArr.addAll(sort(leftArr));
            mergedArr.addAll(Arrays.asList(pivot));
            mergedArr.addAll(sort(rightArr));

            return mergedArr;
        }
    }
}
