package Algorithm.Greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin {
    public void coinFunc(Integer price, ArrayList<Integer> coinList){
        Integer totalCoinCount = 0;
        Integer coinNum = 0;
        ArrayList<Integer> detail = new ArrayList<>();

        for(int index=0; index<coinList.size(); index++){
            coinNum = price / coinList.get(index);
            totalCoinCount += coinNum;
            price -= coinNum * coinList.get(index);
            detail.add(coinNum);
            System.out.println(coinList.get(index)+"원: " + coinNum + "개");
        }
        System.out.println("총 동전 갯수: " + totalCoinCount);
    }

    public static void main(String[] args) {
        Coin gObject = new Coin();
        ArrayList<Integer> coinList = new ArrayList<>(Arrays.asList(500, 100, 50, 1));
        gObject.coinFunc(4720, coinList);
    }
}
