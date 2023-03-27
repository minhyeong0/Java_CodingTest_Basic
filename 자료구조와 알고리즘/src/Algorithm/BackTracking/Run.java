package Algorithm.BackTracking;

import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        NQueen nOjbect = new NQueen();
        nOjbect.dfsFunc(4, 0, new ArrayList<>());
    }
}
