package Algorithm.RecursiveCall;

import java.util.ArrayList;

public class Test4 {

    public int factorialFunc(ArrayList<Integer> dataList){
        if(dataList.size() <= 0)
            return 0;
        return dataList.get(0) + factorialFunc(new ArrayList<>(dataList.subList(1, dataList.size())));
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        ArrayList<Integer> testData = new ArrayList<>();
        for(int data=0; data<10; data++)
            testData.add(data);
        System.out.println(t.factorialFunc(testData));
    }
}
