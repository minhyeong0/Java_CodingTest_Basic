package Algorithm.BubbleSort;

import java.util.ArrayList;
import java.util.Collections;

public class BubbleSort {
    public ArrayList<Integer> sort(ArrayList<Integer> dataList){
        for(int index1 = 0; index1<dataList.size()-1; index1++){
            boolean swap = false;

            for(int index2=0; index2<dataList.size()-1-index1; index2++){
                if(dataList.get(index2) > dataList.get(index2+1)){
                    Collections.swap(dataList, index2, index2+1);
                    swap = true;
                }
            }
            if(swap == false) break;
        }
        return dataList;
    }
}
