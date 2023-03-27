package Algorithm.Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class Bag {

    public void knapsackFunc(Integer[][] objectList, double capacity){
        double totalValue = 0.0;
        double fraction = 0.0;

        Arrays.sort(objectList, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] item1, Integer[] item2) {
                return (item2[1] / item2[0]) - (item1[1] / item1[0]);
            }
        });

        for(int i=0; i<objectList.length; i++){
            //쪼갤 필요 없을때
            if(capacity - (double) objectList[i][0] > 0){
                capacity -= (double) objectList[i][0];
                totalValue += (double) objectList[i][1];
                System.out.println("무게: " + objectList[i][0] + ", 가치: " + objectList[i][1]);
            } else {
                fraction = capacity / (double) objectList[i][0];
                totalValue += (double) objectList[i][1] * fraction;
                System.out.println("무게: " + objectList[i][0] + ", 가치: " + objectList[i][1] + ", 비율: " + fraction);
                break;
            }
        }
        System.out.println("총 담을 수 있는 가치: " + totalValue);
    }

    public static void main(String[] args) {
        Bag gObject = new Bag();
        Integer[][] objectList = {{10,10},{15,12},{20,10},{25,8},{30,5}};
        gObject.knapsackFunc(objectList, 30.0);
    }
}
