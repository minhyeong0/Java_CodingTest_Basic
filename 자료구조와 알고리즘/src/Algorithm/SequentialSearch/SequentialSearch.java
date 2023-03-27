package Algorithm.SequentialSearch;

import java.util.ArrayList;

public class SequentialSearch {

    public int searchFunc(ArrayList<Integer> dataList, Integer searchItem){
        for(int index=0; index<dataList.size(); index++)
            if(searchItem == dataList.get(index))
                return index;
        return -1;
    }


    public static void main(String[] args) {
        SequentialSearch sSearch = new SequentialSearch();
        ArrayList<Integer> testData = new ArrayList<>();

        for(int i=0; i<10; i++)
            testData.add((int)(Math.random()*100));
        System.out.println(testData);

        System.out.println(sSearch.searchFunc(testData, 99));
    }
}
