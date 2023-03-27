package Algorithm.RecursiveCall;

public class Test2 {
    public int factorialFunc(int n){
        if(n <= 1)
            return n;
        return n * factorialFunc(n-1);
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        System.out.println(t.factorialFunc(5));
    }
}
