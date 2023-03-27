package Algorithm.RecursiveCall;


public class Test1 {

    public int factorialFunc(int n){
        if(n == 1)
            return n;
        else
            return n * factorialFunc(n-1);
    }



    public static void main(String[] args) {
        Test1 t = new Test1();
        System.out.println(t.factorialFunc(5));
    }
}