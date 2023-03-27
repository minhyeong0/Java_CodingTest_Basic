package Algorithm.BackTracking;

import java.util.ArrayList;

public class NQueen {

    public boolean isAvailAble(ArrayList<Integer> candidate, int currentCol) {
        Integer currentRow = candidate.size();

        for(int index=0; index<currentRow; index++){
            if(candidate.get(index) == currentCol || Math.abs(candidate.get(index) - currentCol) == currentRow - index){
                return false;
            }
        }
        return true;
    }

    public void dfsFunc(Integer N, Integer currentRow, ArrayList<Integer> currentCandidate){
        if(currentRow == N){
            System.out.println(currentCandidate);
            return;
        }

        for(int index=0; index<N; index++){
            if(this.isAvailAble(currentCandidate, index) == true){
                currentCandidate.add(index);
                this.dfsFunc(N, currentRow+1, currentCandidate);
                currentCandidate.remove(currentCandidate.size() -1);
            }
        }
    }


}
